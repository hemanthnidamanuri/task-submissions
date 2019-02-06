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