// Adicionando e removendo elementos de uma posicao especifica
numbers.splice(5, 3); // removerá 3 elementos a partir do indice 5 do array

/* 
  Primeiro argumento -> indice a partir do qual queremos remover ou inserir
  Segundo argumento -> quantidade de elementos que queremos remover
  Terceiro+ argumento -> valores que gostariamos de inserir no array

*/ 
numbers.splice(5, 0, 2, 3, 4); // remove nenhum elemento
numbers.splice(5, 3, 2, 3, 4); // remove tres elementos