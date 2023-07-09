/* Convertendo numeros decimais para binarios */

function decimalToBinary(decNumber){
    const remStack = new Stack();
    let number = decNumber;
    let rem;
    let binaryString = '';

    while(number > 0){
        rem = Math.floor(number % 2); // 1
        remStack.push(rem); // 1
        number = Math.floor(number / 2); // 1
    }

    while(!remStack.isEmpty()){
        binaryString += remStack.pop().toString();
    }

    return binaryString;
}

console.log(decimalToBinary(233)); // 11101001
console.log(decimalToBinary(10)); // 1010
console.log(decimalToBinary(1000)); // 1111101000