import java.util.Scanner;
import java.util.Locale;
public class Exercicio06 {
	
	/*Fazer um programa que leia tr�s valores: A, B e C. Em seguida, calcule e
	mostre:
	a) a �rea do tri�ngulo ret�ngulo que tem A por base e C por altura.
	b) a �rea do c�rculo de raio C. (pi = 3.14159)
	c) a �rea do trap�zio que tem A e B por bases e C por altura.
	d) a �rea do quadrado que tem lado B.
	e) a �rea do ret�ngulo que tem lados A e B*/
	
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
		
		System.out.println("A �rea do tri�ngulo ret�ngulo �: " + trianguloRetangulo);
		System.out.println("A �rea do c�rculo " + circulo);
		System.out.println("A �rea do trap�zio " + trapezio);
		System.out.println("a �rea do quadrado " + quadrado);
		System.out.println("a �rea do ret�ngulo " + retangulo);
		
		
		sc.close();

	}

}
