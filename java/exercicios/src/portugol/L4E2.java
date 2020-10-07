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
			System.out.printf("Lan�amento n�mero %d: %d\n", (i + 1), lancamentos[i]);
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

		System.out.println("A m�dia aritm�tica dos lan�amentos � " + (soma / 10));
		System.out.println("O n�mero de ocorr�ncias do maior valor � " + ocorrencias);
	}
}
