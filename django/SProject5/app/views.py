from django.shortcuts import render
from app.models import*
from django.db.models import Q
# Create your views here.

def display_emp(request):
    QLEO=Emp.objects.filter(Q(ename__startswith='j') & Q(deptno=20))
    QLEO=Emp.objects.all()
    d={'QLEO':QLEO}
    return render(request,'display_emp.html',d)
def display_dept(request):
    
    QLDO=Dept.objects.all()
    d={'QLDO':QLDO}
    return render(request,'display_dept.html',d)

def emptodept(request):
    QLSEDO=Emp.objects.select_related('deptno').all()
    QLSEDO=Emp.objects.select_related('deptno').filter(sal__gt=2000)

    d={'QLSEDO':QLSEDO}
    return render(request,'EmpToDept.html',d)

def emptomgr(request):
    QSLEMO=Emp.objects.select_related('mgr').all()

    d={'QSLEMO':QSLEMO}
    return render(request,'EmpToMgr.html',d)

def emptodepttomgrjoin(request):
    QSLEDMO=Emp.objects.select_related('mgr').filter(deptno__dloc='chicago')

    d={'QSLEDMO':QSLEDMO}
    return render(request,'emptodepttomgrjoin.html',d)

