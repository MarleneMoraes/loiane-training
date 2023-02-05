/* 
    Verdadeiro e Falso
    "Em JavaScript, uma string como Packt e avaliada como true."
*/

function testTruthy(val) {
    return val ? console.log('Truthy') : console.log('Falsy');
}

testTruthy(true); // true
testTruthy(false); // false

testTruthy(new Boolean(false)); // Objeto sempre true

testTruthy(''); // false
testTruthy('Packt'); // true
testTruthy(new String('')); // true

testTruthy(1); // true
testTruthy(-1); // true
testTruthy(NaN); // false
testTruthy(new Number(NaN)); // true

testTruthy({}); // true

var obj = { name: 'John' };
testTruthy(obj); // true
testTruthy(obj.name); // true
testTruthy(obj.age); // age 