package aula;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String alunos[] = {"", "Bruna dos Santos", "Bruno Correia da Costa", "Bruno de Freitas Sousa", "Carla Cristina Concei��o de Paula", "Christian Garcia Amantino", "Cleiton Ortega dos Santos", "Debora Miranda Carmona", "Everton Luiz Ros�rio de Oliveira", "Gabriel Reis Ritter", "Gildenor Junior da Silva Costa", "Guilherme Marcionilo Pedroso do Rosario Silva", "Herick Willians Canhete Rocha", "Jacqueline Alves Barbosa", "Jo�o Victor dos Santos Rigoleto", "Jonas De Oliveira Santos", "Jonathan Cavalcanti De Paula", "Juliana Cavalaro de Oliveira", "Karina Soares Lima", "Larissa Meira Dominguez", "Leonardo Iamur Terra", "Lysandro Andrade Martin", "Matheus Araujo de moraes", "Matheus Fernandes Rodrigues", "Matheus Trindade Torok", "M�nica dos santos ribeiro", "Nat�lia Lopes moreno", "Phelipe Almeida de Souza", "Rafaela de Albuquerque", "Ricardo Martins Corr�a", "Sarah Lidia De Oliveira Braia", "Stefanie Dias Costa", "Tiago Diniz Gomes", "Victor Augusto de Souza Tavares", "Vivian Rodrigues Nakano", "Washington pereira dos santos", "Wellington Vieira", "Wesley Bueno da Silva", "Yago Tonoli Domingues", "Zaine de Queiros Jesus"};
		int notas[][] = new int[40][5];
		char continua = 'S';
		int codigoAluno, nota, bimestre;
		
		do {
		
			for (int i = 1; i < alunos.length; i++) {
				System.out.printf("Nota: 1� %d 2� %d 3� %d 4� %d // C�digo: %d - Nome: %s \n", notas[i][1], notas[i][2], notas[i][3], notas[i][4], i, alunos[i]);
			}
			
			System.out.printf("Escolha um(a) aluno(a) pelo c�digo: ");
			codigoAluno = scanner.nextInt();

			System.out.print("Qual bimestre (1, 2, 3, 4)?: ");
			bimestre = scanner.nextInt();
			
			System.out.printf("Qual a nota de %s nesse bimestre?", alunos[codigoAluno]);
			nota = scanner.nextInt();
			
			notas[codigoAluno][bimestre] = nota;
			
			System.out.print("Continua Sim ou N�o? ");
			continua = scanner.next().toUpperCase().charAt(0);
			
		} while (continua == 'S');
		
		for (int i = 1; i < alunos.length; i++) {
			System.out.printf("Nota: 1� %d 2� %d 3� %d 4� %d // C�digo: %d - Nome: %s \n", notas[i][1], notas[i][2], notas[i][3], notas[i][4], i, alunos[i]);
		}
		
		scanner.close();
	}
}
