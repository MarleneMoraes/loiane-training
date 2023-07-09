/* Push de elementos na pilha */

class Stack {
    constructor() {
        this.count = 0;
        this.items = {};
    }
    
    push(element) {
        this.items[this.count] = element;
        this.count++;
    }
}

const stack = new Stack();
stack.push(5);
stack.push(8);

/* 
    items = {
        0: 5,
        1: 8
    };
    count = 2;
*/

