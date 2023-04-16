/* Dando uma espiada no elemento que esta na frente da fila */
class Queue {
    constructor() {
        this.count = 0;
        this.lowestCount = 0;
        this.items = {};
    }
}

peek(); {
    if(this.isEmpty()){
        return undefined;
    }
    return this.items[this.lowestCount];
}