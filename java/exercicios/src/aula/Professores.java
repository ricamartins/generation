package aula;

import java.util.ArrayList;
import java.util.Scanner;

public class Professores {

	public static void main(String[] args) {
		final int TOTAL_PROFESSORES = 3;
		Scanner scanner = new Scanner(System.in);
		//Professor professores[] = new Professor[3];
		ArrayList<Professor> professores = new ArrayList<Professor>();
		String nome, disciplina;
		int quantidadeAulas;
		
		for (int i = 0; i < TOTAL_PROFESSORES; i++) {
			System.out.printf("Digite o nome do(a) %dº professor(a): ", (i + 1));
			nome = scanner.nextLine();
			System.out.printf("Digite a disciplina do(a) %dº professor(a): ", (i + 1));
			disciplina = scanner.nextLine();
			System.out.printf("Digite a quantidade de aulas que o(a) %dº professor(a) tem: ", (i + 1));
			quantidadeAulas = scanner.nextInt();
			scanner.nextLine();
			Professor professor = new Professor(nome, disciplina, quantidadeAulas);
			professores.add(professor);
		}
		
		for (int i = 0; i < TOTAL_PROFESSORES; i++) {
			System.out.printf("%s tem %d aulas da disciplina %s\n", professores.get(i).nome, professores.get(i).quantidadeAulas, professores.get(i).disciplina);
		}
		
		scanner.close();
	}

}
