// Arrays bidimensionais e multidimensionais
let averageTempDay1 = [72, 75, 79, 79, 81, 81];
let averageTempDay2 = [81, 79, 75, 75, 73, 72];

let averageTemp = [];
averageTemp[0] = [72, 75, 79, 79, 81, 81];
averageTemp[1] = [81, 79, 75, 75, 73, 73];

// dia 1
averageTemp[0] = [];
averageTemp[0][0] = [72];
averageTemp[0][1] = [75];
averageTemp[0][2] = [79];
averageTemp[0][3] = [79];
averageTemp[0][4] = [81];
averageTemp[0][5] = [81];

// dia 2
averageTemp[1] = [];
averageTemp[1][0] = [81];
averageTemp[1][1] = [79];
averageTemp[1][2] = [75];
averageTemp[1][3] = [75];
averageTemp[1][4] = [73];
averageTemp[1][5] = [73];

// Iterando pelos elementos de arrays bidimensionais
function printMatrix(myMatrix) {
  for (let i = 0; i < myMatrix.length; i++) {
    for (let j = 0; j < myMatrix[i].length; j++) {
      console.log(myMatrix[i][j]);
    }
  }
}

printMatrix(myMatrix[i][j]);


// Arrays multidimensionais
const matrix3x3x3 = [];
for (let i = 0; i < 3; i++) {
  matrix3x3x3[i] = []; // necessario inicializar cada array
  for (let j = 0; j < 3; j++) {
    matrix3x3x3[i][j] = [];
    for (let z = 0; z < 3; z++) {
      matrix3x3x3[i][j][z] = i + j + z;
    }
  }
}

for (let i = 0; i < matrix3x3x3.length; i++) {
  for (let j = 0; j < matrix3x3x3[i].length; j++) {
    for (let z = 0; z < matrix3x3x3[i][j].length; z++) {
      console.log(matrix3x3x3[i][j][z]);
    }
  }
}

