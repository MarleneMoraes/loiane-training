// Ordenando elementos
numbers.reverse(); // [15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1]
numbers.sort(); // [1, 10, 11, 12, 13, 14, 15, 2, 3, 4, 5, 6, 7, 8, 9]

numbers.sort((a, b) => a - b);

function compare(a, b) {
    if (a < b) {
        return -1;
    }

    if (a > b) {
        return 1;
    }

    //a deve ser igual a b
    return 0;
}

// Ordenacao personalizada
const friends = [
    { name: 'John', age: 30 },
    { name: 'Ana', age: 20 },
    { name: 'Chris', age: 25 }, //virgula no final: ES2017
];

function comparePerson(a, b) {
    if (a.age < b.age) {
        return -1;
    }

    if (a.age > b.age) {
        return 1;
    }

    //a deve ser igual a b
    return 0;
}

console.log(friends.sort(comparePerson));

// Ordenando strings
let names = ['Ana', 'ana', 'john', 'John'];
console.log(names.sort());

["Ana", "John", "ana", "john"]

names = ['Ana', 'ana', 'john', 'John'];
console.log(names.sort((a, b) => {
    if (a.toLowerCase() < b.toLowerCase()) {
        return -1;
    }

    if (a.toLowerCase() > b.toLowerCase()) {
        return 1;
    }

    return 0;
}));

names.sort((a, b) => a.localeCompare(b)); // ["ana", "Ana", "john", "John"]

const names2 = ['Maève', 'Maeve'];
console.log(names2.sort((a, b) => a.localeCompare(b))); // ["Maeve", "Maève"]