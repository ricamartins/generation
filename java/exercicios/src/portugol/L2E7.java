package portugol;

import java.util.Scanner;

public class L2E7 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		double base, altura;
		
		System.out.print("Digite o valor da base do triângulo: ");
		base = read.nextDouble();
		System.out.print("Digite o valor da altura do triângulo: ");
		altura = read.nextDouble();

		if (base > 0 && altura > 0) {
			System.out.println("A área do triângulo é de " + (base * altura / 2));
		} else {
			System.out.println("Valores inválidos para base e/ou altura");
		}

		read.close();
	}
}
