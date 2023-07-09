/* Verificando se a pilha esta vazia e o seu tamanho */

class Stack {
    constructor() {
        this.count = 0;
        this.items = {};
    }
    
    push(element) {
        this.items[this.count] = element;
        this.count++;
    }

    size() {
        return this.count;
    }

    isEmpty() {
        return this.count === 0;
    }
}

