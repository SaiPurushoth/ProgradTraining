
//async and await
const getTodos = async ()=>{

    const response= await fetch("todo.json");
    const data = await response.json();
    
    return data;
}

console.log(1);
console.log(2);

getTodos().then((data)=>{
console.log(data);
}).catch((error)=>{
    console.log(error);   
});

console.log(3);
console.log(4);