package jogoTorre;

public class PlayerBasic extends Entidades{
	protected int  potion = 2,pedraStr = 0,pedraVit = 0,pedraDef = 0,pedraInt = 0,pedraAgi = 0;
	private int strB;
	private int inteB;
	private int vitB;
	private int agiB;
	private int defB;
	

	public PlayerBasic(String nome) {
		super(nome);
		// TODO Auto-generated constructor stub
	}
	
	
	public PlayerBasic(String nome,int nivel ) {
		super(nivel, nome);
	}


	@Override	
	public void criando (int nivel) {		
			super.nivel = 1;
			this.strB += d6.jogarDado();
			this.inteB += d6.jogarDado();
			this.vitB += d6.jogarDado();
			this.agiB += d6.jogarDado();
			this.defB += d6.jogarDado();
			attStatus();
			this.sp = this.spL;
			this.hp = this.hpL;
	}
	@Override
	public void status () {
		System.out.println();
		System.out.printf("Nome :%s\tNivel:%d  Exp: %d/%d  Poções: %d \n",this.nome,this.nivel,this.exp,this.expBase,this.potion);
		System.out.printf("Força:%d Vitalidade:%d Defesa:%d  Agilidade:%d  Magia:%d\n",this.strB,this.vitB,this.defB,this.agiB,this.inteB);
		System.out.printf("PedraForça:%d PedraVitalidade:%d PedraDefesa:%d PedraAgilidade:%d  Magia:%d\n",this.pedraStr,this.pedraVit,this.pedraDef,this.pedraAgi,this.pedraInt);
		System.out.printf("Hp : %d/%d\n",this.hp,this.hpL);
		System.out.printf("Sp : %d/%d\n",this.sp,this.spL);
		
	}
	
	@Override
	public void levelup () {
		System.out.println();
		System.out.println("Nivel Acima e avante");
		this.strB += d3.jogarDado();
		this.inteB +=d3.jogarDado();
		this.vitB += d3.jogarDado();
		this.agiB += d3.jogarDado() ;
		this.defB += d3.jogarDado();
		nivel++;
		attStatus();
		this.sp = this.spL;
		this.hp = this.hpL;
		
		
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void attStatus () {
		this.str = this.strB+pedraStr;
		this.inte = this.inteB+pedraInt;
		this.vit = this.vitB+pedraVit;
		this.agi = this.agiB+pedraAgi;
		this.def = this.defB+pedraDef;
		
		this.hpL = vit*10;
		this.spL = inte*10;
		
		
	}
	public void checagem () {
		boolean chec;
		attStatus();
		if(hp<=0) {
			this.vivo =false;
		}
		if(sp<spL) {
			if((sp+nivel)>spL) {
				sp = spL;
			} else {
				sp+= nivel;
			}
			
		}
		if(hp<hpL) {
			if(hp+nivel>hpL) {
				hp = hpL;
			}else {
				hp+=nivel;
			}
			
		}
		while (true) {
			chec = false;
			if(super.exp>=expBase) {
				levelup();
				exp -=expBase;
				expBase = (int) (expBase*2);			
				chec = true;
				status();
			}
			if (chec == false) break;
		}
		
	}
	
	public void curarPotion (int quantidade) {
		if (hp == hpL) {
			System.out.println("Hp esta cheio");
		}
		else if(quantidade>0) {
			if (quantidade <= potion) {
				if(quantidade*5>=hpL) {
					hp = hpL;
					potion -=quantidade;
				} else {
					hp += quantidade*5;
					potion -=quantidade;
				}
				System.out.printf("Hp : %d/%d\n",this.hp,this.hpL);
			} else 
			{
				System.out.println("Quantidade Invalida");
			}
			
		} else {
			System.out.println("Quantidade Errada");
		}
		
	}
	
	
	public void expUp (int exp) {
		this.exp +=exp;
				
	}
	public int getNivel () {
		return this.nivel;
	}

	public void upPedra (int pedra,int valor) {
		switch (pedra) {
		case 1:
			if (pedraStr<valor) {
				pedraStr = valor;
				System.out.println("Pedra da Força Atualizada");
			}
			
			break;
		case 2:
			if (pedraVit<valor) {
				pedraVit = valor;
				System.out.println("Pedra da Vitalidade Atualizada");
			}
			
			break;
		case 3:
			if (pedraDef<valor) {
				pedraDef = valor;
				System.out.println("Pedra da Defesa Atualizada");
			}
			
			break;
		case 4:
			if (pedraInt<valor) {
				pedraInt = valor;
				System.out.println("Pedra da Inteligencia Atualizada");
			}
			
			break;
		case 5:
			if (pedraAgi<valor) {
				pedraAgi = valor;
				System.out.println("Pedra da Agilidade Atualizada");
			}
			
			break;			
		}
	}
	
	public void potionAdd (int valor) {
		this.potion += valor;
	}
	
	
	
}
