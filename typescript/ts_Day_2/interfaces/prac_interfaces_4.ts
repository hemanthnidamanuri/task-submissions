interface namelist{

	[index:number]:string;
}

var names : namelist = ['hemanth','nidamanuri'];
console.log(names);

interface age{

	[index:string]:number;
}


var agedpeople : age;
agedpeople["buck"]  = 500;
agedpeople["duck"]  = 400;

console.log(agedpeople);