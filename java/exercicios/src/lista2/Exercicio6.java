package lista2;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double soma = 0, numero, contador = 0;
		
		do {
			System.out.print("Digite um número inteiro (zero para sair): ");
			numero = scanner.nextInt();
			if (numero % 3 == 0) {
				soma += numero;
				contador++;
			}
		} while (numero != 0);
		
		System.out.println("A média dos números inseridos é " + soma / --contador);
		
		scanner.close();
	}
}
