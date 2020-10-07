package portugol;

import java.util.Scanner;

public class L2E2 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		String codigo;
		double horasTrabalhadas, salarioExcedente = 0.0, salarioBase = 500.0, salarioTotal;
		
		System.out.print("Digite seu c�digo: ");
		codigo = read.next();
		System.out.print("Digite a quantidade de horas trabalhadas: ");
		horasTrabalhadas = read.nextDouble();
		
		if (horasTrabalhadas > 50) {
			salarioExcedente = (horasTrabalhadas - 50) * 20;
		}

		salarioTotal = salarioExcedente + salarioBase;
		System.out.printf("O oper�rio de c�digo: %s tem um sal�rio total de R$ %.2f e um sal�rio excedente de R$ %.2f", codigo, salarioTotal, salarioExcedente);
	
		read.close();
	}
}
