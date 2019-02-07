/*
Create a function to check if a given year is a leap year or not that returns 
string “Leap Year” or “Not a Leap Year.

*/

function leaporNot(year:number) : boolean{

	if ((year % 4 ==0) && (year % 100 !=0) || (year % 400 ==0)) { 
		// code...
		return true;
	} else {
		// code...
		return false;
	}
}

var year : number  = 1993;
var result  = leaporNot(year);
if (result==true) { 
	// code...
	console.log(year + " is a leap year.")
} else {
	// code...
	console.log(year + " is not a leap year.")
}