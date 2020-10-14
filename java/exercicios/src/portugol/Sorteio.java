package portugol;

import java.util.Random;
import java.util.Scanner;

public class Sorteio {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		
		final int TOTAL_ALUNOS = 37;
		String alunos[] = {"Bruna dos Santos", "Bruno Correia da Costa", "Bruno de Freitas Sousa", "Carla Cristina Concei��o de Paula", "Christian Garcia Amantino", "Cleiton Ortega dos Santos", "Debora Miranda Carmona", "Everton Luiz Ros�rio de Oliveira", "Gabriel Reis Ritter", "Gildenor Junior da Silva Costa", "Guilherme Marcionilo Pedroso do Rosario Silva", "Herick Willians Canhete Rocha", "Jacqueline Alves Barbosa", "Jo�o Victor dos Santos Rigoleto", "Jonathan Cavalcanti De Paula", "Juliana Cavalaro de Oliveira", "Karina Soares Lima", "Leonardo Iamur Terra", "Lysandro Andrade Martin", "Matheus Araujo de moraes", "Matheus Fernandes Rodrigues", "Matheus Trindade Torok", "M�nica dos santos ribeiro", "Nat�lia Lopes moreno", "Phelipe Almeida de Souza", "Rafaela de Albuquerque", "Ricardo Martins Corr�a", "Sarah Lidia De Oliveira Braia", "Stefanie Dias Costa", "Tiago Diniz Gomes", "Victor Augusto de Souza Tavares", "Vivian Rodrigues Nakano", "Washington pereira dos santos", "Wellington Vieira", "Wesley Bueno da Silva", "Yago Tonoli Domingues", "Zaine de Queiros Jesus"};
		String alunosRestantes[] = new String[TOTAL_ALUNOS];
		int totalAlunosRestantes = TOTAL_ALUNOS;
		int sorteado, pessoasPorGrupo, contadorGrupo, grupo = 1;
		
		copia_alunos(alunos, alunosRestantes, TOTAL_ALUNOS);
		
		System.out.print("Digite a quantidade de pessoas por grupo: ");
		pessoasPorGrupo = scanner.nextInt();
		contadorGrupo = pessoasPorGrupo;
		for (int i = 0; i < TOTAL_ALUNOS; i++, totalAlunosRestantes--) {
			
			if (contadorGrupo == pessoasPorGrupo) {
				System.out.printf("\nGrupo %d\n", grupo++);
				contadorGrupo = 1;
			} else {
				contadorGrupo++;
			}
			
			sorteado = random.nextInt(totalAlunosRestantes);
			System.out.println(alunosRestantes[sorteado]);
			retira_aluno(alunosRestantes, sorteado, totalAlunosRestantes);
		}
		
		scanner.close();
	}
	
	public static void copia_alunos(String alunos[], String alunosRestantes[], int totalAlunos) {
		for (int i = 0; i < totalAlunos; i++) alunosRestantes[i] = alunos[i];
	}
	
	public static void retira_aluno(String alunos[], int indiceAluno, int totalAlunos) {
		for (int i = indiceAluno; i < (totalAlunos - 1); i++) alunos[i] = alunos[i + 1];
	}
}