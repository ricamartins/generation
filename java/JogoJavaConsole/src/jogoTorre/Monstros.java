package jogoTorre;

public class Monstros extends Entidades{
	public String raridade;
	
	
	public Monstros(int nivel) {
		super(nivel);
		criando(nivel);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void status () {
		System.out.println();
		System.out.printf("Nome :%s\tNivel:%d  Raridade: %s \n",this.nome,this.nivel,this.raridade);
		System.out.printf("Força:%d\tVitalidade:%d  Defesa:%d  Agilidade:%d  Magia:%d\n",this.str,this.vit,this.def,this.agi,this.inte);
		System.out.printf("Hp : %d/%d\n",this.hp,this.hpL);
		System.out.printf("Sp : %d/%d\n",this.sp,this.spL);
		
	}
	
	@Override
	public void criando (int nivel) {
		
		this.nivel = nivel;		
		
		for (int i = 0 ; i<nivel;i++) {
			levelup();
		}
		attStatusRaridade();
		this.hpL = vit*10;
		this.spL = inte*10;
		this.sp = this.spL;
		this.hp = this.hpL;
		
	}
	public void checarVida() {
		if(hp<=0) this.vivo =false;
	}
	public void gerarRaridade () {
		int valor = d20.jogarDado();
		if (valor <10) {
			raridade = "C";
		} else if (valor <15) {
			raridade = "UC";
		} else if (valor <18) {
			raridade = "R";
		} else if (valor < 20) {
			raridade = "SR";
		}
		else if (valor == 20) {
			raridade = "UR";
		}
	}
	public void attStatus(double valor) {
		this.str = (int) (this.str*valor+(valor*2)) ;
		this.inte += (int) (this.inte*valor+(valor*2));
		this.vit += (int) (this.vit*valor+(valor*2));
		this.agi += (int) (this.agi*valor+(valor*2));
		this.def += (int) (this.def*valor+(valor*2));
	}
	public int  getExp () {
		return exp;
	}
	public void attStatusRaridade () {
		gerarRaridade();
		if(raridade == "C") {
			nome = "Zumbi Ferido";
			attStatus(0.5);
			exp = nivel;
			
		} else if (raridade == "UC") {
			nome = "Zumbi ";
			attStatus(0.75);
			exp = nivel*2;
		}else if (raridade == "R") {
			nome = "Zumbi fortalecido";
			attStatus(1.25);
			exp = nivel*3;
		}else if (raridade == "SR") {
			nome = "Zumbi Elite";
			attStatus(1.7);
			exp = nivel*5;
		}else if (raridade == "UR") {
			nome = "Zumbi BOSS";
			attStatus(3);
			exp = nivel*9;
		}
		
		
	}
	public int getRaridade() {
		if (raridade == "C") {
			return 1;	
		}else if (raridade == "UC")
		{
			return 2;
			
		}else if (raridade == "R")
		{
			return 3;
		}else if (raridade == "SR")
		{
			return 5;
		}else if (raridade == "UR")
		{
			return 9;
		}
		else {
			return 0;
		}
		
	}
}
