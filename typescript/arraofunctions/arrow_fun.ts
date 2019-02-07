/*
Arrow Function with parameters - with return types
Arrow Function with parameters - without return types
Arrow  Function without parameters - without return types
Arrow Function without parameters - with return types
*/

// Function with parameters - with return types

var multiplication = (num:number)=>{
	for (var i = 0; i < 20; ++i) {
		// code...
		return (num*i);
	}
}

var res = multiplication(15);
console.log(res);

   // Function with parameters - without return types

var details=(name :string,rollNo: number,age?:number)=>{
console.log("Name is:",name);
       console.log("roll number is :",rollNo);
       if(age!=undefined)
          console.log("Age is",age);
}
console.log("Details of first student :");
details("vamsi",100,23);
console.log("Details of second student :");
details("harshit",101);


var caught = (thief : String)=>{

	let name: String = "superman";
	if (thief==name) { 
		// code...
		console.log("thief name is superman");
	} else {
		// code...
		console.log("thief escape");
	}
}

caught("veerapan");

 // Function without parameters - without return types
var prnt=()=>{
console.log( "Function without parameters - without return types");
}
prnt();



// Function without parameters - with return types
var rnt=()=>{
return "Function without parameters - with return types";
}
console.log(rnt());
