from django.contrib import admin

# Register your models here.
from django.contrib import admin
from app.models import *

admin.site.register(Dept)
admin.site.register(Emp)
admin.site.register(Salgrade)

