package animais;

public abstract class Animal {

	private String tipo;
	private String nome;
	private int idade;
	protected double peso;
	protected int distancia = 10;
	protected int apetite; //0-10
	protected int cansaco; //0-10
	
	public Animal(String tipo, int idade, double peso) {
		this.tipo = tipo;
		this.idade = idade;
		this.peso = peso;
		this.distancia = 0;
		this.apetite = 0;
		this.cansaco = 0;
	}
	
	public Animal(String tipo, String nome, int idade, double peso) {
		this.tipo = tipo;
		this.nome = nome;
		this.idade = idade;
		this.peso = peso;
		this.apetite = 0;
		this.cansaco = 0;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipo() {
		return tipo;
	}

	public int getIdade() {
		return idade;
	}

	public double getPeso() {
		return peso;
	}

	public String[] getImagem() {
		String imagem[] = {""};
		return imagem;
	}
	
	public int getDistancia() {
		return distancia;
	}

	public String emitirSom(String som) {
		if (som.equals("alegre")) {
			return "*som alegre!!*";
		} else if (som.equals("triste")) {
			return "*som triste...*";
		} else if (som.equals("normal")) {
			return "*som normal*";
		} else {
			return som;
		}
	}
	
	public void ouvir(String som) {
		if (som.equals(this.nome)) {
			this.movimentar("atenção");
		} else if (som.equals("barulho")) {
			this.movimentar("confusão");
		} else {
			this.movimentar("");
		}
	}
	
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
				this.distancia = (this.getDistancia() == 0) ? 0 : this.getDistancia() - 5;
				return this.emitirSom("alegre") + " *se aproximando*";
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
				return this.emitirSom("normal") + " *se movimentando*";
			}
		}
	}
	
	public String comer(double comida) {
		if (this.fome()) {
			this.peso += comida;
			this.apetite = 0;
			this.cansaco -= (this.cansaco > 0) ? 1 : 0;
			return this.emitirSom("nham nham *comendo*");
		} else {
			return this.emitirSom("*rejeita a comida*");
		}
	}
	
	//Recebia barulho --> boolean barulho
	public String dormir() {
		if (this.sono()) {
			this.cansaco = 0;
			this.apetite += (this.apetite <= 8) ? 2 : 0;
			return "zzz zzz *descansando*";
			/*
			if (barulho) {
				this.cansaco += (this.cansaco <= 9) ? 1 : 0;
			} else {				
				System.out.println("zzz zzz *dormindo*");
				this.cansaco = 0;
				this.apetite += (this.apetite <= 8) ? 2 : 0;
			}
			*/
		} else {
			this.cansaco++;
			return "";
		}
	}
	
	public boolean fome() {
		return (this.apetite > 5);
	}
	
	public boolean sono() {
		return (this.cansaco > 5);
	}
}
