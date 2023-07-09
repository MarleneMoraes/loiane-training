/* Dando uma espiada no elemento que esta no topo da pilha */
class Stack {
    constructor() {
        this.items = [];
    }

    peek() {
        return this.items[this.items.length - 1];
    }
}

