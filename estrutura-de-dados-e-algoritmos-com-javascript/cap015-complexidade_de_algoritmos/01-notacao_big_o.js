/* Notacao Big O */

// O(1) - desempenho da funcao sera o mesmo
function increment(num) {
    return ++num;
}

// O(n) - desempenho dependera do numero de elementos do array e do valor que procuramos
// Melhor caso - 1
function sequentialSearch(array, value, equalsFn = defaultEquals) {
    for (let i = 0; i < array.length; i++) {
        if (equalsFn(value, array[i])) {
            return i;
        }
    }

    return -1;
}

// Cost (cenário de Pior caso) - o maior numero de execucoes (ex. tamanho do array)

function sequentialSearch(array, value, equalsFn = defaultEquals) {
    let cost = 0;
    for (let i = 0; i < array.length; i++) {
        cost++;
        if (equalsFn(value, array[i])) {
            return i;
        }
    }

    console.log(`cost for sequentialSearch with input size ${array.length} is ${cost}`);
    return -1;
}

// O(n2) - para dois lacos for aninhados
function bubbleSort(array, compareFn = defaultCompare) {
    const { length } = array;
    let cost = 0;
    for (let i = 0; i < length; i++) {
        cost++;
        for (let j = 0; j < length - 1; j++) {
            cost++;
            if (compareFn(array[j], array[j + 1]) === compareFn.BIGGER_THAN) {
                swap(array, j, j+1);
            }
        }
    }
    console.log(`cost for bubbleSort with input size ${length} is ${cost}`); // array.length = 10  -> cost = 100;    
    return array;
}
