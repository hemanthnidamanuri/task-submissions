//normal declaration
var nam = "hemanth";
var age = 25;
var dobyear = 1993;
console.log(nam + "," + age + "," + dobyear);
//type assertion
var str = "hem";
var num = str;
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
//
var n;
var nme;
n = 89;
nme = "hemanth";
console.log(n);
console.log(nme);
n = 100;
console.log(n);
nme = "nidamanuri";
console.log(nme);
//varibles scopes
var global_num = 89;
var Numbers = /** @class */ (function () {
    function Numbers() {
        this.num_val = 30;
    }
    Numbers.prototype.dob = function () {
        var year_local = 1993;
        console.log('i am at top' + year_local);
    };
    Numbers.prototype.iamGreat = function () {
        return "hemanth The programmer";
    };
    Numbers.val = 12;
    return Numbers;
}());
console.log("global value" + global_num);
console.log("static value" + Numbers.val);
var numOBJ = new Numbers();
numOBJ.dob();
console.log("class vairable:" + numOBJ.num_val);
console.log(typeof numOBJ);
var i = 0;
while (i < 100) {
    var print_1 = numOBJ.iamGreat();
    console.log(print_1);
    i++;
}
