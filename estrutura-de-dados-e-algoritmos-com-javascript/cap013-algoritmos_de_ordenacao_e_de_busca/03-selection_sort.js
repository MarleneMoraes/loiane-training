/* Selection Sort */

function selectionSort(array, compareFn = defaultCompare) {
    const { length } = array; // declaracao das variaveis
    let indexMin;

    for(let i = 0; i < length - 1; i++) { // controle das passagens
        indexMin = i; // parte do pressuposto que o valor minimo do array e o valor de iteracao atual

        for(let j = i; j < length; j++) { // partindo do valor de i atual até o final do array
            if(compareFn(array[indexMin], array[j] === Compare.BIGGER_THAN)){ // comparacao do j com o valor min atual
                indexMin = j; // novo valor minimo
            }
        }

        if(i !== indexMin) { // se o valor minimo original for diferente do atual
            swap(array, i, indexMin); // realiza-se a troca
        }
    }

    return array;
}

function swap(array, a, b) {
    [array[a], array[b]] = [array[b], array[a]];
}

let array = createdNonSortedArray(5);
console.log(array.join());

array = selectionSort(array);
console.log(array.join());
