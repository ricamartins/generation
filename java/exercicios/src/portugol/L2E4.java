package portugol;

import java.util.Scanner;

public class L2E4 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int numero;
		
		System.out.print("Digite um n�mero inteiro: ");
		numero = read.nextInt();

		if ((numero % 2) == 0) {
			if (numero > 0) {
				System.out.println("O n�mero � positivo e � par");
			} else if (numero < 0) {
				System.out.println("O n�mero � negativo e � par");
			} else {
				System.out.println("O n�mero � 0 (zero)");
			}
		} else {
			if (numero > 0) {
				System.out.println("O n�mero � positivo e � �mpar");
			} else if (numero < 0) {
				System.out.println("O n�mero � negativo e � �mpar");
			} else {
				System.out.println("O n�mero � 0 (zero)");
			}
		}
		
		read.close();
	}
}
