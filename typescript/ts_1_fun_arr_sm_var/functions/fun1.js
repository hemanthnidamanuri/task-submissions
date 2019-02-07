/*
- Define some functions
   Function with parameters - with return types
   Function with parameters - without return types
   Function without parameters - without return types
   Function without parameters - with return types
 */
// function with parameters - with return types
function withParameters(num, num1, s) {
    // body...
    var s;
    if (num1 % num == 0) {
        // code...
        s = 'true';
    }
    else {
        // code...
        s = 'false';
    }
    return s;
}
var result = withParameters(2, 4, 'check');
console.log(result);
// Function with parameters - without return types
function withoutReturnType(num) {
    // body...
    for (var i = 0; i < num; ++i) {
        // code...
        console.log(i);
    }
}
withoutReturnType(5);
//function without Parameters - without return types
function withoutParam() {
    // body...
    var firstcom = "duck married to buckless duck";
    var secondcom = "buckless duck got divorced from buck duck";
    console.log(firstcom + "  omg  " + secondcom);
}
withoutParam();
//Function without parameters - with return types
function wopwrt() {
    // body...
    var a = 25;
    var b = 25;
    if (a == b) {
        // code...
        return true;
    }
    else {
        // code...
        return false;
    }
}
var check_result = wopwrt();
console.log(check_result);
