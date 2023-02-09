// Modulos

//import { circleArea as circle } from "./calcArea"; // utilizacao da importacao com nome diferente do original
//import { circleArea, squareArea } from "./calcArea";

import * as area from 'calcArea';

console.log(area.circle(2));
console.log(area.square(2));

import Book from './book';
const myBook = new Book('Learning JavaScript', 200, 12134567890);
myBook.printTitle();



