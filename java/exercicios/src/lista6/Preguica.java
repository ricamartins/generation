package lista6;

public class Preguica extends Animal {

	public double tamanhoGarras;
	
	public Preguica() {}
	
	public Preguica(String nome) {
		super(nome);
	}

	public double getTamanhoGarras() {
		return tamanhoGarras;
	}

	public void setTamanhoGarras(double tamanhoGarras) {
		this.tamanhoGarras = tamanhoGarras;
	}
	
	public void emitirSom() {
		System.out.println("aaaaaa!!");
	}
	
	public void subirEmArvore() {
		System.out.println("subindo nas árvores tudo...");
	}
}
