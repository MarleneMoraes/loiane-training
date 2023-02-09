// Escopo de variaveis let e const

let movie = 'Lord of the Rings';
//var movie = 'Batman vs Superman' //ERRO: variavel já declarada

function starWarsFan() {
    const movie = 'Star Wars'; // escopo local
    return movie;
}

function marvelFan() {
    const movie = 'The Avengers';
    return movie;
}

function blizzardFan() {
    const isFan = true;
    let phrase = 'Warcraft';
    console.log('Before if: ' + phrase);

    if (isFan) {
        let phrase = 'initial text'; // escopo local do if
        phrase = 'For the Horde!'; //alteracao do valor de phrase
        console.log('Inside if: ' + phrase);
    }

    phrase = 'For the Alliance!';
    console.log('After if: ' + phrase);
}

console.log(movie); // Lord of the Rings
console.log(starWarsFan()); // Star Wars
console.log(marvelFan()); // The Avengers
console.log(movie);  // Lord of the Rings

blizzardFan(); 
/* 
    Before if: Warcraft
    Inside if: For the Horde!
    After if: For the Alliance!
*/