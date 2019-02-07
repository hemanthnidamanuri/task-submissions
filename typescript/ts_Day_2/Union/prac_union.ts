
//Basix example:

console.log("basic example of union")
var clumse : number | String | boolean;
clumse = 89;
console.log("numerical value :"+clumse);
clumse = "hemanthnidamanuri";
console.log("String value:"+clumse);
clumse  = true;
console.log(clumse);
console.log("-------------------")

// union tyoe wth function parameter
function display(name : String | String[]) {
	// body...
	if (typeof name == "string") { 
		// code...
		console.log(name);
	} else {
		// code...
		for (var i = 0; i < name.length; i++) {
			// code...
			console.log(name[i]);
		}
	}
}

console.log("union type with function parameter:")
display("hemanth");
console.log("String array of names : ");
display(["hemanth","nidamanuri","89","MSIT"]);

//union type work with arrays,properties and interfaces to 

function arr(arr: number[] | String[]){

}

var a : number[] = [1,2];
var b : String[] = ["1","2"];


console.log(typeof a);
