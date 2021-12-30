import java.util.Scanner;
public class Exercicio04_if_else {

	//Com base na tabela abaixo, escreva um programa que leia o 
	//código de um item e a quantidade deste item. A
	//seguir, calcule e mostre o valor da conta a pagar.

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int codigoDoProduto;
		int quantidade;
		double valorConta;
		
		System.out.println("Digite o código do produto: ");
		codigoDoProduto = sc.nextInt();
		
		System.out.println("Digite o quantidade: ");
		quantidade = sc.nextInt();
		
		if (codigoDoProduto == 1) {
			
			valorConta = quantidade * 4.00;
			System.out.println("Valor da Conta é: " + valorConta );
		} else if (codigoDoProduto == 2){
			
			valorConta = quantidade * 4.50;
			System.out.println("Valor da Conta é: " + valorConta );
		}else if (codigoDoProduto == 3){
			
			valorConta = quantidade * 5.00;
			System.out.println("Valor da Conta é: " + valorConta );
		}else if (codigoDoProduto == 4){
			
			valorConta = quantidade * 2.00;
			System.out.println("Valor da Conta é: " + valorConta );
		}else {
			
			valorConta = quantidade * 1.50;
			System.out.println("Valor da Conta é: R$" + valorConta );
		}
	
	
		
		

	}

}
