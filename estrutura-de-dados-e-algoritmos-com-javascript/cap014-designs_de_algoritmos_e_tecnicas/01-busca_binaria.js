/* Busca Binaria */

function binarySearchRecursive(array, value, compareFn = defaultCompare){
    const DOES_NOT_EXIST = -1;

    if(low <=high){
        const mid = Math.floor((low+high) / 2);
        const element = array[mid];

        if(compareFn(element, value) === CompareFn.LESS_THAN) { //se for menor
            return binarySearchRecursive(array, value, mid+1, high, compareFn);
        } else if (compareFn(element, value) === CompareFn.BIGGER_THAN){ // se for maior
            return binarySearchRecursive(array, value, mid-1, high, compareFn);
        } else {
            return mid; // chave encontrada 
        }
    }

    return DOES_NOT_EXIST; // chave nao encontrada
}

export function binarySearch(array, value, compareFn = defaultCompare) {
    const sortedArray = quickSort(array);
    const low = 0;
    const high = sortedArray.length - 1;

    return binarySearchRecursive(array, value, low, high, compareFn);
}
