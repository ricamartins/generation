package portugol;

import java.util.Scanner;

public class ExAula1 {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		final int ANO_ATUAL = 2020;
		String nome;
		int anoNascimento, idade;
		char chefeFamilia, sexo;
		int valor = -4;
		
		System.out.print("Digite seu nome: ");
		nome = tec.next();
		System.out.print("Digite seu ano de nascimento: ");
		anoNascimento = tec.nextInt();
		System.out.print("Voc� � chefe de fam�lia (s) ou (n): ");
		chefeFamilia = tec.next().toLowerCase().charAt(0);
		System.out.print("Voc� � masculino ou feminino (m) ou (f): ");
		sexo = tec.next().toLowerCase().charAt(0);
		
		idade = ANO_ATUAL - anoNascimento;
		
		if (idade >= 18 && chefeFamilia == 's') {
			if (sexo == 'f') {
				System.out.printf("Ol�, %s, voc� tem direito a R$ 1200,00", nome);
			} else {
				System.out.printf("Ol�, %s, voc� tem direito a R$ 600,00", nome);
			}
		} else {
			System.out.printf("Ol�, %s, voc� n�o tem direito ao aux�lio emergencial", nome);
		}
		
		tec.close();
	}
}
