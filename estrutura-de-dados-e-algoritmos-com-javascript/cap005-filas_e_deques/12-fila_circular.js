/* Fila Circular - Batata Quente */

function hotPotato(elementsList, num) {
    const queue = new Queue(); // implementacao da classe
    const elimitatedList = [];
    for(let i = 0; i < elementsList.length; i++){
        queue.enqueue(elementsList[i]); // popular a fila
    }

    while(queue.size() > 1) {
        for(let i = 0; i < num; i++){
            queue.enqueue(queue.dequeue()); // remove um item do inicio da fila e adiciona no final
        }
        elimitatedList.push(queue.dequeue()); // removido da fila
    }
    return {
        eliminated: elimitatedList,
        winner: queue.dequeue() // a que restar é a vencedora
    }
}

const names = [];
const result = hotPotato(names, 7);
result.eliminated.forEach(name => {
    console.log(`${name} was eliminated from the Hot Potato game.`)
})

console.log(`The winner is: ${result.winner}`);


