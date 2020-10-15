package lista5;

import java.util.ArrayList;

public class EmpregadoTeste {

	public static void main(String[] args) {
		ArrayList<Empregado> empregados = new ArrayList<Empregado>();

		empregados.add(new Empregado("Lucas", 104, 1_050.45, 0.05));
		empregados.add(new Empregado("Renata", "Rua Janice da Silva, 254" , 376, 2_398.67, 0.15));
		empregados.add(new Empregado("Fábio", "Av. Cupecê, 3492", "(11)8403-2845", 071, 1_890.34, 0.1));
	
		for (Empregado empregado : empregados) {
			System.out.printf("Nome: %s\tEndereço: %s\tTelefone: %s\tSalário: %.2f\n", empregado.getNome(), empregado.getEndereco(), empregado.getTelefone(), empregado.calcularSalario());
		}
	}
}
