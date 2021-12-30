import java.util.Scanner;
import java.util.Locale;
public class Exercicio06 {
	
	/*Fazer um programa que leia três valores: A, B e C. Em seguida, calcule e
	mostre:
	a) a área do triângulo retângulo que tem A por base e C por altura.
	b) a área do círculo de raio C. (pi = 3.14159)
	c) a área do trapézio que tem A e B por bases e C por altura.
	d) a área do quadrado que tem lado B.
	e) a área do retângulo que tem lados A e B*/
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A;
		double B;
		double C;
		double trianguloRetangulo;
		double circulo;
		double trapezio;
		double retangulo;
		double quadrado;
		double pi = 3.14159;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		trianguloRetangulo = (A*C) / 2;
	    circulo = C * pi;
	    trapezio = ((A + B) * C) / 2;
	    quadrado = B * B;
	    retangulo = A * B;
		
		System.out.println("A área do triângulo retângulo é: " + trianguloRetangulo);
		System.out.println("A área do círculo " + circulo);
		System.out.println("A área do trapézio " + trapezio);
		System.out.println("a área do quadrado " + quadrado);
		System.out.println("a área do retângulo " + retangulo);
		
		
		sc.close();

	}

}
