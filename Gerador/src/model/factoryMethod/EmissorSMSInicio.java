package model.factoryMethod;

import model.factoryMethod.Emissor;

public class EmissorSMSInicio implements Emissor{
	
	public void envia(String mensagem) {

		Emissor emissor = new EmissorSMSInicio();
		System.out.println("\n" + "Envia mensagem de boas vindas:");
		System.out.println(mensagem);
	}
}
