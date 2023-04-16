// Usando o objeto @@iterator
let iterator = numbers[Symbol.iterator]();
console.log(iterator.next().value); // 1
console.log(iterator.next().value); // 2
console.log(iterator.next().value); // 3
console.log(iterator.next().value); // 4
console.log(iterator.next().value); // 5

iterator = numbers[Symbol.iterator]();
for (const n of iterator) {
    console.log(n);
}

// iterator.next() undefined -> quando nao houver mais valores
