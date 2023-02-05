// Operadores

// Operadores aritmeticos
var num = 0;

num = num + 2; // 2
num = num * 3; // 6
num = num / 2; // 3

num++; // 4
num--; // 3

// Operadores de atribuicao
num += 1; // 4
num -= 2; // 2
num *= 3; // 6
num /= 2; // 3
num %= 3; // 0

// Operadores de comparacao
console.log('num == 1 : ' + (num == 1));
console.log('num === 1 : ' + (num === 1));
console.log('num != 1 : ' + (num != 1));
console.log('num > 1 : ' + num > 1);
console.log('num < 1 : ' + num < 1);
console.log('num >= 1 : ' + num >= 1);
console.log('num <= 1 : ' + num <= 1);

// Operadores logicos
console.log('true && false : ' + (true && false));
console.log('true || false : ' + (true || false));
console.log('!true : ' + (!true));

// Operadores bitwise (bit a bit)
console.log('5 & 1: ', (5 & 1));
console.log('5 | 1: ', (5 | 1));
console.log('~ 5 : ', (~5));
console.log('5 ^ 1: ', (5 ^ 1));
console.log('5 << 1: ', (5 << 1)); // Deslocamento para esquerda (left shift)
console.log('5 >> 1: ', (5 >> 1)); // Deslocamento para direita (right shift)

// Typeof: devolve o tipo da variavel ou expressao
    // Dados primitivos
    var num = 1;
    var price = 1.5;
    var myName = 'Packt';
    var trueValue = true;

    // Dados derivados/objetos
    var person = { name: 'John', age: 21 };
    delete person.age; // operador delete
    console.log(person); // { name:'John' }

console.log('typeof num : ', typeof num); // number
console.log('typeof price : ', typeof price); // string
console.log('typeof myName : ', typeof myName); // boolean
console.log('typeof trueValue : ', typeof trueValue); // true
console.log('typeof person : ', typeof person); // object





