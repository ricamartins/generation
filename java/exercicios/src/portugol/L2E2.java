package portugol;

import java.util.Scanner;

public class L2E2 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		String codigo;
		double horasTrabalhadas, salarioExcedente = 0.0, salarioBase = 500.0, salarioTotal;
		
		System.out.print("Digite seu código: ");
		codigo = read.next();
		System.out.print("Digite a quantidade de horas trabalhadas: ");
		horasTrabalhadas = read.nextDouble();
		
		if (horasTrabalhadas > 50) {
			salarioExcedente = (horasTrabalhadas - 50) * 20;
		}

		salarioTotal = salarioExcedente + salarioBase;
		System.out.printf("O operário de código: %s tem um salário total de R$ %.2f e um salário excedente de R$ %.2f", codigo, salarioTotal, salarioExcedente);
	
		read.close();
	}
}
