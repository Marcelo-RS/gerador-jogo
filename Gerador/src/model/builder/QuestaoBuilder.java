package model.builder;

import model.Enum.NivelDificuldade;

public interface QuestaoBuilder {

	void buildDificuldade(NivelDificuldade difuculdade);
	void buildEnunciado(String enunciado);
	void buildTempo(String tempo);
	void buildQuantidade(int quantidade);
	void buildOpcResposta(String opcResposta);

	IQuestao getIQuestao();
}
