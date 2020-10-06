package utilidades;

import java.util.Scanner;

public class QuartoPrograma {

	public static void main(String[] args) {
		String nome;
		int anoNascimento, idade;
		double salario;
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Escreva seu nome: ");
		nome = teclado.next();
		System.out.print("Escreva o ano em que nasceu: ");
		anoNascimento = teclado.nextInt();
		System.out.print("Escreva seu salário: ");
		salario = teclado.nextDouble();
		idade = 2020 - anoNascimento;
		System.out.printf("Oi, %s, você tem %d anos e recebe R$ %.2f", nome, idade, salario);
	
		teclado.close();
	}

}
