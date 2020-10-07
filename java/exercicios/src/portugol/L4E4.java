package portugol;

import java.util.Scanner;

public class L4E4 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int[][] matriz = new int[3][3];
		int somaTotal = 0, somaDiagonal = 0;
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.printf("Digite o valor da posição [%d][%d]: ", (i + 1), (j + 1));
				matriz[i][j] = read.nextInt();
			}
		}
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				somaTotal += matriz[i][j];
				if (i == j) {
					somaDiagonal += matriz[i][j];
				}
			}
		}
		
		System.out.println("A soma de todos os valores da matriz é " + somaTotal);
		System.out.println("A soma de todos os valores da diagonal principal da matriz é " + somaDiagonal);
		
		read.close();
	}
}
