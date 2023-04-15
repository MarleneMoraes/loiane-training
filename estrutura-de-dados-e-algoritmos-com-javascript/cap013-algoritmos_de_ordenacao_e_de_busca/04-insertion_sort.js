/* Insertion Sort */

function insertionSort(array, compareFn = defaultCompare) {
    const { length } = array; // declaracao das variaveis
    let temp;

    for (let i = 1; i < length; i++) { // iteracao pelo array a fim de encontrar o lugar correto para o valor de i
        let j = i; // atribuicao para o valor de i a uma variavel auxiliar

        temp = array[i]; // armazenamento do valor da posicao i do array em uma variável temporaria
        while (j > 0 && compareFn(array[j - 1], temp) === Compare.BIGGER_THAN) { // j maior que zero e valor anterior dor maior que o valor comparado
            array[j] = array[j - 1]; // desloca o valor anterior para a posicao atual
            j--;
        }
        array[j] = temp; // insercao na posicao correta
    }

    return array;
}