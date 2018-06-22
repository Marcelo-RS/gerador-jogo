package model.builder;

import model.Questao;
import model.Enum.NivelDificuldade;

public class QQuestaoBuilder implements QuestaoBuilder{

	private String enunciado;
	private String tempo;
	private int quantidade;
	private String opcResposta;
	private NivelDificuldade dificuldade;
	
	public void buildEnunciado (String enunciado) {

		this.enunciado = enunciado;
	}
	
	public void buildTempo (String tempo) {

		this.tempo = tempo;
	}

	public void buildQuantidade (int quantidade) {

		this.quantidade = quantidade;
	}

	public void buildOpcResposta (String opcResposta) {

		this.opcResposta = opcResposta;
	}

	public void buildDificuldade (NivelDificuldade dificuldade) {

		this.dificuldade = dificuldade;
	}

	public IQuestao getIQuestao () {

		return new Questao (enunciado, tempo, quantidade, opcResposta, dificuldade);
	}
}
