package portugol;

import java.util.Scanner;

public class L1E5 {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		double primeira, segunda, terceira, media;
		
		System.out.print("Digite a primeira nota: ");
		primeira = tec.nextDouble();
		
		System.out.print("Digite a segunda nota: ");
		segunda = tec.nextDouble();
		
		System.out.print("Digite a terceira nota: ");
		terceira = tec.nextDouble();
		
		media = ((primeira * 2) + (segunda * 3) + (terceira * 5)) / 10;
		System.out.printf("A média ponderada é %.2f", media);
		
		tec.close();
	}

}
