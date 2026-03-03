from django.contrib import admin

# Register your models here.

from django.contrib import admin
from app.models import *

# admin.site.register(Dept)
# admin.site.register(Emp)
# admin.site.register(Salgrade)


admin.site.register(Topic)
admin.site.register(Webpage)
admin.site.register(AccessRecord)
