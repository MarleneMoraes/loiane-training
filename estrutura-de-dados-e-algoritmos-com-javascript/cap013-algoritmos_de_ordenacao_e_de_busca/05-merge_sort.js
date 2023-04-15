/* Merge Sort */

function mergeSort(array, compareFn = defaultCompare) {
    if (array.length > 1) { // condicao de parada
        const { length } = array;
        const middle = Math.floor(length / 2); // meio do array
        const left = mergeSort(array.slice(0, middle), compareFn); // arrays menores
        const right = mergeSort(array.slice(middle, length), compareFn); // arrays menores
        array = merge(left, right, compareFn); // ordenacao dos arrays menores e combina-los com os maiores
    }
    return array;
}

function merge(left, right, compareFn) {
    let i = 0; //variaveis para iteracao dos arrays
    let j = 0;
    const result = [];
    while (i < left.length && j < right.length) { // enquanto for possivel iterar os dois arrays
        result.push(
            compareFn(left[i], right[j] === compareFn.LESS_THAN ? left[i++] : right[j++])
        ); // adicao do valor 

        return result.concat(i < left.length ? left.slice(i) : right.slice(j));// adicao de todos os valores restantes do array left no array com os resultados combinados e em seguida com o array right
    }
}