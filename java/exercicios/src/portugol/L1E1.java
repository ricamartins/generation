package portugol;

import java.util.Scanner;

public class L1E1 {
	
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		int a, m, d, dias;
		
		System.out.print("\n Digite quantos anos de idade vc tem?: ");
		a = tec.nextInt();
		System.out.print("\n Digite quantos anos de idade vc tem?: ");
		m = tec.nextInt();
		System.out.print("\n Digite quantos anos de idade vc tem?: ");
		d = tec.nextInt();
		
		dias = (365 * a) + (30 * m) + d;
		System.out.printf("Você tem %d dias de vida", dias);
		
		tec.close();
	}
}