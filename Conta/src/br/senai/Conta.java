package br.senai;

public class Conta {
	int numero;
	double saldo;
	double limite;
	String dono;
	boolean ativa;

	public void status() {

		System.out.println("Dono:" + this.dono);
		System.out.println("Número da Conta:" + this.numero);
		System.out.println("Limite:" + this.limite);
		System.out.println("Saldo:" + this.saldo);
		System.out.println(this.ativa ? "conta ativa" : "conta inativa");
	}

	public void abrirConta() {
		this.ativa = true;
	}

	public void fecharConta() {

		if (this.saldo == 0) {
			this.ativa = false;
			System.out.println("A Conta está fechada");
		} else if (saldo > 0) {
			System.out.println("Seu saldo é positivo, realize um saque: " + this.saldo + " para fechar conta");

		} else if (saldo < 0) {
			System.out.println("saldo negativo deposite:" + this.saldo + ":para fechar a conta");
		}
	}

	public void depositar(double valor) {
		if (this.ativa) {
			this.saldo += valor;
			System.out.println("deposito:" + valor + ":realizado com sucesso");
		} else {
			System.out.println("não posso depositar em conta inativa");
		}
	}

	public void sacar(double valor) {
		if (this.ativa && this.saldo >= valor && this.limite >= valor) {
			this.saldo -= valor;
			System.out.println("voce sacou:" + valor);
			consultarSaldo();

		} else if (this.ativa == false) {
			System.out.println("conta inativa");
		} else {
			System.out.println("Saque de:" + valor + "nao realizado, o seu saldo ou seu limite é insuficiente!");
		}
	}

	public void consultarSaldo() {

		System.out.println("saldo: " + this.saldo);
	}

}
