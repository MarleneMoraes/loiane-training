/* Busca Binaria */

function binarySearch(array, value, compareFn = defaultCompare){
    const DOES_NOT_EXIST = -1;
    
    const sortedArray = quickSort(array);
    let low = 0;
    let high = sortedArray.length -1;

    while(lesserOrEquals(low, high, compareFn)) {
        const mid = Math.floor((low + high) / 2);
        const element = sortedArray[mid];

        if(compareFn(element, value) === CompareFn.LESS_THAN) {
            low = mid + 1;
        } else if (compareFn(element, value) === CompareFn.BIGGER_THAN){
            high = mid - 1;
        } else {
            return mid;
        }

        return DOES_NOT_EXIST;
    }
}
