import java.util.Scanner;

public class Main {

    private static final Scanner teclado = new Scanner(System.in);

    private static PessoaFisica lerPessoaFisica() {
        System.out.println("-> Inserção dos dados da pessoa física:");
        System.out.print("  Digite o nome: ");
        String nome = teclado.nextLine();
        System.out.print("  Digite a idade: ");
        int idade = teclado.nextInt();
        System.out.print("  Digite a renda bruta: ");
        double renda = teclado.nextDouble(); teclado.nextLine();
        System.out.print("  Digite o cpf: ");
        String cpf = teclado.nextLine();
        return new PessoaFisica(nome, idade, renda, cpf);
    }

    private static PessoaJuridica lerPessoaJuridica() {
        System.out.println("-> Inserção dos dados da pessoa jurídica:");
        System.out.print("  Digite o nome: ");
        String nome = teclado.nextLine();
        System.out.print("  Digite a idade: ");
        int idade = teclado.nextInt();
        System.out.print("  Digite a renda bruta: ");
        double renda = teclado.nextDouble(); teclado.nextLine();
        System.out.print("  Digite o cnpj: ");
        String cnpj = teclado.nextLine();
        return new PessoaJuridica(nome, idade, renda, cnpj);
    }

    public static void main(String[] args) {

        PessoaFisica pf = lerPessoaFisica();
        System.out.println();

        PessoaJuridica pj = lerPessoaJuridica();
        System.out.println();

        System.out.println("-> Status da pessoa física:");
        pf.status();
        System.out.println();

        System.out.println("-> Status da pessoa jurídica:");
        pj.status();

    }
}
