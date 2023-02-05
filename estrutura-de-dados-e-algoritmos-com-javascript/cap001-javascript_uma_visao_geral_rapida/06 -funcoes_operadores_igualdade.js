/* 
    Funcoes dos operadores de igualdade (== e ===)
    
    "Quando == e usado, os valores poderao ser considerados 
    iguais mesmo se forem de tipos diferentes. [...] Se x e 
    y forem do mesmo tipo, entao JavaScript usará o metodo 
    equals para comparar os dois valores ou objetos." (p. 39)
*/

// Operador ==

var nullVar = null;
var undefinedVar;
var numberVar = 0;
var stringVar = 'word';
var booleanVar = true;
var objectVar = { name: 'John', age: 21 };

console.log(nullVar == undefinedVar); // true
console.log(undefinedVar == nullVar); // true
console.log(numberVar == stringVar); // numberVar == toNumber(stringVar)
console.log(stringVar == numberVar); // toNumber(stringVar) == numberVar

/* 
    Case                    Result
    Boolean == any          toNumber(Boolean) == any
*/

console.log(booleanVar == nullVar);
console.log(booleanVar == undefinedVar);
console.log(booleanVar == numberVar);
console.log(booleanVar == stringVar);
console.log(booleanVar == objectVar);

// Operador ===

console.log('packt' === true); // false
console.log('packt' === 'packt'); // true

var person = { name: 'John', age: 21 };
console.log(objectVar === person); // false: objetos diferentes


