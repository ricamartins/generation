package classes;

public class ContaPoupanca extends ContaBancaria {

	//Aplicar juros todo m�s, se for m�s anivers�rio aplicar corre��o monet�ria
	private double juros;
	private double correcaoMonetaria;
	private int mesAniversario;
	
	public ContaPoupanca(int numero, double saldo, double juros, double correcaoMonetaria, int mesAniversario) {
		super(numero, saldo);
		this.juros = juros;
		this.correcaoMonetaria = correcaoMonetaria;
		this.mesAniversario = mesAniversario;
	}
	
	public double getJuros() {
		return juros;
	}

	public void setJuros(double juros) {
		this.juros = juros;
	}

	public double getCorrecaoMonetaria() {
		return correcaoMonetaria;
	}

	public void setCorrecaoMonetaria(double correcaoMonetaria) {
		this.correcaoMonetaria = correcaoMonetaria;
	}

	public int getMesAniversario() {
		return mesAniversario;
	}

	public void setMesAniversario(int mesAniversario) {
		this.mesAniversario = mesAniversario;
	}

	public void aniversarioMes(int mes) {
		if (this.mesAniversario == mes) {
			super.creditar(super.getSaldo() * this.correcaoMonetaria);
		} else {
			super.creditar(super.getSaldo() * this.juros);
		}
	}
}
