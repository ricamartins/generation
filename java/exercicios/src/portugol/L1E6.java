package portugol;

import java.util.Scanner;

public class L1E6 {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		double x1, x2, y1, y2, distancia;
		
		System.out.print("Digite a coordenada x do primeiro ponto: ");
		x1 = tec.nextDouble();
		
		System.out.print("Digite a coordenada y do primeiro ponto: ");
		x2 = tec.nextDouble();
		
		System.out.print("Digite a coordenada x do segundo ponto: ");
		y1 = tec.nextDouble();
		
		System.out.print("Digite a coordenada y do segundo ponto: ");
		y2 = tec.nextDouble();
		
		distancia = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
		System.out.printf("A distância entre os dois pontos é de %.2f", distancia);
		
		tec.close();
	}

}
