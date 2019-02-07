interface Person{

	firstname : String;
	lastname  : String;
	sayhello  : () => String;
	add  : (num : number, num1 : number)=> void;
	sub : (num : number, num1 :  number)=>number;
}

var customer : Person = {

	firstname : "hemanth",
	lastname : "nidamanuri",
	sayhello  : () : String => {
		return "hellohemanth";
	},

	add(num : number, num1:number){
		console.log("4"+(num+num1))	 ;
	},
	sub(num : number, num1 : number){
		return (num-num1);
	}
}

console.log("1"+customer.firstname);
console.log("2"+customer.lastname);
console.log("3"+customer.sayhello());
customer.add(1,2);
console.log("5"+customer.sub(2,1));
