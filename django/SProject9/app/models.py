from django.db import models

# Create your models here.


# class Dept(models.Model):
#     deptno=models.IntegerField(primary_key=True)
#     dname=models.CharField(max_length=100,unique=True)
#     dloc=models.CharField(max_length=100)
# class Emp(models.Model):
#     empno=models.IntegerField(primary_key=True)
#     ename=models.CharField(max_length=100)
#     job=models.CharField(max_length=100)
#     mgr=models.ForeignKey('self',on_delete=models.SET_NULL,null=True,blank=True)
#     hiredate=models.DateField(auto_now_add=True)
#     sal=models.DecimalField(max_digits=10, decimal_places=2)
#     comm=models.DecimalField(max_digits=10, decimal_places=2,null=True,blank=True)
#     deptno=models.ForeignKey(Dept,on_delete=models.CASCADE)
# class Salgrade(models.Model):
#     grade=models.IntegerField(primary_key=True)
#     lowgrade=models.IntegerField()
#     highgrade=models.IntegerField()   



# ----------insert_webpage------------


class Topic(models.Model):
    topic_name = models.CharField(max_length=100, unique=True)

    def __str__(self):
        return self.topic_name


class Webpage(models.Model):
    topic = models.ForeignKey(Topic, on_delete=models.CASCADE)
    name = models.CharField(max_length=100)
    url = models.URLField()

    def __str__(self):
        return self.name


class AccessRecord(models.Model):
    name = models.ForeignKey(Webpage, on_delete=models.CASCADE)
    author = models.CharField(max_length=100)
    date = models.DateField()

    def __str__(self):
        return self.author
