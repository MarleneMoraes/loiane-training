// Interfaces

interface Person {
    name: string;
    age: number;
}

function printName(person: Person) {
    console.log(person.name);
}

const john = { name: 'John', age: 21 };
const mary = { name: 'Mary', age: 26, phone: '123-45678' }; // mesmo sem o atributo phone, o TS entende que mary deve ser Person (ducking typing)

printName(john);
printName(mary);

// nao existe em JS mas util para metodos de ordenacao
interface Comparable {
    compareTo(b): number;
}
class MyObject implements Comparable {
    age: number;
    compareTo(b): number {
        if (this.age === b.age) {
            return 0;
        }
        return this.age > b.age ? 1 : -1;
    }
}