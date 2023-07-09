/* Usando a classe Queue */
class Stack {
    constructor() {
        this.items = [];
    }
}
const stack = new Stack();
console.log(stack.isEmpty()); // true

stack.push(5);
stack.push(8);

console.log(stack.peek()); // 8

stack.push(11);
console.log(stack.size()); // 3
console.log(stack.isEmpty()); // false

stack.push(15);

stack.pop();
stack.pop();
console.log(stack.size()); // 2