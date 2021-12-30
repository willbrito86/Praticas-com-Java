import java.util.Scanner;

/* Faça um programa para ler o valor do raio de um círculo e 
 * depois mostrar o valor da área deste círculo.*/

public class Exercicio02 {

	public static void main(String[] args) {
		
		double raio;
		double pi = 3.14159;
		double area;
		
	
		Scanner sc = new Scanner(System.in);
		raio = sc.nextDouble();
		raio = Math.pow(raio, raio);
		area = raio * pi;
		
		System.out.println("A area do circulo é: " + area);
		
		sc.close();
		
	}

}
