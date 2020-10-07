package portugol;

import java.util.Scanner;

public class L2E1 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		double peso, excesso = 0.0, multa = 0.0;
		int LIMITE = 50;
		
		System.out.print("Digite o peso de tomates em kg: ");
		peso = read.nextDouble();

		if (peso > LIMITE) {
			excesso = peso - LIMITE;
			multa = excesso * 4;
		}
		
		System.out.printf("O excesso de tomates foi de %.2f kg e a multa foi de R$ %.2f", excesso, multa);

		read.close();
	}
}
