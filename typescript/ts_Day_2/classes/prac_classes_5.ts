class SuperHeros{

	static hero1 : string = "batman";
	static hero2 : string = "superman";

	static fight(){
		console.log(SuperHeros.hero1 +" fighting with "+ SuperHeros.hero2);
	}
}

SuperHeros.fight();

var obj  = new SuperHeros();
var is_it_true =  obj instanceof SuperHeros;
console.log(is_it_true);
