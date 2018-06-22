package model.factoryMethod;

public class EmissorCreate {

	public static final int SMSINICIO = 0;
	public static final int SMSFIM = 1;

	public Emissor create(int tipoDeEmissor) {

		EmissorCreate creator = new EmissorAssincronoCreate();
		Emissor emissor = creator.create(EmissorCreate.SMSINICIO);
		emissor.envia("Mensagem para o jogador! ");

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
