/* Classes ES2015 com simbolos no escopo */

// ES2015 introduziu novo tipo primitivo chamado Symbol
// Symbol é imutavel e pode ser usado como propriedade de um objeto

const _items = Symbol('stackItems'); // declaracao da variavel como um simbolo
class Stack {
    constructor() {
        this[_items] = []; // inicializa o valor no construtor da classe
    }

    push(element) {
        this.items.push(element);
    }

    pop() {
        return this.items.pop();
    }

    peek() {
        return this.items[this.items.length - 1];
    }

    isEmpty() {
        return this.items.length === 0;
    }

    clear() {
        this.items = [];
    }
}

const stack = new Stack();
stack.push(5);
stack.push(8);
let objectSymbols = Object.getOwnPropertySymbols(stack);

console.log(objectSymbols.length); // 1
console.log(objectSymbols); // [Symbol()]
console.log(objectSymbols[0]); // Symbol()
stack[objectSymbols[0]].push(1);
stack.print(); // 5, 8, 1