import java.util.Scanner;
public class Exercicio05_if_else {
	
	//Você deve fazer um programa que leia um valor qualquer e apresente 
	// uma mensagem dizendo em qual dos seguintes intervalos ([0,25], (25,50], 
    //(50,75], (75,100]) este valor se encontra. Obviamente se o valor não 
    //estiver em nenhum destes intervalos, deverá ser impressa a mensagem 
    //“Fora de intervalo”.

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double valor;
		
		System.out.println("Digite o valor: ");
		valor = sc.nextDouble();
		
		if (valor > 25 && valor > 0 ) {
			
			System.out.println("Esta entre o intervalo [0,25]");
			
		}else if (valor > 25 && valor > 75)
		

	}

}
