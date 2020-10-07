package portugol;

import java.util.Scanner;

public class L2E7 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		double base, altura;
		
		System.out.print("Digite o valor da base do tri�ngulo: ");
		base = read.nextDouble();
		System.out.print("Digite o valor da altura do tri�ngulo: ");
		altura = read.nextDouble();

		if (base > 0 && altura > 0) {
			System.out.println("A �rea do tri�ngulo � de " + (base * altura / 2));
		} else {
			System.out.println("Valores inv�lidos para base e/ou altura");
		}

		read.close();
	}
}
