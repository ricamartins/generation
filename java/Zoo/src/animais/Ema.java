package animais;

public class Ema extends Animal{
	
	public Ema(String tipo, int idade, double peso) {
		super(tipo, idade, peso);
	}
	
	public Ema(String tipo, String nome, int idade, double peso) {
		super(tipo, nome, idade, peso);
	}

	@Override
	public void ouvir(String som) {
		if (som.equals(super.getNome())) {
			this.movimentar("atenção");
		} else if (som.equals("barulho")) {
			this.movimentar("confusão");
		} else if (som.equals("cloroquina")) {
			this.movimentar("jair");
		} else {
			this.movimentar("");
		}
	}
	
	
	@Override
	public String emitirSom(String som) {
		if (som.equals("alegre")) {
			return "aaa aaa!!";
		} else if (som.equals("triste")) {
			return "aa...";
		} else if (som.equals("normal")) {
			return "aa aaa";
		} else {
			return som;	
		}
	}
	
	@Override
	public String movimentar(String momento) {
		if (this.sono()) {
			return "aa aawwn *cansado*";
		} else if (this.fome()) {
			this.peso -= this.peso * 0.01;
			return "aaa rrraa *faminto*";
		} else {
			if (momento.equals("atenção")) {
				this.peso -= this.peso * 0.02;
				this.cansaco++;
				this.apetite++;
				this.distancia = (this.getDistancia() == 0) ? 0 : this.getDistancia() - 10;
				return this.emitirSom("alegre") + " *se aproximando*";
			} else if (momento.equals("confusão")) {
				this.peso -= this.peso * 0.02;
				this.cansaco++;
				this.apetite++;
				this.distancia = (this.getDistancia() > 40) ? 0 : this.getDistancia() + 10;
				return this.emitirSom("triste") + " *se afastando*";
			} else if (momento.equals("jair")) {
				this.peso -= this.peso * 0.02;
				this.cansaco++;
				this.apetite++;
				this.distancia = (this.getDistancia() > 40) ? 0 : this.getDistancia() + 10;
				return this.emitirSom("triste") + " sai fora tio todo dia isso";
			} else {
				this.peso -= this.peso * 0.02;
				this.cansaco++;
				this.apetite++;
				this.distancia = (this.getDistancia() == 0) ? 0 : this.getDistancia() - 5;
				return this.emitirSom("normal") + " *bicando o chão*";
			}
		}
	}
	
	@Override
	public String[] getImagem() {
		String imagem[] = {
			"",
			"",
			"",
			"",
			"  -O    ",
			"    \\ _.",
			"     ( )",
			"       \\",
			"      _/"
		};
		return imagem;
	}
}
