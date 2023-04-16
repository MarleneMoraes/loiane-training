// Arrays em TypeScript
const numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];

interface Person {
    name: string;
    age: number;
}

// const friends: {name:string, age: number}[];
const friends = [
    { name: 'John', age: 30 },
    { name: 'Ana', age: 20 },
    { name: 'Chris', age: 25 }
];

function comparePerson(a:any, b:any) {
    if (a.age < b.age) {
        return -1;
    }

    if (a.age > b.age) {
        return 1;
    }

    //a deve ser igual a b
    return 0;
}