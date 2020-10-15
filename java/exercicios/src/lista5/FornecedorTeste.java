package lista5;

public class FornecedorTeste {

	public static void main(String[] args) {
		final int NUMERO_TESTE = 6;
		Fornecedor fornecedores[] = new Fornecedor[NUMERO_TESTE];

		fornecedores[0] = new Fornecedor("Rogério");
		fornecedores[1] = new Fornecedor("Alexandre", "Rua Juscelino Dias, 276");
		fornecedores[2] = new Fornecedor("Lilian", "Rua das Palmeiras, 34", "(11)3452-1739");
		fornecedores[3] = new Fornecedor("Tânia", 2_857.43, 1_387.32);
		fornecedores[4] = new Fornecedor("Jânio", "Av. Dolores da paz, 673", 1_856.23, 4_546.12);
		fornecedores[5] = new Fornecedor("Suzana", "Rua Grajaú 12", "(11)2745-8769", 3_400.25, 3_203.75);
		
		for (int i = 0; i < NUMERO_TESTE; i++) {
			System.out.printf("Nome: %s\tEndereço: %s\tTelefone: %s\tSaldo: %.2f\n", fornecedores[i].getNome(), fornecedores[i].getEndereco(), fornecedores[i].getTelefone(), fornecedores[i].obterSaldo());
		}
	}

}
