package lista3;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int matriz[][] = new int[3][4];
		int maiorQ10 = 0;
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.printf("Insira um número inteiro para a posição [%d][%d]: ", (i+1), (j+1));
				matriz[i][j] = scanner.nextInt();
				maiorQ10 += (matriz[i][j] > 10) ? 1 : 0;
			}
		}
	
		System.out.printf("Nesta matriz há %d números maior que 10", maiorQ10);
		
		scanner.close();
	}
}
