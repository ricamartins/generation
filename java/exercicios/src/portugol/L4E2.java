package portugol;

import java.util.Random;

public class L4E2 {

	public static void main(String[] args) {
		Random gerador = new Random();
		int[] lancamentos = new int[10] ;
		int maiorValor = 1, soma = 0, ocorrencias = 0;
		
		for (int i = 0; i < 10; i++) {
			lancamentos[i] = gerador.nextInt(5) + 1;
		}
		
		for (int i = 0; i < 10; i++) {
			System.out.printf("Lançamento número %d: %d\n", (i + 1), lancamentos[i]);
			soma += lancamentos[i];
			if (lancamentos[i] > maiorValor) {
				maiorValor = lancamentos[i];
			}
		}
		
		for (int i = 0; i < 10; i++) {
			if (lancamentos[i] == maiorValor) {
				ocorrencias++;
			}
		}

		System.out.println("A média aritmética dos lançamentos é " + (soma / 10));
		System.out.println("O número de ocorrências do maior valor é " + ocorrencias);
	}
}
