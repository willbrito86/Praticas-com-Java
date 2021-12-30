package br.heranca;

public class MedicoCirugiao extends Medico {

	@Override
	public void medicoAposentado() {
		if (this.getIdade() >= 50) {

			System.out.println("M�dico Aposentado");

		} else {
			System.out.println("M�dico n�o Aposentado");
		}
		super.medicoAposentado();
	}

	@Override
	public void ValorAponsentadoria() {

		System.out.println("Pagamento da Aposentadoria do M�dico-Cicurgi�o �: R$ " + this.getSalario() * 0.8 + 800);
	}

}