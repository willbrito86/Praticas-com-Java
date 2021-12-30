package br.senai;

public class Progama {

	public static void main(String[] args) {

		Conta minhaConta = new Conta();

		minhaConta.abrirConta();
		minhaConta.dono = "joao";
		minhaConta.limite = 3000;
		minhaConta.numero = 0001;
		minhaConta.saldo = 500;

		minhaConta.status();

		minhaConta.depositar(1000);
		System.out.println();
		minhaConta.sacar(2000);
		minhaConta.fecharConta();
		System.out.println();
		minhaConta.status();
		
		

	}

}
