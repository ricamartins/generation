package portugol;

import java.util.Scanner;

public class L3E3 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int somaTotal = 0, quantidadeValores = 0, valor = 1;
		
		while (valor > 0) {
			
			System.out.print("Digite um valor: ");
			valor = read.nextInt();

			if (valor > 0) {
				somaTotal += valor;
				quantidadeValores++;
			} else {
				break;
			}
		}
		
		System.out.println("A soma total foi de " + somaTotal);
		System.out.println("A quantidade de valores inseridos foi de " + quantidadeValores);
		System.out.println("A média dos valores é " + (somaTotal / quantidadeValores));
		
		read.close();
	}
}
