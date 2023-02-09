// Declarando os operadores de espelhamento e rest

let params = [3, 4, 5];
console.log(sum(...params)); // operador de espalhamento (spread operator)

// mesmo codigo em ES5
console.log(sum.apply(undefined, params));

// spread operator usado como um parametro rest
function restParameterFunction(x, y, ...a) {
    return (x + y) * a.length;
}
console.log(restParameterFunction(1, 2, 'hello', true, 7));

// mesmo codigo
function restParameterFunction(x, y) {
    var a = Array.prototype.slice.call(arguments, 2);
    return (x + y) * a.length;
}
console.log(restParameterFunction(1, 2, 'hello', true, 7));