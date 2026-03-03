from django.db import models

# Create your models here.
class Topic(models.Model):
    topic_name=models.CharField(max_length=100,primary_key=True)

class Webpage(models.Model):
    topc_name=models.ForeignKey(Topic,on_delete=models.CASCADE)
    name=models.CharField()
    url=models.URLField()

class AccessRecord(models.Model):
    name=models.ForeignKey(Webpage,on_delete=models.CASCADE)
    # sub_topic_name=models.CharField(max_length=100)
    # books=models.CharField(max_length=200)
    author=models.CharField(max_length=100)
    date=models.DateField()

