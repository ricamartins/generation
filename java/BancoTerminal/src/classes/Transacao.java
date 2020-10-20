package classes;

public class Transacao {

	private double valor;
	private char movimentacao;
	
	public Transacao(double valor, char movimentacao) {
		this.valor = valor;
		this.movimentacao = movimentacao;
	}

	public double getValor() {
		return valor;
	}

	public char getMovimentacao() {
		return movimentacao;
	}
	
}
