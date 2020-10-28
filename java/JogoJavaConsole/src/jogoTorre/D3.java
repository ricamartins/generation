package jogoTorre;

public class D3 extends Dados{
	
	public int jogarDado() {
		this.valor = this.r.nextInt(3)+1;
		return this.valor;		
	}

}
