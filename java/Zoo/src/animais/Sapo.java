package animais;

public class Sapo extends Animal {

	public Sapo(String tipo, int idade, double peso) {
		super(tipo, idade, peso);
	}
	
	public Sapo(String tipo, String nome, int idade, double peso) {
		super(tipo, nome, idade, peso);
	}

	@Override
	public String emitirSom(String som) {
		if (som.equals("alegre")) {
			return "croac croac!!";
		} else if (som.equals("triste")) {
			return "croac...";
		} else if (som.equals("normal")) {
			return "croac";
		} else {
			return som;			
		}
	}
	
	@Override
	public String movimentar(String momento) {
		if (this.sono()) {
			return "croaaawwn *cansado*";
		} else if (this.fome()) {
			this.peso -= this.peso * 0.01;
			return "grroaawn grra *faminto*";
		} else {
			if (momento.equals("atenção")) {
				this.peso -= this.peso * 0.02;
				this.cansaco++;
				this.apetite++;
				this.distancia = (this.getDistancia() == 0) ? 0 : this.getDistancia() - 10;
				return this.emitirSom("alegre") + " *saltando em sua direção*";
			} else if (momento.equals("confusão")) {
				this.peso -= this.peso * 0.02;
				this.cansaco++;
				this.apetite++;
				this.distancia = (this.getDistancia() > 40) ? 0 : this.getDistancia() + 10;
				return this.emitirSom("triste") + " *voltando pra lagoa*";
			} else {
				this.peso -= this.peso * 0.02;
				this.cansaco++;
				this.apetite++;
				this.distancia = (this.getDistancia() > 40) ? 0 : this.getDistancia() + 10;
				return this.emitirSom("normal") + " *saltando e caçando moscas*";
			}
		}
	}
	
	@Override
	public String[] getImagem() {
		String imagem[] = {
			"",
			"",
			"         _   _       ",
			"        (.)_(.)      ",
			"     _ (   _   ) _   ",
			"    / \\/`-----'\\/ \\  ",
			"  __\\ ( (     ) ) /__",
			"  )   /\\ \\._./ /\\   (",
			"   )_/ /|\\   /|\\ \\_( ",
		};
		return imagem;
	}
}
