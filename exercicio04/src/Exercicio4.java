import java.util.Scanner;
import java.util.Locale;

/*Fazer um programa que leia o n�mero de um funcion�rio, seu n�mero de horas trabalhadas, o valor que recebe por
hora e calcula o sal�rio desse funcion�rio. A seguir, mostre o n�mero e o sal�rio do funcion�rio, com duas casas
decimais.*/

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int numberemployee;
		double workedhours;
		double hourvalue;
		double salary;
		
		numberemployee = sc.nextInt();
		workedhours = sc.nextDouble();
		hourvalue = sc.nextDouble();
		
		salary = workedhours * hourvalue;
		
		System.out.println("Number of employee is: " + numberemployee);
		System.out.printf("Salary = $ %.2f%n", salary);

	}

}
