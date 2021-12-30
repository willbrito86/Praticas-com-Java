package br.heranca;

public class Teste {

	public static void main(String[] args) {

		Medico medico = new Medico();
		MedicoAuxiliar ma = new MedicoAuxiliar();
		MedicoCirugiao mc = new MedicoCirugiao();

		medico.setCrm("4567b ");
		medico.setNome("João ");
		medico.setIdade(60);
		medico.setSalario(6000);

		ma.setCrm("4545b ");
		ma.setNome("Paulo ");
		ma.setIdade(50);
		ma.setSalario(5999);

		mc.setCrm("4576b ");
		mc.setNome("Marcio ");
		mc.setIdade(50);
		mc.setSalario(15000);

		System.out.println(medico);
		System.out.println(ma);
		System.out.println(mc);

		medico.medicoAposentado();
		ma.medicoAposentado();
		mc.medicoAposentado();

		medico.ValorAponsentadoria();
		mc.ValorAponsentadoria();

	}

}
