package br.heranca;

public class MedicoCirugiao extends Medico {

	@Override
	public void medicoAposentado() {
		if (this.getIdade() >= 50) {

			System.out.println("Médico Aposentado");

		} else {
			System.out.println("Médico não Aposentado");
		}
		super.medicoAposentado();
	}

	@Override
	public void ValorAponsentadoria() {

		System.out.println("Pagamento da Aposentadoria do Médico-Cicurgião é: R$ " + this.getSalario() * 0.8 + 800);
	}

}