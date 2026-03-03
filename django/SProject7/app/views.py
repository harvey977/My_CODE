from django.shortcuts import render

# Create your views here.
from django.http import HttpResponse
from app.models import *


def display_webpages(request):
    QLWO = Webpage.objects.all()
    return render(request, 'display_webpages.html', {'QLWO': QLWO})

