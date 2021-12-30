import java.util.Scanner;
public class If_else01 {
	
	//Fazer um programa para ler um número inteiro, 
	// e depois dizer se este número é negativo ou não
	
	public static void main(String[] args) {
		
		int a;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero inteiro: ");
		a = sc.nextInt();
		
		if (a > 0) {
			System.out.println("O número digitado é positivo!");
		}
		else {
				
			System.out.println("O número digitado é negativo!");

			}
		

	}

}
