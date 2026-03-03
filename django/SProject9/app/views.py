from django.shortcuts import render
from django.http import HttpResponse
from .models import *

# Insert Topic
def insert_dept(request):
    if request.method == "POST":
        topic_name = request.POST.get('Topic')
        Topic.objects.get_or_create(topic_name=topic_name)
        return HttpResponse("Topic inserted successfully ✅")

    return render(request, "insert_dept.html")


# Insert Webpage
def insert_webpage(request):
    QLTO = Topic.objects.all()
    d = {'QLTO': QLTO}

    if request.method == "POST":
        tn = request.POST.get('topicname')   # SAFE
        na = request.POST.get('name')
        ur = request.POST.get('url')

        TO = Topic.objects.get(topic_name=tn)
        Webpage.objects.get_or_create(topic=TO, name=na, url=ur)

        return HttpResponse("Webpage inserted successfully 🚀")

    return render(request, "insert_webpage.html", d)


# Insert Access Record
def insert_accessrecord(request):
    QLWO = Webpage.objects.all()
    d = {'QLWO': QLWO}

    if request.method == "POST":
        nm = request.POST.get('name')
        at = request.POST.get('author')
        dt = request.POST.get('date')

        WO = Webpage.objects.get(id=nm)
        AccessRecord.objects.get_or_create(name=WO, author=at, date=dt)

        return HttpResponse("AccessRecord inserted 🎉")

    return render(request, "insert_accessrecord.html", d)


def show_data(request):
    topics = Topic.objects.all()
    webpages = Webpage.objects.all()
    access = AccessRecord.objects.all()

    return render(request, "show.html", {
        "topics": topics,
        "webpages": webpages,
        "access": access
    })
