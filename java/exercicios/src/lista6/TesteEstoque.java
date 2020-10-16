package lista6;

public class TesteEstoque {

	public static void main(String[] args) {
		Estoque estoque = new Estoque();

		estoque.armazenarProduto(new Produto("Calça", 324, 32.56, 14));
		estoque.armazenarProduto(new Produto("Meia", 532, 12.45, 41));
		estoque.armazenarProduto(new Produto("Blusa", 874, 62.12, 52));
		estoque.armazenarProduto(new Produto("Jaqueta", 289, 74.52, 36));
		estoque.armazenarProduto(new Produto("Chapéu", 384, 58.23, 65));
		
		estoque.mostrarProdutos();
		
		estoque.removerProduto(874);
		estoque.removerProduto(384);
		
		estoque.atualizarEstoque();
		
		estoque.mostrarProdutos();
	}

}
