package br.heranca;

public class MedicoAuxiliar extends Medico {

	@Override
	public void medicoAposentado() {
		if (this.getIdade() >=60) {

			System.out.println("Médico Aposentado");

		} else {
			System.out.println("Médico não Aposentado");
		}
	super.medicoAposentado();
}
	
}