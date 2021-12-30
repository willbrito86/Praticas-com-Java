import java.util.Scanner;
public class Exercicio02_if_else {
	
	//Fazer um programa para ler um número inteiro e dizer se 
	//este número é par ou ímpar.

	
	public static void main(String[] args) {
		
		int a;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero inteiro: ");
		a = sc.nextInt();
		
		if (a %2 == 0) {
			System.out.println("O número digitado é par!");
		}
		else {
				
			System.out.println("O número digitado é impar!");

			}
		

	}

}
