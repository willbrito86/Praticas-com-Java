package br.senai;

import java.util.ArrayList;
import java.util.Scanner;

public class NomeCadastro {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ArrayList<String> listaNome = new ArrayList<String>();

		System.out.println("Digite aqui 5 nomes: ");

		for (int i = 0; i < 5; i++) {
			String lista = sc.next();

			listaNome.add(lista);
		}

		for (int i = 4; i >= 0; i--) {

			System.out.println(listaNome.get(i));

		}

	}

}
