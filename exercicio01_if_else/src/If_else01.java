import java.util.Scanner;
public class If_else01 {
	
	//Fazer um programa para ler um n�mero inteiro, 
	// e depois dizer se este n�mero � negativo ou n�o
	
	public static void main(String[] args) {
		
		int a;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero inteiro: ");
		a = sc.nextInt();
		
		if (a > 0) {
			System.out.println("O n�mero digitado � positivo!");
		}
		else {
				
			System.out.println("O n�mero digitado � negativo!");

			}
		

	}

}
