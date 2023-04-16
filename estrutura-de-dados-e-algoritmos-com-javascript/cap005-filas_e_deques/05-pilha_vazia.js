/* Verificando se a pilha esta vazia e o seu tamanho */
class Queue {
    constructor() {
        this.count = 0;
        this.lowestCount = 0;
        this.items = {};
    }
}

/* 
    isEmpty(); {
        return this.count - this.lowestCount === 0;
    }
*/

size(); {
    return this.count - this.lowestCount;
}

isEmpty(); {
    return this.size === 0;
}