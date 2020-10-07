package portugol;

import java.util.Scanner;

public class L3E1 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		double salario, salarioTotal = 0, maiorSalario = 0, filhosTotal = 0, salarioAte100 = 0;
		int habitantes = 20, filhos;
		
		for (int i = habitantes; i > 0; i--) {
			
			System.out.print("Digite seu sal�rio: ");
			salario = read.nextDouble();
			
			System.out.print("Digite quantos filhos voc� tem: ");
			filhos = read.nextInt();
			
			salarioTotal += salario;
			filhosTotal += filhos;
			
			if (salario > maiorSalario) {
				maiorSalario = salario;
			}
			if (salario <= 100) {
				salarioAte100++;
			}
		}
		System.out.println("A m�dia salarial � de R$ " + (salarioTotal / habitantes));
		System.out.println("A m�dia de filhos � de " + (filhosTotal / habitantes) + " filhos por pessoa");
		System.out.println("O maior sal�rio � de R$ " + maiorSalario);
		System.out.println("O percentual de pessoas com sal�rio menor ou igual a R$ 100 � de " + (salarioAte100 / habitantes * 100) + "%");
		
		read.close();
	}
}
