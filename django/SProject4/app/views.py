import email
from django.shortcuts import render

# Create your views here.
from django.http import HttpResponse
from app.models import Topic, Webpage


def insert_topic(request):
    tn = request.GET.get('topic')
    if not tn:
        return HttpResponse("Use: ?topic=Python")

    obj, created = Topic.objects.get_or_create(topic_name=tn)
    if created:
        return HttpResponse("Topic created")
    return HttpResponse("Topic already exists")


def insert_webpage(request):
    tn = request.GET.get('topic')
    name = request.GET.get('name')
    url = request.GET.get('url')
    email = request.GET.get('email')

    if not all([tn, name, url, email]):
        return HttpResponse(
            "Use: ?topic=Python&name=Docs&url=https://example.com&email=test@gmail.com"
        )

    try:
        topic_obj = Topic.objects.get(topic_name=tn)
    except Topic.DoesNotExist:
        return HttpResponse("Topic not found")

    obj, created = Webpage.objects.get_or_create(
        topic_name=topic_obj,
        name=name,
        url=url,
        email=email
    )

    if created:
        return HttpResponse("Webpage created")
    return HttpResponse("Webpage already exists")


def display_topics(request):
    QLTO = Topic.objects.all()
    return render(request, 'display_topics.html', {'QLTO': QLTO})


def display_webpages(request):
    QLWO = Webpage.objects.all()
    return render(request, 'display_webpages.html', {'QLWO': QLWO})

# def display_webpages(request):
#     QLWO=Webpage.objects.all()

#     d={'QLWO':QLWO}
#     return render(request)