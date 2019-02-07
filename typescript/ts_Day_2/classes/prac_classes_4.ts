// method overriding in typescript

class Print{

	print() : void{
		console.log("firs print statement:");
	}
}

class SecondPrint extends Print{
	print() : void{
		super.print();
		console.log("method overiden : second print statement");
	}
}

var obj = new SecondPrint();
obj.print();