import java.util.Scanner;

/* Fa�a um programa para ler o valor do raio de um c�rculo e 
 * depois mostrar o valor da �rea deste c�rculo.*/

public class Exercicio02 {

	public static void main(String[] args) {
		
		double raio;
		double pi = 3.14159;
		double area;
		
	
		Scanner sc = new Scanner(System.in);
		raio = sc.nextDouble();
		raio = Math.pow(raio, raio);
		area = raio * pi;
		
		System.out.println("A area do circulo �: " + area);
		
		sc.close();
		
	}

}
