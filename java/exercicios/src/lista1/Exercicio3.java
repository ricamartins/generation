package lista1;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int idade;
		
		System.out.print("Informe sua idade: ");
		idade = scanner.nextInt();
		
		if (idade < 10) {
			System.out.println("Você é novo demais para entrar em uma categoria");
		}else if (idade <= 14) {
			System.out.println("Você está na categoria Infantil");
		} else if (idade <= 17) {
			System.out.println("Você está na categoria Juvenil");
		} else if (idade <= 25) {
			System.out.println("Você está na categoria Adulto");
		} else {
			System.out.println("Você é velho demais para entrar em uma categoria");
		}

		scanner.close();
	}
}
