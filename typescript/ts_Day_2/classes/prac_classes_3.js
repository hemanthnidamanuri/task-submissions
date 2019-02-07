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
var Oil = /** @class */ (function () {
    function Oil() {
    }
    return Oil;
}());
var Onion = /** @class */ (function (_super) {
    __extends(Onion, _super);
    function Onion() {
        return _super !== null && _super.apply(this, arguments) || this;
    }
    return Onion;
}(Oil));
var GingerPaste = /** @class */ (function (_super) {
    __extends(GingerPaste, _super);
    function GingerPaste() {
        return _super !== null && _super.apply(this, arguments) || this;
    }
    return GingerPaste;
}(Onion));
var SaltChilli = /** @class */ (function (_super) {
    __extends(SaltChilli, _super);
    function SaltChilli() {
        return _super !== null && _super.apply(this, arguments) || this;
    }
    return SaltChilli;
}(GingerPaste));
var chicken = /** @class */ (function (_super) {
    __extends(chicken, _super);
    function chicken() {
        return _super !== null && _super.apply(this, arguments) || this;
    }
    return chicken;
}(SaltChilli));
var Cooking = /** @class */ (function (_super) {
    __extends(Cooking, _super);
    function Cooking() {
        return _super !== null && _super.apply(this, arguments) || this;
    }
    Cooking.prototype.cooking = function (oil, onions, paste, saltch, chicken) {
        this.curry = oil + onions + paste + saltch + chicken;
        console.log("chicken curry ready");
    };
    return Cooking;
}(chicken));
var finalcurry = new Cooking();
finalcurry.cooking("2tbsp", 4, "1/2tbsp", "4tbsp", "halfkg");
