// Funcoes de iteracao
function isEven(x) {
    // devolve true se x for multiplo de 2
    console.log(x);
    return x % 2 === 0 ? true : false;
    // return x % 2 == 0
}
let numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15];
const isEven = x => x % 2 === 0;

// Iterando com o metodo every
numbers.every(isEven);

// Iterando com o metodo some
numbers.some(isEven);

// Iterando com forEach
numbers.forEach(x => console.log(x % 2 === 0));
