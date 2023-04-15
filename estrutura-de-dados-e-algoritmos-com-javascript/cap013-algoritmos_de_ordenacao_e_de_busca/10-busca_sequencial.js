/* Busca Sequencial */

const DOES_NOT_EXIST = -1;

function sequentialSearch(array, value, equalsFn = defaultEquals) {
    for (let i = 0; i < array.length; i++) { 
        if(equalsFn(value, array[i])){ // comparacao de cada elemento do array
            return i; // chave encontrada
        }
    }

    return DOES_NOT_EXIST; // chave nao encontrada
}

