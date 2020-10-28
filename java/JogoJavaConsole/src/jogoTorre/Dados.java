package jogoTorre;
import java.util.Random;
public abstract class Dados {
	protected Random r = new Random();
	protected  int valor = 0;

	
	public Dados() {
		super();
	}


	public int jogarDado() {
		this.valor = this.r.nextInt(100);
		return this.valor;		
	}
	
}
