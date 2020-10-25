package animais;

public class Jacare extends Animal {

	public Jacare(String tipo, int idade, double peso) {
		super(tipo, idade, peso);
	}
	
	public Jacare(String tipo, String nome, int idade, double peso) {
		super(tipo, nome, idade, peso);
	}

	@Override
	public String emitirSom(String som) {
		if (som.equals("alegre")) {
			return "raaaaa!!";
		} else if (som.equals("triste")) {
			return "*silêncio*";
		} else if (som.equals("normal")) {
			return "raa";
		} else {
			return som;	
		}
	}
	
	@Override
	public String movimentar(String momento) {
		if (this.sono()) {
			return "raawwn *cansado*";
		} else if (this.fome()) {
			this.peso -= this.peso * 0.01;
			return "grrraaa *faminto*";
		} else {
			if (momento.equals("atenção")) {
				this.peso -= this.peso * 0.02;
				this.cansaco++;
				this.apetite++;
				this.distancia = (this.getDistancia() == 0) ? 0 : this.getDistancia() - 10;
				return this.emitirSom("alegre") + " *se arrastando em sua direção*";
			} else if (momento.equals("confusão")) {
				this.peso -= this.peso * 0.02;
				this.cansaco++;
				this.apetite++;
				this.distancia = (this.getDistancia() > 40) ? 0 : this.getDistancia() + 10;
				return this.emitirSom("triste") + " *entrando na lagoa*";
			} else {
				this.peso -= this.peso * 0.02;
				this.cansaco++;
				this.apetite++;
				this.distancia = (this.getDistancia() > 40) ? 0 : this.getDistancia() + 10;
				return this.emitirSom("normal") + " *se rastejando*";
			}
		}
	}
	
	@Override
	public String[] getImagem() {
		String imagem[] = {
			"            .-._   _ _ _ _ _ _ _ _       ",
			" .-''-.__.-'00  '-' ' ' ' ' ' ' ' '-.    ",
			"'.___ '    .   .--_'-' '-' '-' _'-' '._  ",
			" V: V 'vv-'   '_   '.       .'  _..' '.'.",
			"   '=.____.=_.--'   :_.__.__:_   '.   : :",
			"           (((____.-'        '-.  /   : :",
			"                             (((-'\\ .' / ",
			"                           _____..'  .'  ",
			"                          '-._____.-'    "
		};
		return imagem;
	}
	
	
}
