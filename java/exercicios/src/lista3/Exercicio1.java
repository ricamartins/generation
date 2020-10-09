package lista3;

public class Exercicio1 {

	public static void main(String[] args) {
		int A[] = {1, 0, 5, -2, -5, 7};
		
		int soma = A[0] + A[1] + A[5];
		
		System.out.println("Soma: " + soma);

		A[4] = 100;
		
		for (int i = 0; i < A.length; i++) System.out.printf("%d ", A[i]);
	}
}
