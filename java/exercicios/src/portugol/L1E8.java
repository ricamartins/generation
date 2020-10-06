package portugol;

import java.util.Scanner;

public class L1E8 {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		double custoFabrica, valorDistribuidor, impostos, valorFinal;
		
		System.out.print("Informe o custo de fábrica: ");
		custoFabrica = tec.nextDouble();
		
		valorDistribuidor = custoFabrica * 0.28;
		impostos = custoFabrica * 0.45;
		valorFinal = custoFabrica + valorDistribuidor + impostos;
		
		System.out.printf("O preço final do carro para o consumidor é de R$ %.2f", valorFinal);
		
		tec.close();
	}

}
