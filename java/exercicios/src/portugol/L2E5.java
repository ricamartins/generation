package portugol;

import java.util.Scanner;

public class L2E5 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		double indicePoluicao, NIVEL1 = 0.3, NIVEL2 = 0.4, NIVEL3 = 0.5;
		
		System.out.print("Digite o �ndice de polui��o: ");
		indicePoluicao = read.nextDouble();

		if (indicePoluicao >= NIVEL3) {
			System.out.println("Enviando notifica��es para todas as empresas para paralizarem suas atividades");
		} else if (indicePoluicao >= NIVEL2) {
			System.out.println("Enviando intima��es para as empresas do grupo 1 e 2 para suspenderem suas atividades");
		} else if (indicePoluicao >= NIVEL1) {
			System.out.println("Enviando intima��es para as empresas do grupo 1 para suspenderem suas atividades");
		} else {
			System.out.println("�ndice de polui��o aceit�vel");
		}

		read.close();
	}
}
