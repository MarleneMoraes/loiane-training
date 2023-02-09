/*
    Genericos (Generics)
    "Ao passar o tipo T dinamicamente para interface
    Comparable usando o operador <>, podemos especificar 
    o tipo do argumento da funcao CompareTo [...]. Esse 
    recurso e util para que possamos garantir que estamos 
    comparando objetos do mesmo tipo." (p.77)
*/

interface Comparable<T> {
    compareTo(b: T): number;
}

class MyObject implements Comparable<MyObject> {
    age: number;
    compareTo(b:MyObject): number {
        if (this.age === b.age) {
            return 0;
        }
        return this.age > b.age ? 1 : -1;
    }
}