import java.util.Scanner;

public class exercicio2 {
    
    // Método para calcular a área do círculo
    public static double calcularAreaCirculo(double raio) {
        double pi = 3.14159;
        return pi * Math.pow(raio, 2);
    }

    // Método principal
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitando e lendo o valor do raio do usuário
        System.out.print("Digite o valor do raio do círculo: ");
        double raio = scanner.nextDouble();

        // Calculando a área do círculo
        double area = calcularAreaCirculo(raio);

        // Exibindo o resultado com quatro casas decimais
        System.out.printf("A área do círculo é: %.4f", area);

        scanner.close();
    }
}
