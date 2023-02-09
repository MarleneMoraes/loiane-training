// Programacao orientada a objetos com classes

function Book(title, pages, isbn) {
    this.title = title;
    this.pages = pages;
    this.isbn = isbn;
}

Book.prototype.printTitle = function () {
    console.log(this.title);
}

// codigo com ES2015

class Book {
    constructor(title, pages, isbn) {
        this.title = title;
        this.pages = pages;
        this.isbn = isbn;
    }
    printIsbn() {
        console.log(this.isbn);
    }
}

let book = new Book('title', 'pag', 'isbn');
console.log(book.title); // title

book.title = 'new title';
console.log(book.title); // new title