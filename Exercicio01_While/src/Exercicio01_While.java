import java.util.Scanner;
public class Exercicio01_While {
	
	/*Escreva um programa que repita a leitura de uma senha at� que ela seja
	v�lida. Para cada leitura de senha incorreta informada, escrever a 
	mensagem "Senha Invalida". Quando a senha for informada corretamente 
	deve ser impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. 
	Considere que a senha correta � o valor 2002.*/
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int senhaCorreta = 2002;
		int senhaDigitada = 0;
		
		System.out.println("Digite a senha: ");
		senhaDigitada = sc.nextInt();
		
		while (senhaDigitada != senhaCorreta) {
			
			System.out.println("Senha inv�lida!");
			senhaDigitada = sc.nextInt();
		}
		
		System.out.println("Acesso Permitido!");
		
		
		
		

	}

}
