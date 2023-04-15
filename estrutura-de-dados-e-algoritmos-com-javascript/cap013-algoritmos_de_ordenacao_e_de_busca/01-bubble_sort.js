/* Bubble Sort */

function bubbleSort(array, compareFn = defaultCompare) {
    const { length } = array; // armazenamento do array
    // auxilio do armazenamento do array (opcional)
    for(let i = 0; i < length; i++) { // iteracao do array (primeiro ao ultimo)
        for(let j = 0; j < length - 1; j++) {  // iteracao do array (primeiro ao penultimo)
            if(compareFn(array[j], array[j+1]) === compareFn.BIGGER_THAN){ // comparacao do atual com o proximo
                swap (array, j, j+1);
            }
        }
    }

    return array;
}

function swap(array, a, b) {
    /*
        //modo classico

        const temp = array[a];
        array[b] = temp;

        [array[a], array[b]] = [array[b], array[a]];
    */ 
   [array[a], array[b]] = [array[b], array[a]]; // modo ES2015
}

function createNonSortedArray(size) {
    const array = [];
    for(let i = size; i > 0; i --) {
        array.push(i);
    }

    return array;
}

let array = createNonSortedArray(5);
console.log(array.join());

array = bubbleSort(array);
console.log(array.join());

