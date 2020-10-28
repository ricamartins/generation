package jogoTorre;

public class D6 extends Dados{
	
	@Override
	public int jogarDado() {
		super.valor = super.r.nextInt(6)+1;
		return super.valor;		
	}

	public int jogarDado(int valor) {
		super.valor = super.r.nextInt(6)+valor;
		return super.valor;		
	}
}
