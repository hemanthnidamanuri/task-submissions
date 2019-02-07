var option = {
    program: "typescript", commandline: "hello"
};
console.log(option.program + "," + option.commandline);
option = { program: "typescript", commandline: ["hemanth", "nidamanuri"] };
console.log(option.program + "," + option.commandline[0] + "," + option.commandline);
option = { program: "typescript", commandline: function () { return "hi-fi"; } };
var fn = option.commandline;
console.log(fn());
