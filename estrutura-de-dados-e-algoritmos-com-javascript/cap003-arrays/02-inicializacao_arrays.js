// Criando e Inicializando Arrays

// Para JS, não é uma boa prática instanciar com a palavra new
// Instanciar um novo array
let daysOfWeek = new Array(); //errado
daysOfWeek = []; //certo

// Instanciar especificando seu tamanho
daysOfWeek = new Array(7);

// Passar os elementod do array diretamrnte para o seu construtor
daysOfWeek = new Array('Sunday', 'Monday', 'Tuesday', 'Wednesday', 'Thursday', 'Friday', 'Saturday');//má prática
daysOfWeek = ['Sunday', 'Monday', 'Tuesday', 'Wednesday', 'Thursday', 'Friday', 'Saturday']; //boa prática

// Quantidade de elementos no array: length
console.log(daysOfWeek.length);