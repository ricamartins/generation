package lista1;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double numero;
		
		System.out.print("Digite um n�mero: ");
		numero = scanner.nextDouble();
		
		if (numero % 2 == 0) {
			if (numero > 0) {
				System.out.printf("O n�mero %f � par e sua raiz quadrada � %f", numero, Math.sqrt(numero));				
			} else {
				System.out.printf("O n�mero %f � par e sua raiz quadrada � %fi", numero, Math.sqrt(Math.abs(numero)));
			}
		} else {
			System.out.printf("O n�mero %f � �mpar e elevando-o ao quadrado temos %f", numero, Math.pow(numero, 2));
		}

		scanner.close();
	}
}
