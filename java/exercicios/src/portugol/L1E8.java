package portugol;

import java.util.Scanner;

public class L1E8 {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		double custoFabrica, valorDistribuidor, impostos, valorFinal;
		
		System.out.print("Informe o custo de f�brica: ");
		custoFabrica = tec.nextDouble();
		
		valorDistribuidor = custoFabrica * 0.28;
		impostos = custoFabrica * 0.45;
		valorFinal = custoFabrica + valorDistribuidor + impostos;
		
		System.out.printf("O pre�o final do carro para o consumidor � de R$ %.2f", valorFinal);
		
		tec.close();
	}

}
