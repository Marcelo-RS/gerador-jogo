package model.builder;

import model.Enum.NivelDificuldade;

public class GeradorDeQuestao {

	private QuestaoBuilder questaoBuilder;
	
	public GeradorDeQuestao(QuestaoBuilder questaoBuilder){
		
		this.questaoBuilder = questaoBuilder;
	}
	
	public IQuestao geraQuestao(NivelDificuldade dicifuldade){
				
		this.questaoBuilder.buildDificuldade (dicifuldade);
		this.questaoBuilder.buildEnunciado ("testando questões");
		this.questaoBuilder.buildTempo ("00:00:60");
		this.questaoBuilder.buildQuantidade (25);
		this.questaoBuilder.buildOpcResposta ("V ou F");
		
		IQuestao questao = questaoBuilder.getIQuestao ();
	
		return questao;
	}
}
