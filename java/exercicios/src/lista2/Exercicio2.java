package lista2;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int pares = 0;
		
		for (int i = 0; i < 10; i++) {
			System.out.print("Digite um n�mero inteiro: ");
			pares += (scanner.nextInt() % 2 == 0) ? 1 : 0;
		}

		System.out.println("N�mero de pares: " + pares);
		System.out.println("N�mero de �mpares: " + (10 - pares));
		
		scanner.close();
	}
}
