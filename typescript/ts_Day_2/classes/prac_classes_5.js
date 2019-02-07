var SuperHeros = /** @class */ (function () {
    function SuperHeros() {
    }
    SuperHeros.fight = function () {
        console.log(SuperHeros.hero1 + " fighting with " + SuperHeros.hero2);
    };
    SuperHeros.hero1 = "batman";
    SuperHeros.hero2 = "superman";
    return SuperHeros;
}());
SuperHeros.fight();
var obj = new SuperHeros();
var is_it_true = obj instanceof SuperHeros;
console.log(is_it_true);
