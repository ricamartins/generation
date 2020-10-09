package lista3;

import java.util.Scanner;

public class Exercicio4 {

	public static void imprimiMatriz(double matriz[][], String nomeMatriz) {
		System.out.println("Matriz " + nomeMatriz);
		for (int i = 0; i < matriz.length; i++) {
			System.out.print(" [");
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.printf(" %.2f ", matriz[i][j]);
			}
			System.out.print("]\n");
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		final int LINHA = 2, COLUNA = 2;
		double matrizA[][] = new double[LINHA][COLUNA], matrizB[][] = new double[LINHA][COLUNA], matrizC[][] = new double[LINHA][COLUNA];;
		byte opcao;
		
		for (int i = 0; i < LINHA; i++) {
			for (int j = 0; j < COLUNA; j++) {
				System.out.printf("Insira um número para a posição [%d][%d] da Matriz A: ", (i+1), (j+1));
				matrizA[i][j] = scanner.nextDouble();
			}
		}

		for (int i = 0; i < LINHA; i++) {
			for (int j = 0; j < COLUNA; j++) {
				System.out.printf("Insira um número para a posição [%d][%d] da Matriz B: ", (i+1), (j+1));
				matrizB[i][j] = scanner.nextDouble();
			}
		}
		
		//Sugestão: criar um loop para o usúario decidir mais de uma opção
		do {
			
			System.out.println("Escolha uma das opções pelo número entre parênteses: ");
			System.out.println("(1) somar as duas matrizes\n(2) subtrair a primeira matriz da segunda\n(3) adicionar uma constante as duas matrizes\n(4) imprimir as matrizes\n(0) sair do programa");
			opcao = scanner.nextByte();
			
			switch (opcao) {
				case 0:
					System.out.println("Saindo do programa...");
					break;
				case 1:
					System.out.println("Somando as matrizes...");
					for (int i = 0; i < LINHA; i++) {
						for (int j = 0; j < COLUNA; j++) {
							matrizC[i][j] = matrizA[i][j] + matrizB[i][j];
						}
					}
					break;
					
				case 2:
					System.out.println("Subtraindo as matrizes...");
					for (int i = 0; i < LINHA; i++) {
						for (int j = 0; j < COLUNA; j++) {
							matrizC[i][j] = matrizA[i][j] - matrizB[i][j];
						}
					}
					break;
				
				case 3:
					System.out.print("Digite o valor da constante: ");
					final int CONSTANTE = scanner.nextInt();
					System.out.println("Somando o valor da constante as matrizes...");
					for (int i = 0; i < LINHA; i++) {
						for (int j = 0; j < COLUNA; j++) {
							matrizA[i][j] += CONSTANTE;
							matrizB[i][j] += CONSTANTE;
						}
					}
					break;
					
				case 4:
					System.out.println("Imprimindo as matrizes...");
					imprimiMatriz(matrizA, "A");
					imprimiMatriz(matrizB, "B");
					imprimiMatriz(matrizC, "C");
					break;
				default:
					System.out.println("Opção inválida. Digite novamente");
			}
			
		} while (opcao != 0);
		
		scanner.close();
	}
}
