package lista5;

public class Fornecedor extends Pessoa {

	private double valorCredito;
	private double valorDivida;
	
	public Fornecedor(String nome, String endereco, String telefone) {
		super(nome, endereco, telefone);
		this.valorCredito = 0;
		this.valorDivida = 0;
	}
	
	public Fornecedor(String nome, String endereco, String telefone, double valorCredito, double valorDivida) {
		super(nome, endereco, telefone);
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;
	}
	
	public Fornecedor(String nome, String endereco) {
		super(nome, endereco);
		this.valorCredito = 0;
		this.valorDivida = 0;
	}
	
	public Fornecedor(String nome, String endereco, double valorCredito, double valorDivida) {
		super(nome, endereco);
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;
	}
	
	public Fornecedor(String nome) {
		super(nome);
		this.valorCredito = 0;
		this.valorDivida = 0;
	}
	
	public Fornecedor(String nome, double valorCredito, double valorDivida) {
		super(nome);
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;
	}
	
	public double getValorCredito() {
		return valorCredito;
	}
	public void setValorCredito(double valorCredito) {
		this.valorCredito = valorCredito;
	}
	public double getValorDivida() {
		return valorDivida;
	}
	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}
	
	public double obterSaldo() {
		return this.valorCredito - this.valorDivida;
	}
	
}
