package portugol;

import java.util.Scanner;

public class L3E6 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int numero, soma = 0;

		System.out.print("Digite um número: ");
		numero = read.nextInt();

		do {
			soma += numero;
			numero--;
		} while (numero > 0);

		System.out.println("A soma de todos os números naturais até o número informado é " + soma);
	
		read.close();
	}
}
