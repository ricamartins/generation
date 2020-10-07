package portugol;

import java.util.Scanner;

public class L4E1 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int[] pontuacoes = new int[5];
		int maiorPontuacao = 0;
		
		for (int i = 0; i < 5; i++) {
			System.out.print("Digite a pontuação da atividade: ");
			pontuacoes[i] = read.nextInt(); 
		}
		
		System.out.println("Pontuações:");
		for (int i = 0; i < 5; i++) {
			System.out.println(pontuacoes[i]);
			if (pontuacoes[i] > maiorPontuacao) {
				maiorPontuacao = pontuacoes[i];
			}
		}
		
		System.out.println("A maior pontuação foi " + maiorPontuacao);

		read.close();
	}
}
