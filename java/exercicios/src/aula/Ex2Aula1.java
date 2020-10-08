package aula;

import java.util.Scanner;

public class Ex2Aula1 {
	
	public static void main(String[] args) {

		/*
		// Exercicio 1
		int i, j;
		for (i = 1; i <= 10; i++) System.out.println(i);
		i = 1; do {System.out.println(i); i++;} while(i <= 10);
		i = 1; while (i <= 10) {System.out.println(i); i++;}
	
		// Exercicio 2
		Scanner scanner = new Scanner(System.in);
		i = 0; do { System.out.println(++i);
			System.out.println("Deseja continuar (true) para sim (false) para não: ");
		} while(scanner.nextBoolean());
		*/
		
		/*
		int i, j;
		// Exercicio 3
		for (i = 1; i <= 10; i++) {
			System.out.println("Tabuada do " + i);
			for (j = 1; j <= 10; j++) {
				System.out.printf("%d X %d = %d\n", i, j, (i *j));
			}
		}
		*/
		/*
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o número da tabuada: ");
		int numero = scanner.nextInt();
		System.out.println("Tabuada do " + numero);
		for (int i = 1; i <= 10; i++) {
			System.out.println(numero + " X " + i + " = " + numero * i);
		}
		scanner.close();
		*/
		int a = 10, b = 5;
		
		System.out.println("A: "+ a + " B: " + b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("A: "+ a + " B: " + b);
	
		char[] frase1 = "ave".toCharArray(), frase2 = "dia".toCharArray();
		
		System.out.printf("Frase 1: %s Frase 2: %s\n", frase1.toString(), frase2.toString());
		
		for (int i = 0; i < 3; i++) {
			frase1[i] = (char)((int) frase1[i] + (int) frase2[i]);
			frase2[i] = (char)((int) frase1[i] - (int) frase2[i]);
			frase1[i] = (char)((int) frase1[i] - (int) frase2[i]);
		}

		System.out.printf("Frase 1: %s Frase 2: %s\n", frase1.toString(), frase2.toString());
	}
}
