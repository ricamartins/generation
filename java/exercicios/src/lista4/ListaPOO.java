package lista4;

public class ListaPOO {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente("Rogério", "029463", 1986);
		System.out.printf("Cliente: %s\tNúmero de cadastro: %s\tIdade: %d\n", cliente.nome, cliente.cadastro, (2020 - cliente.anoNascimento));
		System.out.println();
		
		Aviao aviao = new Aviao("A380", 503, 21);
		System.out.printf("Modelo do avião: %s\tCapacidade de passageiros: %d\t Combustível: %.2f toneladas\tVelocidade: %.2f Km/h\n", aviao.modelo, aviao.capacidadePassageiros, aviao.combustivel, aviao.mostrarVelocidade());
		aviao.acelerar(15);
		System.out.printf("Nova velocidade do avião: %.2f Km/h\n", aviao.mostrarVelocidade());
		System.out.println();
		
		ProdutoEletronico produto = new ProdutoEletronico("Rádio Relógio", "Motobras", "Preta", 14);
		System.out.printf("Produto: %s\tMarca: %s\tCor: %s\tConsumo de energia: %.2f watts\n", produto.tipo, produto.marca, produto.cor, produto.consumo);
		System.out.println();
		
		Funcionario funcionario = new Funcionario("Jefferson", "094262", "Vanessa", "Vendas", 1315.45);
		System.out.printf("Funcionário: %s\tNúmero de cadastro: %s\tSupervisor(a): %s\tÁrea: %s\tSalário: R$ %.2f\n", funcionario.nome, funcionario.cadastro, funcionario.chefe, funcionario.setor, funcionario.salario);
		System.out.println();
		
		Patinete patinete = new Patinete("Caloi", "Prata", 1.20, 0.13);
		System.out.printf("Marca: %s\tCor: %s\tAltura: %.2f m\tLargura: %.2f\n", patinete.marca, patinete.cor, patinete.altura, patinete.largura);
		System.out.println();
		
		ContaBancaria conta = new ContaBancaria("Mirian", 3_569.32, 118.43);
		System.out.printf("Titular da conta: %s\tSaldo: RS %.2f\tAnuidade: R$ %.2f\tStatus da conta: %s\n", conta.titular, conta.saldo, conta.anuidade, (conta.statusPositivo) ? "Positivo" : "Negativo");
		System.out.println();
		
		Paciente paciente = new Paciente("Fabrício", "Unimed", "23", false);
		System.out.printf("Paciente: %s\tConvênio médico: %s\tQuarto: %s\tSituação: %s\n", paciente.nome, paciente.convenio, paciente.quarto, (paciente.alta) ? "Alta" : "Internado(a)");
		System.out.println();
	}

}
