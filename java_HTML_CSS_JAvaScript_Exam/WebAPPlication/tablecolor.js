function check() {
	// body...
	var value = document.getElementById("inpt").value;
	var table = document.getElementById("tab1");
	var r,c,m,n;
	var colors = ['red','green','yellow','brown','gold','orange','blue','lightblue','lightgreen'];
	if (value.length>1) {
		//question 3
		var values  = value.split(",");
		for (var i = 0; i < values.length; i++) {
			var svalue = values[i];
			for (r = 0, n = table.rows.length; r < n; r++) {
		        for (c = 0, m = table.rows[r].cells.length; c < m; c++) {
		            if (table.rows[r].cells[c].innerText == svalue) {
		            	table.rows[r].cells[c].style.backgroundColor = colors[i];
		            } else {
		            	document.getElementById("not").innerHTML = "Table doesnt consist given value";
		            }
		        }
 	   		}
		}
		
	} else { 
		//question 2     
         for (r = 0, n = table.rows.length; r < n; r++) {
	        for (c = 0, m = table.rows[r].cells.length; c < m; c++) {
	            if (table.rows[r].cells[c].innerText == value) {
	            	table.rows[r].cells[c].style.backgroundColor = "lightgreen";
	            	break;
	            } else if(value.length==1 && table.rows[r].cells[c].innerText != value){
	            	document.getElementById("not").innerHTML = "Table doesnt consist given value";
	            }
	        }
 	   }

	}
}
