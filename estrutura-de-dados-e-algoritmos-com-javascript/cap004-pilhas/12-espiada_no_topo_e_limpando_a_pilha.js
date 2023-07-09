/* Dando uma espiada no topo e limpando a pilha */

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
        if (this.isEmpty()) {
            return undefined;
        }

        this.count--; 
        const result = this.items[this.count]; 
        delete this.items[this.count]; 

        return result;
    }

    peek() {
        if (this.isEmpty()) {
            return undefined;
        }

        return this.items[this.count - 1];
    }

    clear() {
        this.items = {};
        this.count = 0;

        /* 
            while (!this.isEmpty()) {
                this.pop();
            }
        */
    }
}
