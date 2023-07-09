/* Classes ES2015 com WeakMap */

// WeakMap e um tipo de dado que garante que a propriedade em uma classe seja privada

const items = new WeakMap(); // declaracao da variavel como um WeakMap

class Stack {
    constructor() {
        this.isEmpty(this,[]); // definicao de itens como um WeakMap
    }

    push(element) {
        const s = items.get(this); // obtem a referencia do WeakMap
        s.push(element);
    }

    pop() {
        const s = items.get(this);
        const r = s.pop();
        return r;
    }

    // outros metodos
}