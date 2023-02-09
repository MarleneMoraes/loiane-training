// Propriedades melhoradas de objetos

let [x, y] = ['a', 'b']; // inicializacao de variaveis de uma so vez

/* 
    e o mesmo que
    
    let x = 'a';
    let y = 'b';
*/

// realizacao de trocas (swap) sem uma variavel temporaria

[x, y] = [y, x];

/* 
    e o mesmo que
    
    var temp = x;
    x = y;
    y = temp;
*/

// abreviacao de propriedades (property shorthand)
//let [x,y] = ['a', 'b'];
let obj = { x, y };
console.log(obj); // { x: "a", y: "b" }

/*
    e o mesmo que

    var x = 'a';
    var y = 'b';
    var obj2 = { x: x, y: y };
    console.log(obj2); // { x: "a", y: "b" }
*/

// nomes de metodos abreviados (shorthand method names)
const hello = {
    name: 'abcdef',
    printHello() {
        console.log('Hello');
    }
};
console.log(hello.printHello());

/*
    e o mesmo que

    var hello = {
        name: 'abcdef',
        printHello: function printHello() {
            console.log('Hello');
        }
    }
    console.log(hello.printHello());
*/