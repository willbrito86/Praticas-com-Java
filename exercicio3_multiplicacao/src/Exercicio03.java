import java.util.Scanner;

public class Exercicio03 {

	/*Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).*/
	
	public static void main(String[] args) {
		
		int A;
		int B;
		int C;
		int D;
		int diferenca;
		
		Scanner sc = new Scanner(System.in);
		
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		
	 	diferenca = (A*B) - (C*D);
		
		System.out.println("A diferença entre os produtos de a*b e c*d é: " + 
		diferenca);
		
		sc.close();
		

	}

}
