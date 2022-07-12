package com.loiane.cursojava.aula49;

class TestandoFinally {

	public static void main(String[] args) {
		int[] numeros = { 4, 8, 16, 32, 64, 128 };
		int[] denominadores = { 2, 0, 4, 8, 0 };

		for (int i = 0; i < numeros.length; i++) {
			try {
				System.out.println(numeros[i] + "/" + denominadores[i] + " = " + (numeros[i] / denominadores[i]));
			} catch (ArithmeticException e) {
				System.out.println("Erro ao dividir por zero");
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Posi��o do array inv�lida");
			} finally { //SEMPRE ser� executado ap�s o teste tanto do try, quanto do catch
				System.out.println("Essa linha � impressa sempre ap�s o try ou o catch");
			}

		}

	}
}
