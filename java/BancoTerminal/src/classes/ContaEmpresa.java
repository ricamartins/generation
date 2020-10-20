package classes;

public class ContaEmpresa extends ContaBancaria{

	//Debitar do limite e creditar no saldo, depois debitar do saldo (pagando a divida)
	private double limite;
	private double limiteUsado;
	
	public ContaEmpresa(int numero, double saldo, double limite) {
		super(numero, saldo);
		this.limite = limite;
	}
	
	//Se estiver usando até 50% do limite, banco concede empréstimo que é 2 vezes o valor do limite
	public boolean emprestimoEmpresarial() {
		if (this.limiteUsado / this.limite <= 0.5) {
			return super.creditar(this.limite * 2);
		} else {
			return false;
		}
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
