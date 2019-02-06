// Practice all inbuilt methods on string and arrays.
var str = "practise purpose";
var nameReg = /^[a-z ,.'-]+$/i;
//charAt() method
var length = str.length;
for (var i = 0; i < length; ++i) {
    // code...
    console.log(str.charAt(i));
}
//charCodeAt()
console.log("charCodeAt() methods values : " + str.charCodeAt(1));
//concat() method
var firstname = "hemanth";
var lastname = "nidamanuri";
var finalname;
finalname = firstname.concat(lastname);
console.log(finalname);
//indexOf
console.log("index of 'purpose' in string is =" + str.indexOf("purpose"));
//lastIndexOf
console.log("lastindexof = " + str.lastIndexOf("purpose"));
//localcompare
console.log("localcompare = " + str.localeCompare("test"));
//match
console.log("match() method = " + "00000".match(nameReg));
//replace()
var test = "hemants";
console.log("replace() replaces s with h in my name : " + test.replace("s", "h"));
