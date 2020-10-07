package portugol;

import java.util.Scanner;

public class L4E3 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int[][] N1 = new int[4][6], N2 = new int[4][6], M1 = new int[4][6], M2 = new int[4][6];

				for (int i = 0; i < 4; i++) {
					for (int j = 0; j < 6; j++) {
						System.out.printf("Digite o valor da posição [%d][%d]: ", (i + 1), (j + 1));
						N1[i][j] = read.nextInt();
					}
				}

				for (int i = 0; i < 4; i++) {
					for (int j = 0; j < 6; j++) {
						System.out.printf("Digite o valor da posição [%d][%d]: ", (i + 1), (j + 1));
						N2[i][j] = read.nextInt();
					}
				}

				for (int i = 0; i < 4; i++) {
					for (int j = 0; j < 6; j++) {
						M1[i][j] = N1[i][j] + N2[i][j];
						M2[i][j] = N1[i][j] - N2[i][j];
					}
				}

				for (int i = 0; i < 4; i++) {
					for (int j = 0; j < 6; j++) {
						System.out.printf("[%d]", M1[i][j]);
					}
					System.out.println();
				}

				for (int i = 0; i < 4; i++) {
					for (int j = 0; j < 6; j++) {
						System.out.printf("[%d]", M2[i][j]);
					}
					System.out.println();
				}
				
				read.close();
	}
}
