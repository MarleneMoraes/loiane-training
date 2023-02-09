// Heranca

class ITBook extends Book {
    constructor(title, pages, isbn, technology) { // herda o comportamento
        super(title, pages, isbn); // construtor da superclasse
        this.technology = technology;
    }

    printTechnology(){
        console.log(this.technology);
    }
}

let jsBook = new ITBook('Learning JS Algorithms', '200', '1234567890', 'JavaScript');
console.log(jsBook.title);
console.log(jsBook.printTechnology());