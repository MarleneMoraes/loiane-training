/*
    Escopo das variaveis

    "Local em que podemos acessar a variavel no algoritmo 
    (tambem pode ser em uma funcao quando trabalhamos com 
    escopos de funcao). As variaveis podem ser locais ou 
    globais." (p. 34)
*/

var myVariable = 'global';
myOtherVariable = 'global';

function myFunction(){
    var myVariable = 'local';
    return myVariable;
}

function myOtherFunction(){
    myOtherVariable = 'local';
    return myOtherVariable;
}

console.log(myVariable); // global
console.log(myFunction()); // local

console.log(myOtherVariable); // global
console.log(myOtherFunction()); // local

// alteracao do valor da variavel em myOtherFunction()
console.log(myOtherVariable); // local