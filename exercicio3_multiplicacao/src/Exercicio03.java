import java.util.Scanner;

public class exercicio3 {
    
    // Método para calcular a diferença conforme a fórmula
    public static int calcularDiferenca(int a, int b, int c, int d) {
        return (a * b) - (c * d);
    }

    // Método principal
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitando e lendo os valores de A, B, C e D do usuário
        System.out.println("Digite o valor de A: ");
        int a = scanner.nextInt();

        System.out.println("Digite o valor de B: ");
        int b = scanner.nextInt();

        System.out.println("Digite o valor de C: ");
        int c = scanner.nextInt();

        System.out.println("Digite o valor de D: ");
        int d = scanner.nextInt();

        // Calculando a diferença
        int diferenca = calcularDiferenca(a, b, c, d);

        // Exibindo a diferença
        System.out.println("A diferença do produto de A e B pelo produto de C e D é: " + diferenca);

        scanner.close();
    }
}
