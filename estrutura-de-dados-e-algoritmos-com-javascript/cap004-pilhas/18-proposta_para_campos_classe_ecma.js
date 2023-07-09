/* Proposta para campos de classe na ECMAScript */

// O TypeScript tem o modificador privado para propriedades e metodos de classe
// Entretanto, quando compilado para o JavaScript, as propriedades e metodos tornam-se publicos
// E possivel declarar propriedades privadas usando o simbolo # antes do nome da propriedade
class Stack {
    #count = 0; 
    #items = 0;

    // metodos de Stack
}