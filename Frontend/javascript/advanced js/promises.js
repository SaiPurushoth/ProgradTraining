//promises
function getFile(resource) {


    return new Promise((resolve,reject)=>{
        let req = new XMLHttpRequest();
        req.open('GET', resource);
    
    
        req.onload = function() {
          if (req.status === 200 && req.readyState === 4) {    
        const data = JSON.parse(req.responseText)
            resolve(data);
          }
          else if(req.readyState === 4){
      
           reject("File Error: " + req.status);
          
          }
          else {
            reject("Request not done");
          }
        }
        req.send();
    });

  }
console.log(1);
console.log(2);
  getFile("todos.json").then((message)=>{
 console.log(message);
  }).catch((error)=>{
    console.log(error);
  });

  console.log(3);
  console.log(4);