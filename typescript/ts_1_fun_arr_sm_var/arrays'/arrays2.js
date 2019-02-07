// Define an empty string array and then add values and remove values from the array using (push and pop)
var arr = ['h', 'e', 'm', 'a', 'n', 't'];
var lnth = arr.push('h');
console.log("length of array is =" + lnth);
console.log("String elements in array are:");
for (var i = 0; i < arr.length; i++) {
    console.log(arr[i]);
}
var lett = arr.pop();
console.log("poped elemnts from array is = " + lett);
