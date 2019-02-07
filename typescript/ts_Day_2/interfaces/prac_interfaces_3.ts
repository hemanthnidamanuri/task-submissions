interface RuneOptions{
	program : string;
	commandline : string[] | string | (()=>string);
}

var option : RuneOptions = {
	program : "typescript", commandline : "hello"
};

console.log(option.program+","+option.commandline);
option = {program : "typescript",commandline : ["hemanth","nidamanuri"]};
console.log(option.program+","+option.commandline[0]+","+option.commandline);
option = {program:"typescript",commandline : () => {return "hi-fi";}};

var fn : any  = option.commandline;
console.log(fn());



