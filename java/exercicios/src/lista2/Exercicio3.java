package lista2;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int idade, menor21 = 0, maior50 = 0;
		
		while (true) {
			System.out.print("Informe a idade: ");
			idade = scanner.nextInt();
			
			if (idade == -99) break;
			
			menor21 += (idade < 21) ? 1 : 0;
			maior50 += (idade > 50) ? 1 : 0;	
		}
		
		System.out.println("Total de pessoas com menos de 21 anos: " + menor21);
		System.out.println("Total de pessoas com mais de 50 anos: " + maior50);

		scanner.close();
	}
}
