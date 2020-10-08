package lista2;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int soma = 0, contador = 0, numero;
		
		do {
			System.out.print("Digite um número inteiro (zero para sair): ");
			numero = scanner.nextInt();
			soma += numero;
			contador++;
		} while (numero != 0);

		System.out.println("A média dos números inseridos é " + soma / contador);
		
		scanner.close();
	}
}
