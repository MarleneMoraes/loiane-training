package com.loiane.cursojava.aula75;

public class Programa {

	public static void main(String[] args) {
		String vazia = new String(); //""
		System.out.println(vazia);

		String java = new String("JAVA");
		System.out.println(java);
		
		String java1 = new String(java);
		System.out.println(java1);
		
		char[] charsJava = {'J', 'A', 'V', 'A'}; 
		String java2 = new String(charsJava);
		System.out.println(java2); // JAVA
		
		char[] abcdef = {'A', 'B', 'C', 'D', 'E', 'F'};
		String abc = new String(abcdef, 0, 3); // offset - primeiro e ultimo caracteres para buscar no array
		System.out.println(abc);
		
		byte[] ascii = {65, 66, 67, 68, 69}; // representacao da tabela ascii 
		String abcde = new String(ascii);
		System.out.println(abcde); // ABCDE
		
		String bcd = new String(ascii, 1, 3);
		System.out.println(bcd);
		
		// Atribuicao simples/direta - perigo da atribuicao no mesmo local de memoria
		// Cria-se a mesma referencia
		String java3 = "JAVA";
		String java4 = "JAVA";
		
		System.out.println(java3);
		System.out.println(java4);

	}

}
