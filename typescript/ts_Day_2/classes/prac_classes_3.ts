
//multilevel inheritance chicekn curry.
class Oil{
	oil:string;
}

class Onion extends Oil{
	onions : number;
}

class GingerPaste extends Onion{
	paste : string;
}

class SaltChilli extends GingerPaste{
	saltch : string;
}

class chicken extends SaltChilli{
	chicken : String;
}

class Cooking extends chicken{

		curry : string;
	cooking(oil,onions,paste,saltch,chicken){
		this.curry = oil+onions+paste+saltch+chicken;
		console.log("chicken curry ready");
	}

}

var finalcurry = new Cooking();
finalcurry.cooking("2tbsp",4,"1/2tbsp","4tbsp","halfkg");