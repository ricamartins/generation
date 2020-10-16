package lista6;

public class TesteAnimais {

	public static void main(String[] args) {
		Animal animal = new Animal();
		Cachorro cachorro = new Cachorro("Rex");
		Cavalo cavalo = new Cavalo();
		Preguica preguica = new Preguica();
		
		animal.emitirSom();
		
		cachorro.coleira();
		cachorro.emitirSom();
		cachorro.correr();
		
		cavalo.emitirSom();
		cavalo.correr();
		
		preguica.emitirSom();
		preguica.subirEmArvore();
	}
}
