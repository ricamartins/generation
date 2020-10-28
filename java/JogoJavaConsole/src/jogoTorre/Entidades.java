package jogoTorre;


public abstract class Entidades {
	protected D20 d20 = new D20();
	protected D6 d6 = new D6();
	protected D3 d3 = new D3();
	protected int hp,hpL,sp,spL,expBase = 10,nivel,exp;
	protected int str, inte,vit,agi,def;
	protected boolean vivo = true;
	
	protected String nome;
	
	public Entidades(int nivel, String nome) {
		super();
		this.nivel = nivel;
		this.nome = nome;
	}
	public Entidades(String nome) {
		super();
		this.nome = nome;
	}	
	public Entidades(int nivel2) {
		// TODO Auto-generated constructor stub
	}
	public boolean vida () {
		
		return vivo;
	}
	public void status () {
		System.out.println();
		System.out.printf("Nome :%s\tNivel:%d  Exp: %d/%d \n",this.nome,this.nivel,this.exp,this.expBase);
		System.out.printf("Força:%d\tVitalidade:%d  Defesa:%d  Agilidade:%d  Magia:%d\n",this.str,this.vit,this.def,this.agi,this.inte);
		System.out.printf("Hp : %d/%d\n",this.hp,this.hpL);
		System.out.printf("Sp : %d/%d\n",this.sp,this.spL);
		
	}
	
	
	public void criando (int nivel) {
		this.nivel = nivel;
		/*
		 * this.str += d6.jogarDado(); this.inte += d6.jogarDado(); this.vit +=
		 * d6.jogarDado(); this.agi += d6.jogarDado(); this.def += d6.jogarDado();
		 */
		
		for (int i = 0 ; i<nivel;i++) {
			levelup();
		}
		this.hpL = vit*10;
		this.spL = inte*10;
		this.sp = this.spL;
		this.hp = this.hpL;
		
	}
	
	public void levelup () {
		//System.out.println("Nivel Acima e avante");
		this.str += d3.jogarDado();
		this.inte += d3.jogarDado();
		this.vit += d3.jogarDado();
		this.agi += d3.jogarDado();
		this.def += d3.jogarDado();
		this.hpL = vit*10;
		this.spL = inte*10;
	}
	public int getAgi () {
		return this.agi;
	}
	public int ataque () throws InterruptedException {
		System.out.println("Jogando o D6 de ataque...");
		Thread.sleep(300);
		System.out.print("Giro. ");
		Thread.sleep(300);
		System.out.print("Giro.. ");
		Thread.sleep(300);
		System.out.print("Giro... ");
		Thread.sleep(300);
		int dadoAtaque = d6.jogarDado();
		System.out.println("Dado saiu :"+(dadoAtaque));
		int valor = str+(dadoAtaque*nivel);
		System.out.printf("Ataque:%d  Dado:%d Dano :%d\n",str,(dadoAtaque*nivel),valor);
		Thread.sleep(1000);
		return valor;
		
	}
	public int magia () throws InterruptedException {
		sp -=9+nivel;
		System.out.println("Jogando 1º D6 de Magia...");
		Thread.sleep(200);
		System.out.print("Giro. ");
		Thread.sleep(200);
		System.out.print("Giro.. ");
		Thread.sleep(200);
		System.out.print("Giro... ");
		Thread.sleep(200);
		int dadoAtaque1 = d6.jogarDado();
		System.out.println("Dado saiu 1 :"+dadoAtaque1);
		System.out.println("Jogando 2º D6 de Magia...");
		Thread.sleep(200);
		System.out.print("Giro. ");
		Thread.sleep(200);
		System.out.print("Giro.. ");
		Thread.sleep(200);
		System.out.print("Giro... ");
		Thread.sleep(200);
		int dadoAtaque2 = d6.jogarDado();
		System.out.println("Dado saiu :"+dadoAtaque2);
		int valor = inte+(dadoAtaque1*nivel)+(dadoAtaque2*nivel);
		System.out.printf("Magia %d dado1:%d dado2:%d  Dano :%d\n",inte,(dadoAtaque1*nivel),(dadoAtaque2*nivel),valor);
		System.out.printf("Sp : %d/%d\n",this.sp,this.spL);
		Thread.sleep(1000);
		return valor;
	}
	public boolean magiaPossivel () {
		if(sp>=9+nivel) {
			return true;
		} else {
			System.out.println("Sem mana suficiente");
			return false;
		}
	}
	
	public void dano (int dano) throws InterruptedException {
		System.out.println("Jogando o D6 de Defesa...");
		Thread.sleep(200);
		System.out.print("Giro. ");
		Thread.sleep(200);
		System.out.print("Giro.. ");
		Thread.sleep(200);
		System.out.print("Giro... ");
		Thread.sleep(200);
		int dadoDefesa = d6.jogarDado();
		System.out.println("Dado saiu :"+(dadoDefesa));
		System.out.printf("Defesa:%d dado:%d: Tankou:%d\n",def,(dadoDefesa*nivel),((dadoDefesa*nivel)+def));
		if (dano<=((dadoDefesa*nivel)+def)) {
			System.out.println("Dano Minimo 1");
			hp --;
			System.out.printf("Hp : %d/%d\n",this.hp,this.hpL);
		}
		else {
			hp -= (dano-((dadoDefesa*nivel)+def));
			System.out.printf("Hp : %d/%d\n",this.hp,this.hpL);
		}
		Thread.sleep(1000);
		if (hp <=0) vivo = false;
		
	}
	public void criando() {
		// TODO Auto-generated method stub
		
	}
	

}
