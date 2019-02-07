
//Basic Example on tuple.
var tup = [];
tup[0] = 89;
tup[1] = "hemanth";
tup[2] = "nidamanuri";
console.log(tup);

//tuple operations

var mytuple = [89,"hemanth","nidamanuri","typeScript"]; 
console.log("Items before push "+mytuple.length)    // returns the tuple size 

mytuple.push("practise")                                    // append value to the tuple 
console.log("Items after push "+mytuple.length) 
console.log("Items before pop "+mytuple.length) 
console.log(mytuple.pop()+" popped from the tuple") // removes and returns the last item
  
console.log("Items after pop "+mytuple.length)