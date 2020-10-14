package lista4;

public class Aviao {

	public String modelo;
	public int capacidadePassageiros;
	public double combustivel;
	private double velocidade = 0;
	
	public Aviao(String modelo, int capacidadePassageiros, double combustivel) {
		this.modelo = modelo;
		this.capacidadePassageiros = capacidadePassageiros;
		this.combustivel = combustivel;
	}
	
	public double mostrarVelocidade() {
		return this.velocidade;
	}
	
	public void acelerar(double aumento) {
		this.velocidade += aumento;
	}
	
}
