package Control;

import model.Jogador;
import model.Jogo;
import model.Enum.NivelDificuldade;
import model.builder.GeradorDeQuestao;
import model.builder.IQuestao;
import model.builder.QQuestaoBuilder;
import model.builder.QuestaoBuilder;
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
		emissor1.envia("\n" + "Bem vindo ao gerador de jogo! " + "\n"
				+ "Crie seu jogo com as configurações de sua preferência!!!");

		Emissor emissor2 = new EmissorSMSFim();
		emissor2.envia("\n" + "Parabéns!!!" + "\n" + "você finalizou suas configurações preferidas." + "\n"
				+ "Que comecem os jogos...");

		// Builder
		QuestaoBuilder questaoBuilder = new QQuestaoBuilder();
		GeradorDeQuestao geradorDeQuestao = new GeradorDeQuestao(questaoBuilder);
		IQuestao iQuestao = geradorDeQuestao.geraQuestao(NivelDificuldade.MEDIO);
		System.out.println(iQuestao);

		// Observer
		Jogo acao = new Jogo(2, true);

		Jogador jogador1 = new Jogador(2, "Maria");		

		acao.registraInteressado(jogador1);		

		acao.setStatus(true);
		System.out.println(acao + "\n" + "A tradução da palavra true para a lingua portuguesa é 'verdadeiro', significando usuário ativo");

		
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
