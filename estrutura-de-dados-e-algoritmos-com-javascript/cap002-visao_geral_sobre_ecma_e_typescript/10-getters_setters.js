// Trabalhando com getters e setters

class Person {
    constructor(name) {
        this._name = name; // transparecer que o atributo e privado
    }

    get name() { // getter
        return this._name;
    }

    set name(value) { // setter
        this._name = value;
    }
}

let lotrChar = new Person('Frodo');
console.log(lotrChar.name);

lotrChar.name = 'Gandalf';
console.log(lotrChar.name);

lotrChar._name = 'Sam';
console.log(lotrChar.name);