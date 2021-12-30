import java.util.Scanner;
import java.util.Locale;

/*Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
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
