package br.heranca;

public class MedicoAuxiliar extends Medico {

	@Override
	public void medicoAposentado() {
		if (this.getIdade() >=60) {

			System.out.println("M�dico Aposentado");

		} else {
			System.out.println("M�dico n�o Aposentado");
		}
	super.medicoAposentado();
}
	
}