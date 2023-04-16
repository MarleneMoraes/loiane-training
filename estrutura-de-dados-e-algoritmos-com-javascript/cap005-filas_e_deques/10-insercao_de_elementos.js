/* Adicionando elementos na frente do deque */
class Deque {
    constructor() {
        this.count = 0;
        this.lowestCount = 0;
        this.items = {};
    }
}

addFront(element); {
    if (this.isEmpty()) { // deque vazio
        this.addBack(element);
    } else if (this.lowestCount > 0) { // elemento removido da frente do deque
        this.lowestCount--;
        this.items[this.lowestCount] = element;
    } else { // lowestCount = 0
        for (let i = this.count; i > 0; i--) {
            this.items[i] = this.items[i - 1];
        }
        this.count++;
        this.lowestCount = 0;
        this.items[0] = element; // sobrescrever qualquer valor existente com o elemento que queremos adicionar no deque
    }
}

addBack(element); {
    if (this.isEmpty()) {
        this.items[this.lowestCount] = element;
    } else {
        this.items[count - 1] = element; 
    }
}
