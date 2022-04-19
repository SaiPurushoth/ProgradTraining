const container = document.querySelector(".container");
      showHide = document.querySelectorAll(".showHidePw");
      pwFields = document.querySelectorAll(".password");
      signup = document.querySelector(".signup-text");
      login = document.querySelector(".login-text");

showHide.forEach(eyeIcon => {
    eyeIcon.addEventListener("click",()=>{
        pwFields.forEach(pwField => {
            if(pwField.type=="password")
            {
                pwField.type="text";
                showHide.forEach(icon=>{
                    icon.classList.replace("uil-eye-slash","uil-eye");
                })

            }
            else{
                pwField.type="password";
                showHide.forEach(icon=>{
                    icon.classList.replace("uil-eye","uil-eye-slash");
                })
            }
            
        });
    })
});

signup.addEventListener("click",( )=>{
    container.classList.add("active");
})
login.addEventListener("click",( )=>{
    container.classList.remove("active");
})



const form=document.getElementById('register');
const email = document.getElementById('email');
const age = document.getElementById('age');
const phone = document.getElementById('phone');



function checkInputs(){
   var eflag=0;
   var aflag=0;
   var pflag=0;
   const emailValue=email.value.trim();
    const ageValue=age.value.trim();
    const phoneValue=phone.value.trim();
    if(ValidateEmail(emailValue))
    {

        setSuccess(email);
    }
    else
    {
        setError(email,"Not Valid");   
        eflag=1;
    }
    if(ValidateAge(ageValue))
    {

        setSuccess(age);
    }
    else
    {
        setError(age,"Not Valid");   
        aflag=1;
    }
    if(ValidatePhone(phoneValue))
    {

        setSuccess(phone);
    }
    else
    {
        setError(phone,"Not Valid");   
        pflag=1;
    }

  if(eflag==1 || aflag==1 || pflag==1)
  {
	return false;
}
else{
	return true;
}
}

function ValidateEmail(mail) 
{
 if (/^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/.test(mail))
  {
    return (true);
  }
    return (false);
}

function setError(input,msg){
    const field=input.parentElement;
    const small=field.querySelector('small');
    small.innerText = msg;
    field.className="input-field error";
}

function setSuccess(input){
    const fiield=input.parentElement;
    fiield.className='input-field';
}


function ValidateAge(age) 
{
age = parseInt(age, 10);
 if (0<age && age<100)
  {
    return (true);
  }
    return (false);
}
function ValidatePhone(phone) 
{
    var phoneNum = phone.replace(/[^\d]/g, '');
 if (phoneNum.length > 6 && phoneNum.length < 11)
  {
    return (true);
  }
    return (false);
}
