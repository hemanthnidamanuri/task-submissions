class Shape  {
	
	area : number;
	constructor(area : number) {
		// code...
		this.area = area;
	}
}

class Circle extends Shape {
	display():void{
		console.log("area"+this.area);
	}
}

var obj = new Circle(150);
obj.display();
