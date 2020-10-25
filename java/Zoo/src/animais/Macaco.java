package animais;

public class Macaco extends Animal {

	public Macaco(String tipo, int idade, double peso) {
		super(tipo, idade, peso);
	}
	
	public Macaco(String tipo, String nome, int idade, double peso) {
		super(tipo, nome, idade, peso);
	}

	@Override
	public String emitirSom(String som) {
		if (som.equals("alegre")) {
			return "uuu aa uu aa!!";
		} else if (som.equals("triste")) {
			return "uu aa...";
		} else if (som.equals("normal")) {
			return "uu aa uu";
		} else {
			return som;			
		}
	}
	
	@Override
	public String movimentar(String momento) {
		if (this.sono()) {
			return "yaawwn *cansado*";
		} else if (this.fome()) {
			this.peso -= this.peso * 0.01;
			return "grrr *faminto*";
		} else {
			if (momento.equals("atenção")) {
				this.peso -= this.peso * 0.02;
				this.cansaco++;
				this.apetite++;
				this.distancia = (this.getDistancia() == 0) ? 0 : this.getDistancia() - 10;
				return this.emitirSom("alegre") + " *macaqueando em sua direção*";
			} else if (momento.equals("confusão")) {
				this.peso -= this.peso * 0.02;
				this.cansaco++;
				this.apetite++;
				this.distancia = (this.getDistancia() > 40) ? 0 : this.getDistancia() + 10;
				return this.emitirSom("triste") + " *se escondendo nas árvores*";
			} else {
				this.peso -= this.peso * 0.02;
				this.cansaco++;
				this.apetite++;
				this.distancia = (this.getDistancia() > 40) ? 0 : this.getDistancia() + 10;
				return this.emitirSom("normal") + " *pulando de galho em galho*";
			}
		}
	}
	
	@Override
	public String[] getImagem() {
		String imagem[] = {
			"",
			"     __       ",
			"w  c(..)o   ( ",
			" \\__(-)    __)",
			"     /\\   (   ",
			"    /(_)___)  ",
			"    w /|      ",
			"     | \\      ",
			"    m  m      "
		};
		return imagem;
	}
	
}
