package classes;

import java.util.ArrayList;

public abstract class ContaBancaria {

	private int numero;
	private double saldo;
	private ArrayList<Transacao> transacoes;
	
	public ContaBancaria(int numero, double saldo) {
		this.numero = numero;
		this.saldo = saldo;
	}
	
	public void emitirExtrato() {
		System.out.println("----------EXTRATO----------");
		System.out.printf("\nNúmero da conta: %d", this.numero);
		System.out.printf("\nSaldo: %.2f", this.saldo);
		System.out.println("----------TRANSAÇÕES----------");
		for (Transacao transacao : transacoes) {
			System.out.printf("\nValor: %.2f\t %s", transacao.getValor(), (transacao.getMovimentacao() == 'E') ? "Entrada" : "Saída");
		}
	}
	
	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	//Depositar
	public boolean creditar(double quantia) {
		this.saldo += quantia;
		this.transacoes.add(new Transacao(quantia, 'E'));
		return true;
	}
	
	//Retirar
	public boolean debitar(double quantia) {
		this.saldo -= quantia;
		this.transacoes.add(new Transacao(quantia, 'S'));
		return true;
	}
	
}
