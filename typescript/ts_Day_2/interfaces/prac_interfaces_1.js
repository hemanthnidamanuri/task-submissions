var customer = {
    firstname: "hemanth",
    lastname: "nidamanuri",
    sayhello: function () {
        return "hellohemanth";
    },
    add: function (num, num1) {
        console.log("4" + (num + num1));
    },
    sub: function (num, num1) {
        return (num - num1);
    }
};
console.log("1" + customer.firstname);
console.log("2" + customer.lastname);
console.log("3" + customer.sayhello());
customer.add(1, 2);
console.log("5" + customer.sub(2, 1));
