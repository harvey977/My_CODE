from django.urls import path
from . import views

urlpatterns = [
    path("insert_dept/", views.insert_dept),
    path("insert_webpage/", views.insert_webpage),
    path("insert_accessrecord/", views.insert_accessrecord),
    path("show/", views.show_data),

]
