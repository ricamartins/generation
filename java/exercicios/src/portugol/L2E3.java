package portugol;

import java.util.Scanner;

public class L2E3 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		double num1, num2, num3, num4;
		
		System.out.print("Digite o primeiro n�mero: ");
		num1 = read.nextDouble();
		System.out.print("Digite o segundo n�mero: ");
		num2 = read.nextDouble();
		System.out.print("Digite o terceiro n�mero: ");
		num3 = read.nextDouble();
		System.out.print("Digite o quarto n�mero: ");
		num4 = read.nextDouble();

		if (Math.pow(num3, 2) >= 1000) {
			System.out.printf("O terceiro n�mero � %.2f e seu quadrado � %.2f\n", num3, Math.pow(num3, 2));
		} else {
			System.out.printf("O primeiro n�mero � %.2f e seu quadrado � %.2f\n", num1, Math.pow(num1, 2));
			System.out.printf("O segundo n�mero � %.2f e seu quadrado � %.2f\n", num2, Math.pow(num2, 2));
			System.out.printf("O terceiro n�mero � %.2f e seu quadrado � %.2f\n", num3, Math.pow(num3, 2));
			System.out.printf("O quarto n�mero � %.2f e seu quadrado � %.2f\n", num4, Math.pow(num4, 2));
		}

		read.close();
	}
}
