
  //callback
  function getFile(resource,myCallback) {
    let req = new XMLHttpRequest();
    req.open('GET', resource);


    req.onload = function() {
      if (req.status === 200 && req.readyState === 4) {    
    const data = JSON.parse(req.responseText)
        myCallback(data);
      }
      else if(req.readyState === 4){
  
       myCallback("Error: " + req.status);
      
      }
      else {
           myCallback("Request not done");
      }
    }
    req.send();
  }
  
  
  console.log(1);
  
  console.log(2);

  getFile("todo.json",(some)=>{
    console.log(some);

    getFile("notes.json",(some)=>{
        console.log(some);
        
        getFile("list.json",(some)=>{
            console.log(some);
        
          });
    
      });

  }); 
  
  
  console.log(3);
  
  console.log(4);
  