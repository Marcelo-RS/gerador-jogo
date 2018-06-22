package model.builder;

import model.Enum.NivelDificuldade;

public interface IQuestao {

	NivelDificuldade getDificuldade();
	String getEnunciado();
	String getTempo();
	int getQuantidade();
	String getOpcResposta();
	String toString();
}
