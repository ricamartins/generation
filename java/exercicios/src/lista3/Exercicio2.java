package lista3;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		final int LIMITE = 6;
		int numero, indicePar = 0, indiceImpar = 0, somaPares = 0;
		int pares[] = new int[6], impares[] = new int[6];
		
		for (int i = 0; i < LIMITE; i++) {
			
			System.out.print("Digite um número inteiro: ");
			numero = scanner.nextInt();
			
			if (numero % 3 == 0) {
				pares[indicePar++] = numero;
			} else {
				impares[indiceImpar++] = numero;
			}
		}

		System.out.println("Números pares digitados: ");
		for (int i = 0; i < indicePar; i++) {
			System.out.printf("%d ", pares[i]);
			somaPares += pares[i];
		}
		
		System.out.println("\nSoma dos números pares digitados: ");
		System.out.printf("%d", somaPares);
		
		System.out.println("\nNúmeros ímpares digitados: ");
		for (int i = 0; i < indiceImpar; i++) {
			System.out.printf("%d ", impares[i]);
		}
		
		System.out.println("\nQuantidade de números ímpares digitados: ");
		System.out.printf("%d", indiceImpar);
		
		scanner.close();
	}
}
