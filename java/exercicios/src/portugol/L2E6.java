package portugol;

import java.util.Scanner;

public class L2E6 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int idade;
		
		System.out.print("Digite sua idade: ");
		idade = read.nextInt();

		if (idade >= 18) {
			System.out.println("Sua categoria �: Adulto");
		} else if (idade >= 14) {
			System.out.println("Sua categoria �: Juvenil B");
		} else if (idade >= 12) {
			System.out.println("Sua categoria �: Juvenil A");
		}else if (idade >= 8) {
			System.out.println("Sua categoria �: Infantil B");
		} else if (idade >= 5) {
			System.out.println("Sua categoria �: Infantil A");
		} else {
			System.out.println("Voc� n�o tem categoria definida ainda");
		}
		
		read.close();
	}
}
