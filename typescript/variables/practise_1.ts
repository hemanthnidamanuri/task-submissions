//normal declaration

var nam : String = "hemanth";
var age : number = 25;
var dobyear : number = 1993;
console.log(nam+","+age+","+dobyear);


//type assertion

var str : String = "hem";

var num :  number = <number><any> str;
console.log(num);

//inferred typeing

var nm = 1;
console.log(nm);
nm = 2;
console.log(nm);

//nm = 'hem';
// console.log(nm);

var st = "hem";

console.log(st);

st = "chng";

console.log(st);


//inferred cast

var n : number;
var nme : String;

n = 89;
nme = "hemanth"
console.log(n);
console.log(nme);

n = 100;
console.log(n);

nme = "nidamanuri";
console.log(nme);

//varibles scopes

var global_num = 89;

class Numbers{
	num_val = 30;
	static val = 12;

	dob(): void{
		var year_local = 1993;
		console.log('i am at top'+year_local)
	}

	iamGreat(): String{
		return "hemanth The programmer";
	}
}

console.log("global value"+global_num);
console.log("static value"+Numbers.val);
var numOBJ  = new Numbers();
numOBJ.dob();
console.log("class vairable:"+numOBJ.num_val)
console.log(typeof numOBJ);
var i : number = 0;
while(i<100){
let print : String  =	numOBJ.iamGreat();
console.log(print);
i++;
}
