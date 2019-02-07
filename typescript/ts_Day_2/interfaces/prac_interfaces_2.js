function createSquare(con) {
    // body...
    var newsquare = { color: "saffron", area: 200 };
    if (con.color) {
        newsquare.color = con.color;
    }
    if (con.width) {
        // code...
        newsquare.area = con.width * con.width;
    }
    return newsquare;
}
var mysquare = createSquare({ color: "black" });
