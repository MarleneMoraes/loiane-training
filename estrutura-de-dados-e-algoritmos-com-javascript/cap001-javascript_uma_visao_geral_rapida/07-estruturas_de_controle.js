// Estruturas de controle

// Instrucoes condicionais

// If
var num = 1;

if (num === 1) {
    console.log('num is equal to 1');
}

// If...Else

var numb = 0;

if (numb === 1) {
    console.log('numb is equal to 1');
} else {
    console.log('numb is not equal to 1, the value of numb is ' + numb);
}

// Operador ternario
(num === 1) ? num-- : num++; // if (num === 1) { num--; } else { num++; };

// Switch Case
var month = 5;

switch (month) {
    case 1:
        console.log('January');
        break;
    case 2:
        console.log('Febuary');
        break;
    case 3:
        console.log('March');
        break;
    case 4:
        console.log('April');
        break;
    case 5:
        console.log('May');
        break;
    case 6:
        console.log('June');
        break;
    case 7:
        console.log('July');
        break;
    case 8:
        console.log('August');
        break;
    case 9:
        console.log('September');
        break;
    case 10:
        console.log('October');
        break;
    case 11:
        console.log('November');
        break;
    case 12:
        console.log('December');
        break;
    default:
        console.error;
}
