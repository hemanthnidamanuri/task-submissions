
//basic example

class Vehicle  {

	wheels : string;
	
	constructor(wheels : string) {
		// code...
		this.wheels = wheels;
	}

	disp():void{
		console.log("wheels are:"+this.wheels);
	}
}

var obj = new Vehicle("mrf");
obj.disp();