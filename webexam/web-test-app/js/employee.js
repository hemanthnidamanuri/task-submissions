
var urlPara =  new URLSearchParams(window.location.search);

var data = urlPara.getAll('id');

var emp_id  = data[0];

function getdetails() {
	// body...
	var txt = "";
	var xmlhttp = new XMLHttpRequest();

	 xmlhttp.onreadystatechange = function() {

	 	if (this.readyState == 4 && this.status == 200) {
	 		  var myObj = JSON.parse(this.responseText);
		      txt += "<table border='1'>"
		      txt += "<tr>"
		      txt += "<th>"+"id"+"</th>"
		      txt += "<th>"+"name"+"</th>"
		      txt += "<th>"+"username"+"</th>"
		      txt += "<th>"+"email"+"</th>"
		      txt += "<th>"+"address"+"</th>"
		      txt += "<th>"+"phone"+"</th>"
		      txt += "<th>"+"website"+"</th>"
		      txt += "<th>"+"company"+"</th>"
		      txt += "</tr>"

		        txt += "<tr>"
		        txt += "<td>"+ myObj.id + "</td>";
		        txt += "<td>"+ myObj.name + "</td>";
		        txt += "<td>"+ myObj.username + "</td>";
		        txt += "<td>"+ myObj.email + "</td>";
		        txt += "<td>"+ myObj.address.street +"</br>"+myObj.address.suite+"</br>"+myObj.address.city
		        +"</br>"+myObj.address.zipcode+"</br>"+myObj.address.geo.lat+"</br>"+myObj.address.geo.lng+"</td>";
		        txt += "<td>"+ myObj.phone + "</td>";
		        txt += "<td>"+ myObj.website + "</td>";
		        txt += "<td>"+ myObj.company.name+"</br>" + myObj.company.catchPhrase+"</br>"
		        + myObj.company.bs+"</br>"+ "</td>";
		        txt += "</tr>"
		      txt += "</table>"    
		      document.getElementById("det-id").innerHTML = txt;
	 	}
	 };

	 xmlhttp.open("GET", 'https://jsonplaceholder.typicode.com/users/'+emp_id, true);
	 xmlhttp.send();
}