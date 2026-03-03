from django import forms
from app.models import *

class UserMF(forms.ModelForm):
    class Meta:
        model=User
        # fields='__all__'
        fields=['username','password','email']
        widgets={'password':forms.PasswordInput}
        help_texts={'username':''}
class ProfileMF(forms.ModelForm):
    class Meta:
        model=Profile
        # fields='__all__'
        fields=['profile_pic','address']

        
# '''
# While we are sending Parent Tables FOrm Object and
# Child Tables FOrm Object into same HTML page 
# then we should not represent Parent Tables column in 
# Input Elements
# '''