//(ver em 12-modulos.js)
const circleArea = r => 3.14 * (r ** 2);
const squareArea = s => s * s;

//export const circleArea = r => 3.14 * (r ** 2); // exportacao de cada funcao
//export const squareArea = s => s * s;

export { circleArea, squareArea }; // expor as funcoes para outros arquivos
//export { circleArea as circle, squareArea as square }; // exportacao com nome diferente do declarado

