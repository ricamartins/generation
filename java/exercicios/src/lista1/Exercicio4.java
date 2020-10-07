package lista1;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double numero;
		
		System.out.print("Digite um número: ");
		numero = scanner.nextDouble();
		
		if (numero % 2 == 0) {
			if (numero > 0) {
				System.out.printf("O número %f é par e sua raiz quadrada é %f", numero, Math.sqrt(numero));				
			} else {
				System.out.printf("O número %f é par e sua raiz quadrada é %fi", numero, Math.sqrt(Math.abs(numero)));
			}
		} else {
			System.out.printf("O número %f é ímpar e elevando-o ao quadrado temos %f", numero, Math.pow(numero, 2));
		}

		scanner.close();
	}
}
