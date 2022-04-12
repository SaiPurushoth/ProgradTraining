
function clearScreen() {
    document.getElementById("result").value = "";
   }
   

   function display(value) {
    document.getElementById("result").value += value;
   }

   function calculate() {
    let number = document.getElementById("result").value;
    if(number=="")
    {
        document.getElementById("result").value = "";  
    }
    else{
    document.getElementById("result").value =  eval(number);
    }
   }
   function sin() {
    document.getElementById("result").value = Math.sin(document.getElementById("result").value);

   }
   function cos() {
    document.getElementById("result").value = Math.cos(document.getElementById("result").value);

   }
   function tan() {
    document.getElementById("result").value = Math.tan(document.getElementById("result").value);

   }
   function log() {
    document.getElementById("result").value = Math.log(document.getElementById("result").value);

   }
   function sqrt() {
    document.getElementById("result").value = Math.sqrt(document.getElementById("result").value);

   }

