package lista5;

public class Pessoa {
	
	private String nome;
	private String endereco;
	private String telefone;
	
	public Pessoa(String nome, String endereco, String telefone) {
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
	}
	
	public Pessoa(String nome, String endereco) {
		this.nome = nome;
		this.endereco = endereco;
	}
	
	public static Pessoa ctorNomeEndereco(String nome, String endereco) {
		Pessoa pessoa = new Pessoa(nome);
		pessoa.endereco = endereco;
		return pessoa;
	}
	
	public static Pessoa ctorNomeTelefone(String nome, String telefone) {
		Pessoa pessoa = new Pessoa(nome);
		pessoa.telefone = telefone;
		return pessoa;
	}
	
	public Pessoa(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
}
