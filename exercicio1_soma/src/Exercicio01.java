import java.util.Scanner;

/*Fa�a um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses n�meros com uma
mensagem explicativa, conforme exemplos.*/

public class Exercicio01 {

	public static void main(String[] args) {
		
		int a;
		int b;
		
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		System.out.println("A soma dos valores digitados �: " + (a+b));
		
		
		sc.close();

	}

}
