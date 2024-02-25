import java.util.Scanner;

public class VerificarNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro:");
        int numero = scanner.nextInt();

        if(numero < 0) {
            System.out.println("O número é negativo.");
        } else if(numero == 0) {
            System.out.println("O número é zero.");
        } else {
            System.out.println("O número é positivo.");
        }

        scanner.close();
    }
}
