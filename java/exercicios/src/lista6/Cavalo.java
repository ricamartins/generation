package lista6;

public class Cavalo extends Animal implements AnimalCorredor {
	
	public Cavalo() {}
	
	public Cavalo(String nome) {
		super(nome);
	}
	
	public void emitirSom() {
		System.out.println("Iiiiiiirrrrí!!");
	}
	
	@Override
	public void correr() {
		System.out.println("galopando e galopando...");
	}
}
