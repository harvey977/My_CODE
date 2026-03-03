
from django.shortcuts import render, redirect, get_object_or_404
from django.contrib.auth.decorators import login_required
from .models import Student
from .forms import StudentForm

@login_required
def home(request):
    students = Student.objects.all()
    return render(request, 'app/home.html', {'students': students})

@login_required
def add_student(request):
    form = StudentForm(request.POST or None)
    if form.is_valid():
        form.save()
        return redirect('home')
    return render(request, 'app/form.html', {'form': form})

@login_required
def update_student(request, id):
    student = get_object_or_404(Student, id=id)
    form = StudentForm(request.POST or None, instance=student)
    if form.is_valid():
        form.save()
        return redirect('home')
    return render(request, 'app/form.html', {'form': form})

@login_required
def delete_student(request, id):
    student = get_object_or_404(Student, id=id)
    student.delete()
    return redirect('home')
