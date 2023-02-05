// Programacao orientada a objetos em JavaScript

// Criacao de um objeto simples

var obj = new Object();

var obj = {};

// Criacao de um objeto completo

obj = {
    name: {
        first: 'Gandalf',
        last: 'the Grey'
    },
    address: 'Middle Earth'
};

// Construtores

function Book(title, pages, isbn){
    this.title = title;
    this.pages = pages;
    this.isbn = isbn;
    this.printIsbn = function() { // declaracao de funcoes diretamente no construtor
        console.log(this.isbn);
    }
}

/* 
    "No exemplo com prototype, a funcao printTitle sera compartilhada entre todas as
    instancias, e somente uma copia sera criada. Quando usamos uma definicao baseada 
    em classe, como no exemplo anterior, cada instancia tera a sua propria copia das 
    funcoes. O uso do metodo prototype economiza memoria e reduz o custo de processamento 
    no que diz respeitoa atribuir funcoes a instancia." (p. 46) 
*/

Book.prototype.printTitle = function() {
    console.log(this.title);
}
book.printTitle();

var book = new Book('Data Structures and Algorithms in JavaScript', '406', '978-85-7522-693-3');

console.log(book.title); // Data Structures and Algorithms in JavaScript
book.printIsbn(); // 978-85-7522-693-3