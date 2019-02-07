// method overriding in typescript
var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var Print = /** @class */ (function () {
    function Print() {
    }
    Print.prototype.print = function () {
        console.log("firs print statement:");
    };
    return Print;
}());
var SecondPrint = /** @class */ (function (_super) {
    __extends(SecondPrint, _super);
    function SecondPrint() {
        return _super !== null && _super.apply(this, arguments) || this;
    }
    SecondPrint.prototype.print = function () {
        _super.prototype.print.call(this);
        console.log("method overiden : second print statement");
    };
    return SecondPrint;
}(Print));
var obj = new SecondPrint();
obj.print();
