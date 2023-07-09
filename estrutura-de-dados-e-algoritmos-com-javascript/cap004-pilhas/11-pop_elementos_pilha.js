/* Pop de elementos da pilha */

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

    pop() {
        if (this.isEmpty()) { // verificar se a pilha esta vazia
            return undefined;
        }

        this.count--; // decrementar o contador
        const result = this.items[this.count]; // armazenar o valor do topo da pilha
        delete this.items[this.count]; // remover o elemento

        return result; //  retornar o elemento depois da remocao
    }
}

/* 
    items = {
        0: 5,
        1: 8
    };
    count = 2;
*/

