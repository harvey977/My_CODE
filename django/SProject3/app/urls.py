
from django.urls import path
from django.contrib.auth import views as auth_views
from . import views

urlpatterns = [
    path('', views.home, name='home'),
    path('add/', views.add_student, name='add'),
    path('edit/<int:id>/', views.update_student, name='edit'),
    path('delete/<int:id>/', views.delete_student, name='delete'),
    path('login/', auth_views.LoginView.as_view(template_name='app/login.html'), name='login'),
    path('logout/', auth_views.LogoutView.as_view(), name='logout'),
]
