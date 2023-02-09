// Valores default para parametros de funcoes

function sum(x = 1, y = 2, z = 3) { // valores padrao (default) 
    return x + y + z;
}

// caso um parametro nao seja definido, ele permanece com o valor padrao
console.log(sum(4, 2)); // 9

//funcoes antes da ES2015
function sum(x, y, z) {
    if (x === undefined) x = 1;
    if (y === undefined) y = 2;
    if (z === undefined) z = 3;

    return x + y + z;
}

// o mesmo codigo
function sum() {
    var x = arguments.length > 0 && arguments[0] !== undefined ? arguments[0] : 1;
    var y = arguments.length > 1 && arguments[1] !== undefined ? arguments[1] : 2;
    var z = arguments.length > 2 && arguments[2] !== undefined ? arguments[2] : 3;
    return x + y + z;
}

