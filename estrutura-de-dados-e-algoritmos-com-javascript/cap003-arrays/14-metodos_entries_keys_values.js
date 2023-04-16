// Metodos entries, keys e values de array
let aEntries = numbres.entries(); // obtem um iterador de chave/valor
console.log(aEntries.next().value); // [0,1] - posicao 0, valor 1
console.log(aEntries.next().value); // [1,2] - posicao 1, valor 2
console.log(aEntries.next().value); // [2,3] - posicao 2, valor 3

aEntries = numbers.entries();
for (const n of aEntries) {
    console.log(n);
}


const aKeys = numbers.keys(); // obtem um iterador de chaves
console.log(aKeys.next()); // { value: 0, done false }
console.log(aKeys.next()); // { value: 1, done false }
console.log(aKeys.next()); // { value: 2, done false }

const aValues = numbers.values();
console.log(aValues.next()); // { value: 1, done false }
console.log(aValues.next()); // { value: 2, done false }
console.log(aValues.next()); // { value: 3, done false }