package lista1;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num1, num2, num3;
		int[] ordem = new int[3];
		
		System.out.print("Digite o valor do primeiro n�mero: ");
		num1 = scanner.nextInt();
		System.out.print("Digite o valor do segundo n�mero: ");
		num2 = scanner.nextInt();
		System.out.print("Digite o valor do terceiro n�mero: ");
		num3 = scanner.nextInt();
		
		ordem = ((num1<num2) ? ((num1<num3) ? ((num2<num3) ? new int[]{num1, num2, num3} : new int[]{num1, num3, num2}) : new int[]{num3, num1, num2}) : ((num2 < num3) ? ((num1 < num3) ? new int[]{num2, num1, num3} : new int[]{num2, num3, num1}) : new int[]{num3, num2, num1}));
		
		System.out.printf("%d %d %d", ordem[0], ordem[1], ordem[2]);
		
		scanner.close();
	}
}
