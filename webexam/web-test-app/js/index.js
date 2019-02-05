
function change(){
	console.log("ok");
	setTimeout( ajx,1000);
}

function ajx(){
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
      txt += "<th>"+"viewDetails"+"</th>"
      txt += "</tr>"

      for (x in myObj) {
        txt += "<tr>"
        txt += "<td>"+ myObj[x].id + "</td>";
        txt += "<td>"+ myObj[x].name + "</td>";
        txt += "<td>"+ myObj[x].username + "</td>";
        txt += "<td>"+ myObj[x].email + "</td>";
        txt += "<td>"+ myObj[x].address + "</td>";
        txt += "<td>"+ myObj[x].phone + "</td>";
        txt += "<td>"+ myObj[x].website + "</td>";
        txt += "<td>"+ myObj[x].company + "</td>";
        txt += "<td>"+ '<a href="employesDetails.html?id='+myObj[x].id+' ">view</a>' + "</td>" 
        txt += "</tr>"
      }
      txt += "</table>"    
      document.getElementById("tit-chang").innerHTML = txt;
      }
};
xmlhttp.open("GET", "https://jsonplaceholder.typicode.com/users", true);
xmlhttp.send();
}