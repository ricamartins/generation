package animais;

public class Tubarao extends Animal {

	public Tubarao(String tipo, int idade, double peso) {
		super(tipo, idade, peso);
	}
	
	public Tubarao(String tipo, String nome, int idade, double peso) {
		super(tipo, nome, idade, peso);
	}

	@Override
	public String emitirSom(String som) {
		if (som.equals("alegre")) {
			return "rrraaa!!";
		} else if (som.equals("triste")) {
			return "glub glub...";
		} else if (som.equals("normal")) {
			return "*silêncio*";
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
			return "grrraa ggrarrraaa! *faminto*";
		} else {
			if (momento.equals("atenção")) {
				this.peso -= this.peso * 0.02;
				this.cansaco++;
				this.apetite++;
				this.distancia = (this.getDistancia() == 0) ? 0 : this.getDistancia() - 5;
				return this.emitirSom("alegre") + " *nadando em sua direção*";
			} else if (momento.equals("confusão")) {
				this.peso -= this.peso * 0.02;
				this.cansaco++;
				this.apetite++;
				this.distancia = (this.getDistancia() > 20) ? 0 : this.getDistancia() + 5;
				return this.emitirSom("triste") + " *se afastando*";
			} else {
				this.peso -= this.peso * 0.02;
				this.cansaco++;
				this.apetite++;
				this.distancia = (this.getDistancia() > 20) ? 0 : this.getDistancia() + 5;
				return this.emitirSom("normal") + " *nadando em zig zag*";
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
			"",
			"              _.-\"{               _.-",
			"        .-*'``     ``*---..-i__.-`:' ",
			"     .'*   ((   ,         _ .---._\\  ",
			"      `-'.._'._(__...--*\"` `\"     `` ",
		};
		return imagem;
	}
}
