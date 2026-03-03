from django.shortcuts import render
from app.forms import *
# Create your views here.
from django.http import HttpResponse,HttpResponseRedirect
from django.core.mail import send_mail
from django.contrib.auth import authenticate,login,logout
from django.urls import reverse
from django.contrib.auth.decorators import login_required


def registration(request):
    EUMFO=UserMF()
    EPMFO=ProfileMF()

    if request.method=='POST' and request.FILES:
        NMUMFDO=UserMF(request.POST)
        NMPMFDO=ProfileMF(request.POST,request.FILES)
        if NMUMFDO.is_valid() and NMPMFDO.is_valid():
            MUMFDO=NMUMFDO.save(commit=False)
            pw=NMUMFDO.cleaned_data['password']
            MUMFDO.set_password(pw)
            MUMFDO.save()
            #Done with User model 

            MPMFDO=NMPMFDO.save(commit=False)
            MPMFDO.username=MUMFDO
            MPMFDO.save()

            send_mail('Registration',
                      'Registration is Successfull',
                      'uditsingh345678@gmail.com',
                      [MUMFDO.email],
                      fail_silently=False)
            
            return HttpResponse('Registration is Successfull')
        
        else:
            print(NMUMFDO.errors)
            print(NMPMFDO.errors)
            return HttpResponse("Form Invalid")

    d={'EUMFO':EUMFO,'EPMFO':EPMFO}
    return render(request,'registration.html',d)




def home(request):
    if request.session.get('username'):
        username=request.session.get('username')
        d={'username':username}
        return render(request,'home.html',d)
    
    return render(request,'home.html')

def user_login(request):
    if request.method=='POST':
        username=request.POST['username']
        password=request.POST['password']
        AUO=authenticate(username=username,password=password)

        if AUO and AUO.is_active:
            login(request,AUO)
            request.session['username']=username
            return HttpResponseRedirect(reverse('home'))
        else:
            return HttpResponse('Invalid Credentials')

    return render(request,'user_login.html')

from django.contrib.auth.models import User
import random

def user_forget(request):
    if request.method == 'POST':
        username = request.POST['username']
        email = request.POST['email']

        try:
            user = User.objects.get(username=username, email=email)

            new_password = str(random.randint(100000,999999))
            user.set_password(new_password)
            user.save()

            send_mail(
                'Password Reset',
                f'Your new password is {new_password}',
                'uditsingh345678@gmail.com',
                [email],
                fail_silently=False
            )

            return HttpResponse("New password sent to your email")

        except User.DoesNotExist:
            return HttpResponse("Invalid Username or Email")

    return render(request,'user_forget.html')   


@login_required
def user_logout(request):
    logout(request)
    return HttpResponseRedirect(reverse('home'))

@login_required
def profile_display(request):
    username=request.session.get('username')
    UO=User.objects.get(username=username)
    PO=Profile.objects.get(username=UO)

    d={'UO':UO,'PO':PO}
    return render(request,'profile_display.html',d)


@login_required
def change_password(request):
    if request.method=="POST":
        cp=request.POST['cp']
        un=request.session.get('username')
        UO=User.objects.get(username=un)
        UO.set_password(cp)
        UO.save()
        return HttpResponse('Change password is SUCCESSFULL')
    
    return render(request,'change_password.html')
