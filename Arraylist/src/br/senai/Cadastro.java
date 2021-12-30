package br.senai;

import java.util.ArrayList;

public class Cadastro {

	public static void main(String[] args) {

		ArrayList cadastroValores = new ArrayList();

		cadastroValores.add(10);
		cadastroValores.add(9);
		cadastroValores.add(45);
		cadastroValores.add(3);
		cadastroValores.add(2);
		cadastroValores.add(7);
		cadastroValores.add(7);
		cadastroValores.add(148);
		cadastroValores.add(5);
		cadastroValores.add(13);

		for (Object numero : cadastroValores) {

			System.out.println("numeros cadastrados" + numero);
		}

	}

}
