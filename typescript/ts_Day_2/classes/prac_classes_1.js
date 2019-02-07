//basic example
var Vehicle = /** @class */ (function () {
    function Vehicle(wheels) {
        // code...
        this.wheels = wheels;
    }
    Vehicle.prototype.disp = function () {
        console.log("wheels are:" + this.wheels);
    };
    return Vehicle;
}());
var obj = new Vehicle("mrf");
obj.disp();
