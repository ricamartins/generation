package portugol;

import java.util.Scanner;

public class L2E4 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int numero;
		
		System.out.print("Digite um número inteiro: ");
		numero = read.nextInt();

		if ((numero % 2) == 0) {
			if (numero > 0) {
				System.out.println("O número é positivo e é par");
			} else if (numero < 0) {
				System.out.println("O número é negativo e é par");
			} else {
				System.out.println("O número é 0 (zero)");
			}
		} else {
			if (numero > 0) {
				System.out.println("O número é positivo e é ímpar");
			} else if (numero < 0) {
				System.out.println("O número é negativo e é ímpar");
			} else {
				System.out.println("O número é 0 (zero)");
			}
		}
		
		read.close();
	}
}
