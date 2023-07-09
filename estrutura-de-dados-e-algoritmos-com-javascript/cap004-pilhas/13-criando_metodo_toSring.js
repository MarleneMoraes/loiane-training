/* Criando o metodo toString */

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
    }

    toString() {
        if (this.isEmpty()) {
            return '';
        }

        let objString = `${this.items[0]}`; // inicializar o objString com o primeiro elemento da pilha
        for (let i = 1; i < this.count; i++) { // iterar sobre todas as chaves da pilha
            objString = `${objString}, ${this.items[i]}`; // concatenar uma virgula e o proximo elemento da pilha
        }
        // se a pilha contiver um unico elemento, o codigo das linhas 2 e 3 nao serao executados
        return objString;
    }
}
