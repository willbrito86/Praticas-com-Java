import java.util.Scanner;
import java.util.Locale;
public class Exercicio05 {

	/*Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
código de uma p*/
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigopeca1;
		int qtdepeca1;
		int valorunitariopeca1;
		int codigopeca2;
		int qtdepeca2;
		int valorunitariopeca2;
		double valorpeca1;
		double valorpeca2;
		double valorTotal;
		
		codigopeca1 = sc.nextInt();
		qtdepeca1 = sc.nextInt();
		valorunitariopeca1 = sc.nextInt();
		codigopeca2 = sc.nextInt();
		qtdepeca2 = sc.nextInt();
		valorunitariopeca2 = sc.nextInt();
		
		valorpeca1 = qtdepeca1 * valorunitariopeca1;
		valorpeca2 = qtdepeca2 * valorunitariopeca2;
		valorTotal = valorpeca1 + valorpeca2;
		
		System.out.println("O valor a ser pago é:R$ " + valorTotal);
		


		

	}

}
