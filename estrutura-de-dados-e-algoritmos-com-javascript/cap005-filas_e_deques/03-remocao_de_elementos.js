/* Remocao de elementos da fila */
class Queue {
    constructor() {
        this.count = 0;
        this.lowestCount = 0;
        this.items = {};
    }
}

dequeue(); {
    if (this.isEmpty()) {
        return undefined;
    }

    const result = this.items[this.lowestCount];
    delete this.items[this.lowestCount];
    this.lowestCount++; // incremento da propriedade
    return result; // retorna o valor da frente
}

// Emulacao de remocao da fila

items = { 
    0: 5,
    1: 8
};

count = 2;
lowestCount = 0;

let removedElement = dequeue();
console.log(removedElement);