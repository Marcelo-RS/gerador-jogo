package model.factoryMethod;

import model.factoryMethod.EmissorCreate;

public class EmissorAssincronoCreate extends EmissorCreate{

	public Emissor create(int tipoDeEmissor) {

		EmissorCreate creator = new EmissorAssincronoCreate();
		Emissor emissor = creator.create(EmissorCreate.SMSFIM);
		emissor.envia("Emissor Assíncrono ");

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
