package lista5;

public class Operario extends Pessoa {

	private double valorProducao;
	private double comissao;
	
	public Operario(String nome, String endereco, String telefone, double valorProducao, double comissao) {
		super(nome, endereco, telefone);
		this.valorProducao = valorProducao;
		this.comissao = comissao;
	}
	
	public Operario(String nome, String endereco, double valorProducao, double comissao) {
		super(nome, endereco);
		this.valorProducao = valorProducao;
		this.comissao = comissao;
	}
	
	public Operario(String nome, double valorProducao, double comissao) {
		super(nome);
		this.valorProducao = valorProducao;
		this.comissao = comissao;
	}

	public double getValorProducao() {
		return valorProducao;
	}

	public void setValorProducao(double valorProducao) {
		this.valorProducao = valorProducao;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
}
