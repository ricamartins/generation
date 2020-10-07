package portugol;

public class L3E2 {

	public static void main(String[] args) {
		int soma = 0;
				
		for (int numero = 3; numero <= 498; numero += 6) {
			soma += numero;
		}
		
		System.out.println("A soma total é de " + soma);
	}
}
