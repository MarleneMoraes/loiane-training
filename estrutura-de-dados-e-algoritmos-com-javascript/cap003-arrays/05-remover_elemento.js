// Removendo elementos
let numbers = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9];

// Removendo um elemento no final do array
numbers.pop();

// Removendo um elemento na primeira posição
for (let i = 0; i < numbers.length; i++) {
  numbers[i] = numbers[i + 1];
}


Array.prototype.reIndex = function (myArray) {
  for (let i = 0; i < myArray.length; i++) {
    if (myArray[i] !== undefined) {
      // console.log(myArray[i]);
      newArray.push(myArray[i]);
    }
  }

  return newArray;
};

// remove a primeira posição manualmente e executa reIndex
Array.prototype.removeFirstPosition = function() {
  for (let i = 0; i < this.length; i++) {
    this[i] = this[i + 1];
  }
  
  return this.reIndex(this);
};

numbers.removeFirstPosition();

