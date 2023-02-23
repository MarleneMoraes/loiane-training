// Acrescentando elementos
let numbers = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9];

// Inserindo um elemento no final do array
numbers.push(10);

// Usando o método push
numbers.push(11, 12);

for (let i = 0; i < numbers.length; i++) {
  console.log(numbers[i]);
}

// Inserindo um elemento na primeira posição
Array.prototype.insertFirstPosition = function (value) {
  for (let i = this.length; i >= 0; i--) {
    this[i] = this[i - 1];
  }
  this[0] = value;
};

numbers.insertFirstPosition(-1);

