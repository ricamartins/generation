package jogoTorre;

import java.util.Random;

public class D20 extends Dados {
	
	public D20() {
		super();
	}
	
	@Override
	public int jogarDado() {
		super.valor = super.r.nextInt(20)+1;
		return super.valor;		
	}

}
