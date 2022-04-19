//spread operator

var num1 = [1,2,3]
var num2 = [...num1,4,5,6] //...(triple dot) - convert the array as 3 seperated values

function print(nums){
    console.log(nums);
}
print(num2);

function sum(a,b,c){
console.log(a+b+c);
}

sum(num1); // it will conisder a=num1[] , b ,c are undefined
sum(...num1); // split the values , so the values get assigned to a,b,c resp.


//object literals

var myName="sai";
var dept="cse"
// old type
var obj = {
    myName:myName,
    dept:dept,
    company:function(x){
        console.log("you are working in ${x}");  // $[x] is template string we can directly pass value in quotes
    }   
    };  

//new type
//no to mention member variables
var obj ={
myName,
dept,
company(x){
    console.log("you are working in ${x}");  // $[x] is template string we can directly pass value in quotes
}   
};

console.log(obj.company("presidio"));

//arrow functions 
//will not be connsidered as a block scope so outside scope variable can access inside the arrow functions

var obj = {
    myName:"sai",
    company(x){
      setTimeout(function(){
          console.log(this.name);  //  here the name is undefined due to current this reference cannot be accesed inside a function block
      },1000);
          
    }   
    };  

    var obj = {
        myName:"sai",
        company(x){
          setTimeout(()=>{
              console.log(this.name);  //  here it can be accessed easily
          },1000);
              
        }   
        };  