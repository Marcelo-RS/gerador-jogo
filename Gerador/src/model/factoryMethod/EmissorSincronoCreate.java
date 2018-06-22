package model.factoryMethod;

import model.factoryMethod.EmissorCreate;

public class EmissorSincronoCreate extends EmissorCreate {

	public Emissor create(int tipoDeEmissor) {

		EmissorCreate creator = new EmissorSincronoCreate();
		Emissor emissor = creator.create(EmissorCreate.SMSINICIO);
		emissor.envia("Emissor Síncrono ");

		if (tipoDeEmissor == EmissorCreate.SMSINICIO) {
			return new EmissorSMSInicio();
		}

		else if (tipoDeEmissor == EmissorCreate.SMSFIM) {
			return new EmissorSMSFim();
		}

		else {
			throw new IllegalArgumentException(" Tipo de emissor não suportado ");
		}
	}
}
