public class PessoaFisica implements Contribuinte {

    private String nome;
    private int idade;
    private double rendaBruta;
    private String cpf;

    public PessoaFisica(String nome, int idade, double rendaBruta, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.rendaBruta = rendaBruta;
        this.cpf = cpf;
    }

    public double calcularIR() {
        if (rendaBruta <= 2000)
            return 0.1 * rendaBruta;
        return 0.2 * rendaBruta;
    }

    public void status() {
        System.out.println(" - Pessoa Física: { nome='" + nome + "', idade=" + idade + ", renda=" + rendaBruta + ", cpf='" + cpf + "', IR=" + calcularIR() + " }");
    }

}
