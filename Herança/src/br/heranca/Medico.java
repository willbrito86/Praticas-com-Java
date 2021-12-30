package br.heranca;

public class Medico {
	private String crm;
	private String nome;
	private int idade;
	private double salario;

	public void medicoAposentado() {
		if (this.idade > 55) {

			System.out.println("Médico Aposentado");

		} else {
			System.out.println("Médico não Aposentado");
		}
	}

	public void ValorAponsentadoria() {

		System.out.println("O valor da aposentadoria é R$ : " + this.salario * 0.8);
	}

	protected String getCrm() {
		return crm;
	}

	protected void setCrm(String crm) {
		this.crm = crm;
	}

	protected String getNome() {
		return nome;
	}

	protected void setNome(String nome) {
		this.nome = nome;
	}

	protected int getIdade() {
		return idade;
	}

	protected void setIdade(int idade) {
		this.idade = idade;
	}

	protected double getSalario() {
		return salario;
	}

	protected void setSalario(double salario) {
		this.salario = salario;
	}

	public String toString() {

		return (" CRM " + getCrm() + " NOME " + getNome() + " IDADE " + getIdade() + " SALARIO " + getSalario());
	}
}
