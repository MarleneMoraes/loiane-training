// exportacao padrao (ver em 12-modulos.js)

export default class Book {
    constructor(title, pages, isbn) {
        this.title = title;
        this.pages = pages;
        this.isbn = isbn;
    }
    printTitle() {
        console.log(this.title);
    }
}