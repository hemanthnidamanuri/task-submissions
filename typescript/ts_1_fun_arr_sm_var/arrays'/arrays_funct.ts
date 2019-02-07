//Define some arrays and iterate using different loops.



var arr : number[] = new Array(10);

for (var i = 0; i < arr.length; ++i) {
	// code...
	arr[i] = i*2;
	console.log(arr[i]);
}

for (var i = arr.length - 1; i >= 0; i--) {
	console.log(arr[i]);
}

var alltype : any[] = new Array(5);

for (var i = 0; i < alltype.length; i++) {
	alltype[i] = "hem";
}

var ar : any[] = ['1',2,'3',4];
