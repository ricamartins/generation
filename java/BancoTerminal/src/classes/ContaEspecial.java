package classes;

//Clinte com mais de 3_000
public class ContaEspecial extends ContaCorrente{

	private double limite;
	private double limiteUsado;
	private double selic = 0.07;
	
	public ContaEspecial(int numero, double saldo, int talonario, double limite) {
		super(numero, saldo, talonario);
		this.limite = limite;
	}
	
	public double getSelic() {
		return selic;
	}

	public void setSelic(double selic) {
		this.selic = selic;
	}

	//Taxa Selic
	public double calcularJuros() {
		return super.getSaldo() * this.selic;
	}
	
	public boolean debitarLimite() {
		if (this.limiteUsado > 0) {
			super.debitar(this.limite - this.limiteUsado);
			this.limiteUsado = 0;
			return true;
		} else {
			return false;
		}
	}
}
