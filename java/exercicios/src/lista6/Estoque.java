package lista6;

import java.util.ArrayList;

public class Estoque {

	ArrayList<Produto> produtos = new ArrayList<Produto>();
	private final int LIMITE = 10;

	public boolean armazenarProduto(Produto produto) {
		if (this.produtos.size() < this.LIMITE) {
			produtos.add(produto);
			return true;
		} else {
			return false;
		}
	}
	
	public boolean removerProduto(int codigo) {
		for (int i = 0; i < this.produtos.size(); i++) {
			if (this.produtos.get(i).getCodigo() == codigo) {
				this.produtos.remove(i);
				return true;
			}
		}
		return false;
	}
	
	public void atualizarEstoque() {
		System.out.println("Atualizando estoque...");
	}
	
	public void mostrarProdutos() {
		for (Produto produto : produtos) {
			System.out.printf("Nome: %s\tCódigo: %d\tPreço: %.2f\tQuantidade em estoque: %d\n", produto.getNome(), produto.getCodigo(), produto.getPreco(), produto.getQuantidade());
		}
	}
	
}
