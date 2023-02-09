/* 
    Let e Const no lugar de var
    
    A partir do ES2015, a var foi substitiida 
    por let e const para evitar resultados 
    incorretos. O var aceita o mesmo nome de 
    variável sendo declarada, ja o let nao.
*/

var framework = 'Angular';
var framework = 'React';

console.log(framework); // React

// Let (ES2015)

let language = 'JavaScript';
//let language = 'Ruby'; //lanca um erro
console.log(framework); // React

// Const: valores para leitura

const PI = 3.141593;
// PI = 3.0; //lanca um erro
console.log(PI);

/*
    "Ao trabalhar com objetos, um const somente para
    leitura permite que as propriedades do objeto 
    recebam novos valores ou sejam atualizadas" (p.55), mas 
    a referencia da variavel não.
*/

const jsFramework = {
    name: 'Angular'
}

/* Erro: não é possível atribuir outra referência ao objeto

jsFramework.name = 'React';

const jsFramework = {
    name: 'Vue'
}
*/

