package portugol;

import java.util.Scanner;

public class L2E8 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		double numero;
		
		System.out.print("Digite um número: ");
		numero = read.nextDouble();
		
		if (numero > 100) {
			System.out.println("O número é " + numero);
		} else  {
			numero = 0;
			System.out.println("O número é " + numero);
		}

		read.close();
	}
}
