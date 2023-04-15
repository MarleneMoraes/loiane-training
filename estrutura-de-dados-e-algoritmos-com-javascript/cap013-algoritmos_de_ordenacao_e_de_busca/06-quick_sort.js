/* Quick Sort */

function quickSort(array, compareFn = defaultCompare) {
    return quickSort(array, 0, array.length - 1, compareFn);
}

function quick(array, left, right, compareFn) {
    let index; // declaracao da variavel
    if (array.length > 1) { // se o tamanho do array for maior que 1
        index = partition(array, left, right, compareFn);
        if (left < index - 1) { // se houver subarrays com elementos menores
            quick(array, left, index - 1, compareFn); // repeticao do processo para esse subarray
        }
        if (index < right) { // subarray com valores maiores
            quick(array, index, right, compareFn); // repeticao do processo do quick sort
        }
    }
    return array;
}

/* Processo de particao */

function partition(array, left, right, compareFn) {
    const pivot = array[Math.floor((right + left) / 2)]; // selecao o item do meio como pivot
    let i = left; // ponteiro da esquerda
    let j = right; // ponteiro da direita
    while (i <= j) { // enquanto os ponteiros nao se cruzarem
        while (compareFn(array[i], pivot) === compareFn.LESS_THAN) { // deslocamento do ponteiro left ate o elemento encontrado ser maior que o pivot
            i++;
        }
        while (compareFn(array[j], pivot) === compareFn.BIGGER_THAN) { // deslocamento do ponteiro right ate o elemento encontrado ser maior que o pivot
            j--;
        }
        if (i <= j) {
            swap(array, i, j);
            i++;
            j--;
        }
    }



    return i;
}