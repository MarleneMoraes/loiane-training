/* Verificador de palindromo */

function palindromeChecker(aString) {
    if (aString === undefined || aString === null ||
        (aString !== null && aString.length === 0)) { // verificacao se o parametro e valido
        return false;
    }
    const deque = new Deque();
    const lowerString = aString.toLocaleLowerCase().split(' ').join(' '); // transformacao em letras minusculas e remocao de espacos
    let isEqual = true;
    let firstChar, lastChar;
    for (let i = 0; i < lowerString.length; i++) {
        deque.addBack(lowerString.charAt(i));
    }
    while (deque.size() > 1 && isEqual) { // se for palindromo
        firstChar = deque.removeFront(); // remocao do elemento da frente
        lastChar = deque.removeBack(); // remocao do elemento de tras
        if (firstChar !== lastChar) {
            isEqual = false; // nao sera palindromo
        }
    }

    return isEqual;
}

// true
console.log('a', palindromeChecker('a'));
console.log('aaa', palindromeChecker('aa'));
console.log('kayak', palindromeChecker('kayak'));
console.log('level', palindromeChecker('level'));
console.log('Was it a car or a cat I saw', palindromeChecker('Was it a car or a cat I saw'));
console.log('Step on no pets', palindromeChecker('Step on no pets'));


