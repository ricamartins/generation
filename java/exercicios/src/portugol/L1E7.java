package portugol;

import java.util.Scanner;

public class L1E7 {

	public static void main(String[] args) {
		int a, b, c, d, e, f, denominador;
		double x, y;
		Scanner tec = new Scanner(System.in);
		
		System.out.print("Digite o valor de a: ");
		a = tec.nextInt();
		System.out.print("Digite o valor de b: ");
		b = tec.nextInt();
		System.out.print("Digite o valor de c: ");
		c = tec.nextInt();
		System.out.print("Digite o valor de d: ");
		d = tec.nextInt();
		System.out.print("Digite o valor de e: ");
		e = tec.nextInt();
		System.out.print("Digite o valor de f: ");
		f = tec.nextInt();
		
		denominador = (a * e) - (b * d);
		x = ((c * e) - (b * f)) / denominador;
		y = ((a * f) - (c * d)) / denominador;
		
		System.out.printf("x: %.2f y: %.2f", x, y);
		
		tec.close();
	}

}
