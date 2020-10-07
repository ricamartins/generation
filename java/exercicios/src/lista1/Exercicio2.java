package lista1;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num1, num2, num3;
		
		System.out.print("Digite o valor do primeiro número: ");
		num1 = scanner.nextInt();
		System.out.print("Digite o valor do segundo número: ");
		num2 = scanner.nextInt();
		System.out.print("Digite o valor do terceiro número: ");
		num3 = scanner.nextInt();

		if (num1 < num2) {
			if (num1 < num3) {
				if (num2 < num3) {
					System.out.printf("%d %d %d", num1, num2, num3);
				} else {
					System.out.printf("%d %d %d", num1, num3, num2);
				}
			} else {
				System.out.printf("%d %d %d", num3, num1, num2);
			}
		} else if (num2 < num3) {
			if (num1 < num3) {
				System.out.printf("%d %d %d", num2, num1, num3);
			} else {
				System.out.printf("%d %d %d", num2, num3, num1);
			}
		} else {
			System.out.printf("%d %d %d", num3, num2, num1);
		}
		
		scanner.close();
	}
}
