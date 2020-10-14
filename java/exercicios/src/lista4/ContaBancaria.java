package lista4;

public class ContaBancaria {

	public String titular;
	public double saldo;
	public double anuidade;
	public boolean statusPositivo;
	
	public ContaBancaria(String titular, double saldo, double anuidade) {
		this.titular = titular;
		this.saldo = saldo;
		this.anuidade = anuidade;
		this.statusPositivo = !(this.saldo < 0);
	}
}
