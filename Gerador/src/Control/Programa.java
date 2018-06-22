package Control;

import model.Jogador;
import model.factoryMethod.Emissor;
import model.factoryMethod.EmissorCreate;
import model.factoryMethod.EmissorSMSFim;
import model.factoryMethod.EmissorSMSInicio;

public class Programa {

	public static void main(String[] args) {

		// singleton
		Jogador jogador = Jogador.getInstance();
		System.out.println(jogador.getNome());

		// factory method

		EmissorCreate creator = new EmissorCreate();

		Emissor emissor1 = new EmissorSMSInicio();
		emissor1.envia("\n" + "Bem vindo ao gerador de jogo! "
				+ "\n" + "Crie seu jogo com as configurações de sua preferência!!!");

		Emissor emissor2 = new EmissorSMSFim();
		emissor2.envia("\n" + "Parabéns!!!" + "\n" + "você finalizou suas configurações preferidas."
				+ "\n" + "Que comecem os jogos..." );		

		/*
		 * prototype String cor = "preto";
		 * 
		 * Set<String> hashSet = new HashSet<String>();
		 * 
		 * Avatar avatar = new Avatar(cor, hashSet); System.out.println(avatar);
		 * 
		 * Avatar clone = avatar.clone();
		 * 
		 * System.out.println(clone);
		 */
	}
}
