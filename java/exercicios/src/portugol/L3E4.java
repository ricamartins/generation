package portugol;

import java.util.Scanner;

public class L3E4 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int numero;
		
		System.out.print("Digite um número: ");
		numero = read.nextInt();

		System.out.println(numero);
		while (numero <= 100) {
			numero *= 3;
			System.out.println(" " + numero);

			if (numero <= 0) {
				break;
			}
		}

		read.close();
	}
}
