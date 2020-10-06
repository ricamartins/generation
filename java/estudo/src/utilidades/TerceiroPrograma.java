package utilidades;

import java.util.Scanner;

public class TerceiroPrograma {

	public static void main(String[] args) {
		int valor = 100;
		String nome = "Aula de Java";
		char opcao = 'O';
		double salario;
		String nomeUsuario;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		nomeUsuario = leia.next();
		
		System.out.println("valor" + (valor + 10));
		System.out.println(nomeUsuario);
	}

}
