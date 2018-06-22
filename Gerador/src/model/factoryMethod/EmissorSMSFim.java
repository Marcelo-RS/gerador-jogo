package model.factoryMethod;

import model.factoryMethod.Emissor;

public class EmissorSMSFim implements Emissor{
	
	public void envia(String mensagem) {

		Emissor emissor = new EmissorSMSFim();
		System.out.println("\n" + "Envia mensagem de boa sorte:");
		System.out.println(mensagem);
	}
	
}
