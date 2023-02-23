// Acessando Elementos e Fazendo Uma Iteração Em Um Array

// Percorrer array
for (let i = 0; i < daysOfWeek.length; i++) {
    console.log(daysOfWeek[i]);
}

// Exemplo: Sequência de Fibonacci
    const fibonacci = []; // declaração do array

    // atribuição dos dois primeiros números
    fibonacci[1] = 1;
    fibonacci[2] = 1;

    // criação do terceito ao vigésimo número
    for (let i = 3; i < 20; i++) {
        fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
    }

    // Percorrer o array
    for (let i = 1; i < fibonacci.length; i++) {
        console.log(fibonacci[i]);
    }