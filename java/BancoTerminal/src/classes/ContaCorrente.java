package classes;

public class ContaCorrente extends ContaBancaria{

	private int talonario;
	
	public ContaCorrente(int numero, double saldo, int talonario) {
		super(numero, saldo);
		this.talonario = talonario;
	}

	public void emititTalonario() {
		this.talonario++;
	}

	public int getTalonario() {
		return talonario;
	}

}
