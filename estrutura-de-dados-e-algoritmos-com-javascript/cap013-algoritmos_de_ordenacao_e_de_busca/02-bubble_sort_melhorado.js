/* Bubble Sort Melhorado*/

function modifiedBubbleSort(array, compareFn = defaultCompare) {
    const { length } = array;
    for (let i = 0; i < length; i++) {
        for (let j = 0; j < length - 1 - i; j++) { // evitar comparacoes desnecessarias
            if (compareFn(array[j], array[j + 1]) === compareFn.BIGGER_THAN) {
                swap(array, j, j + 1);
            }
        }
    }

    return array;
}

function swap(array, a, b) {
    [array[a], array[b]] = [array[b], array[a]];
}

function createNonSortedArray(size) {
    const array = [];
    for (let i = size; i > 0; i--) {
        array.push(i);
    }

    return array;
}

let array = createNonSortedArray(5);
console.log(array.join());

array = bubbleSort(array);
console.log(array.join());

