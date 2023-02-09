// Inferencia de tipo

let age: number = 20;
let existsFlag: boolean = true;
let language: string = 'JavaScript';

// com a declaracao da variavel, e possivel a inferencia de tipo
let other_age = 20; // number
let other_existsFlag = true; // boolean
let other_language = 'Java'; // string

// caso nao seja declarada, o TS define como any
let favoriteLanguage: string;
let langs = ['JavaScript', 'Ruby', 'Python'];
favoriteLanguage = langs[0];