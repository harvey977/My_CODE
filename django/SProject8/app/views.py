from django.shortcuts import render

# Create your views here.

from django.http import HttpResponse
from app.models import *
import email

def insert_dept(request):

    if request.method == 'POST':
        dno = request.POST['dno']
        dn = request.POST['dn']
        dl = request.POST.get('dl')  

        TDO = Dept.objects.get_or_create(
            deptno=dno,
            dname=dn,
            dloc=dl
        )

        if TDO[1]:
            return HttpResponse('object is created')
        else:
            return HttpResponse('object is present')

    return render(request, 'insert_dept.html')

