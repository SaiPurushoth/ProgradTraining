//user-defined higher order functions


function calculate(operation, initialValue, numbers) {
    let total = initialValue;
    for (const number of numbers) //variable of iterable
    {
      total = operation(total, number);
    }
    return total;
  }
  function sum(n1, n2) {
    return n1 + n2;
  }
  function multiply(n1, n2) {
    return n1 * n2;
  }
  calculate(sum, 0, [1, 2, 4]);      // => 7
  calculate(multiply, 1, [1, 2, 4]); // => 8

  

//in-built higher order functions


//Array filter()
const number = [45, 4, 9, 16, 25];
const over18 = number.filter(myFunction);

function myFunction(value, index, array) {
  return value > 18;
}


//Array map()
const numbers1 = [45, 4, 9, 16, 25];
const numbers2 = numbers1.map(myFunction);

function myFunction(value, index, array) {
  return value * 2;
}

//Array reduce

const numberss = [45, 4, 9, 16, 25];
let sum = numberss.reduce(myFunction);

function myFunction(total, value, index, array) {
  return total + value;
}

//Array forEach()

const numbers = [45, 4, 9, 16, 25];
numbers.forEach(myFunction);

function myFunction(value, index, array) {
  return value;
}

//Numeric Sort
const points = [40, 100, 1, 5, 25, 10];
points.sort(function(a, b){return a - b});