from django.db import models

# Create your models here.

# Department Model
class Dept(models.Model):
    dept_name = models.CharField(max_length=100, primary_key=True)

    def __str__(self):
        return self.dept_name

# Employee Model
class Emp(models.Model):
    dept = models.ForeignKey(Dept, on_delete=models.CASCADE)
    emp_name = models.CharField(max_length=100)

    def __str__(self):
        return self.emp_name

# Salary Grade Model
class Salgrade(models.Model):
    employee = models.ForeignKey(Emp, on_delete=models.CASCADE)
    author = models.CharField(max_length=100)
    date = models.DateField()

    def __str__(self):
        return f"{self.employee.emp_name} - {self.author}"

# Bonus Model
class Bonus(models.Model):
    salgrade = models.ForeignKey(Salgrade, on_delete=models.CASCADE)

    def __str__(self):
        return str(self.salgrade)
    
# from django.db import models

# class Department(models.Model):
#     name = models.CharField(max_length=100)

#     def __str__(self):
#         return self.name


# class Employee(models.Model):
#     department = models.ForeignKey(Department, on_delete=models.CASCADE)
#     name = models.CharField(max_length=100)

#     def __str__(self):
#         return self.name


# class Salary(models.Model):
#     employee = models.ForeignKey(Employee, on_delete=models.CASCADE)
#     amount = models.IntegerField()
#     date = models.DateField()

#     def __str__(self):
#         return self.employee.name


# class Bonus(models.Model):
#     salary = models.ForeignKey(Salary, on_delete=models.CASCADE)
#     bonus_amount = models.IntegerField()

#     def __str__(self):
#         return str(self.bonus_amount)
