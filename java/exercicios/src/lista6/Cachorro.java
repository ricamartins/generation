package lista6;

public class Cachorro extends Animal implements AnimalCorredor {
	
	public Cachorro() {}
	
	public Cachorro(String nome) {
		super(nome);
	}
	
	public void emitirSom() {
		System.out.println("Au au au!");
	}
	
	public void coleira() {
		System.out.printf("Nome: %s Idade: %d\n", super.getNome(), (super.getIdade() > 0) ? super.getIdade() : 0);
	}
	
	@Override
	public void correr() {
		System.out.println("correndo e correndo...");
	}
	
}
