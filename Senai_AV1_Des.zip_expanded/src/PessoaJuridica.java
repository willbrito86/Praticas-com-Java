public class PessoaJuridica implements Contribuinte {

    private String nome;
    private int idade;
    private double rendaBruta;
    private String cnpj;

    public PessoaJuridica(String nome, int idade, double rendaBruta, String cnpj) {
        this.nome = nome;
        this.idade = idade;
        this.rendaBruta = rendaBruta;
        this.cnpj = cnpj;

    }

    public double calcularIR() {
        return 0.1 * rendaBruta;
    }

    public void status() {
        System.out.println(" - Pessoa Jurídica: { nome='" + nome + "', idade=" + idade + ", renda=" + rendaBruta + ", cnpj='" + cnpj + "', IR=" + calcularIR() + " }");
    }

}
