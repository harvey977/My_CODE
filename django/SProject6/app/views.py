from django.shortcuts import render
from app.models import*
from django.db.models import *
from django.db.models.functions import Length 


# Create your views here.
def display_emp(request):
    QLEO=Emp.objects.filter(Q(ename__startswith='j') & Q(deptno=20))
    QLEO=Emp.objects.all()
    #   aggregates ------------------------------------------------
    ms=Emp.objects.aggregate(Max('sal'))
    print(ms)
    ms=Emp.objects.aggregate(maxs=Max('sal'))
    print(ms)
    print(ms['maxs'])
    MSED=Emp.objects.values('deptno').annotate(Max('sal'))
    print(MSED)
    MSED=Emp.objects.values('deptno').annotate(Max('sal'))
    print(MSED)
    MSED=Emp.objects.values('deptno').annotate(Max('sal')).filter(deptno=10)
    print(MSED)

    d={'QLEO':QLEO}
    return render(request,'display_emp.html',d)
def display_dept(request):
    
    QLDO=Dept.objects.all()
    d={'QLDO':QLDO}
    return render(request,'display_dept.html',d)


# -----------------------------------------------------------

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

# -------------------------------------------------------------

def depttoempprefetch(request):
    QSLDEO=Dept.objects.prefetch_related('emp_set').all()
    QSLDEO=Dept.objects.prefetch_related('emp_set').filter(dname__in=('accounting','testing'))
    QSLDEO=Dept.objects.prefetch_related(Prefetch('emp_set',queryset=Emp.objects.filter(sal__gt=3000)))


    d={'QSLDEO':QSLDEO}
    return render(request,'depttoempprefetch.html',d)