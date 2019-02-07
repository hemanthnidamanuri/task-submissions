interface squareconfig{
	color ?: string;
	width ?: number;
	// height : number;
}

function createSquare(con : squareconfig) /*: {color : string; area : number}*/{
	// body...
	let newsquare = {color : "saffron", area : 200};
	if(con.color){
		newsquare.color = con.color;
	}
	if (con.width) {
		// code...
		newsquare.area = con.width * con.width;
	}

	return newsquare;
}

let mysquare = createSquare({color: "black"});