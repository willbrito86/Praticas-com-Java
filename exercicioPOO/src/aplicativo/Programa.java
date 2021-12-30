package aplicativo;
		/* Programa de Estoque, realizar a entrada de dados como nome, preço e quantidade,
		 depóis entrar como novos itens ao Estoque, imprimir informação atualizada e por
		 fim, retirar produtos e imprimir informações atualizadas*/
		 

import java.util.Locale;
import java.util.Scanner;

import entidade.Produto;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Produto produto = new Produto();
		System.out.println("Informe os dados do produto: ");
		System.out.print("Nome: ");
		produto.nome = sc.nextLine();
		System.out.print("Preço: ");
		produto.preco = sc.nextDouble();
		System.out.println("Quantidade em Estoque: ");
		produto.quantidade = sc.nextInt();
		
		System.out.println(produto);
		
		System.out.println();
		System.out.print("Informe a quantidade de produtos a ser adcionado ao Estoque: ");
		int quantidade = sc.nextInt();
		produto.adicionarProduto(quantidade);
		System.out.println();
		
		System.out.println(produto);
		
		System.out.println();
		System.out.print("Informe a quantidade de produtos a ser removida ao Estoque: ");
		quantidade = sc.nextInt();
		produto.removerProduto(quantidade);
		System.out.println();
		
		System.out.println(produto);
		
		
		
		
		
		sc.close();
	}

}
