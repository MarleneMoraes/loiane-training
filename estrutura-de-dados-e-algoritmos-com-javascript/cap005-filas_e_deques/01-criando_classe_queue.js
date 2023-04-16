/* Criando a classe Queue */
class Queue {
    constructor() {
        this.count = 0; // controle de tamanho da fila
        this.lowestCount = 0; // controle do primeiro elemebt
        this.items = {}; // armazenamento dos elementos
    }
}