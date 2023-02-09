// Funcoes de seta (array functions)

var circleAreaES5 = function circleArea(r) {
    var PI = 3.14;
    var area = PI * r * r;
    return area;
};

// simplificacao com arrow function
const circleArea = r => {
    const PI = 3.14;
    const area = PI * r * r;
    return area;
};

console.log(circleArea(2));

// versao mais simples para funcoes de unica instrucao
const circleArea2 = r => 3.14 * r * r;
console.log(circleArea2(2));

// versao simplificada sem argumentos
const hello = () => console.log('hello!');
hello();