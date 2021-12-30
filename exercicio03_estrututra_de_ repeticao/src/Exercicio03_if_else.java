import java.util.Scanner;

public class Exercicio03_if_else {

	// Leia a hora inicial e a hora final de um jogo. A seguir calcule a
	// duração do jogo, sabendo que o mesmo pode
	// começar em um dia e terminar em outro, tendo
	// uma duração mínima de 1 hora e máxima de 24 horas.

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int duracaoJogo;
		int horaInicial;
		int horaFinal;
		int dia = 24;

		System.out.println("Digite a Hora Inicial do Jogo: ");
		horaInicial = sc.nextInt();

		System.out.println("Digite a Hora Final do Jogo: ");
		horaFinal = sc.nextInt();

		if (horaInicial < horaFinal) {

			duracaoJogo = horaFinal - horaInicial;
			System.out.println("O jogo durou " + duracaoJogo + " hora(s)");
		} else {
			
			duracaoJogo = dia -  horaInicial + horaFinal;
			System.out.println("O jogo durou " + duracaoJogo + " hora(s)");
		}

	}

}
