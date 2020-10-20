package aula;

import java.util.Scanner;

public class TryCatch {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numero;
		
		numero = scanner.nextInt();
		
		System.out.println(numero + " X 2 = " + (numero *2));
		
		scanner.close();
	}

}
