// This function clear all the values
function clearScreen() {
    document.getElementById("result").value = "";
   }
   

   function display(value) {
    document.getElementById("result").value += value;
   }

   function calculate() {
    var p = document.getElementById("result").value;
    if(p=="")
    {
        document.getElementById("result").value = "";  
    }
    else{
    var q = eval(p);
    document.getElementById("result").value = q;
    }
   }