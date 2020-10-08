package lista2;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int soma = 0, numero;
		
		do {
			System.out.print("Digite um número: ");
			numero = scanner.nextInt();
			soma += numero;
		} while (numero != 0);

		System.out.println("A soma dos números inseridos é " + soma);
		
		scanner.close();
	}
}
