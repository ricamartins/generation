package portugol;

import java.util.Scanner;

public class L1E4 {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		int a, b, c;
		double d, r, s;
		
		System.out.print("Digite o valor de A: ");
		a = tec.nextInt();
		System.out.print("Digite o valor de B: ");
		b = tec.nextInt();
		System.out.print("Digite o valor de C: ");
		c = tec.nextInt();
		
		r = (a + b) * (a + b);
		s = (b + c) * (b + c);
		d = (r + s) / 2;
		
		System.out.printf("O valor de D é %.2f", d);

		tec.close();
	}

}
