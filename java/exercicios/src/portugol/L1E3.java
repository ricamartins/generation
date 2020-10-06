package portugol;

import java.util.Scanner;

public class L1E3 {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		int segundos = 0;
		
		System.out.println("Digite a duração do evento em segundos: ");
		segundos = tec.nextInt();
		
		int horas = segundos/3600;
		int minutos = (segundos%3600)/60;
		int segundo = (segundos%3600)%60;
		System.out.printf("\nO evento durou %d horas, %d minutos %d segundos ", horas, minutos, segundo);
				
		
		tec.close();
	}
}