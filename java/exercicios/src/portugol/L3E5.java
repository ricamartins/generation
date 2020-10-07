package portugol;

public class L3E5 {

	public static void main(String[] args) {
		int numero = 233;
				
		do {
			
			System.out.println("\n" + numero);
			
			if (numero < 300) {
				numero += 5;
			} else if (numero < 400) {
				numero += 3;
			} else {
				numero += 5;
			}
			
		} while (numero <= 456);

	}
}
