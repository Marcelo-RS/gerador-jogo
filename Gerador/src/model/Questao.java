package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import model.Enum.NivelDificuldade;
import model.builder.IQuestao;

public class Questao implements Serializable, IQuestao{

	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String enunciado;
	private String tempo;
	private int quantidade;
	private String opcResposta;
	private NivelDificuldade dificuldade;
	private List<Casa> casas = new ArrayList<>();
	
	public Questao(String enunciado, String tempo, int quantidade, 
			String opcResposta, NivelDificuldade dificuldade) {
		
		this.enunciado = enunciado;
		this.tempo = tempo;
		this.quantidade = quantidade;
		this.opcResposta = opcResposta;
		this.dificuldade = dificuldade;		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEnunciado() {
		return enunciado;
	}

	public void setEnunciado(String enunciado) {
		this.enunciado = enunciado;
	}

	public String getTempo() {
		return tempo;
	}

	public void setTempo(String tempo) {
		this.tempo = tempo;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public String getOpcResposta() {
		return opcResposta;
	}

	public void setOpcResposta(String opcResposta) {
		this.opcResposta = opcResposta;
	}

	public NivelDificuldade getDificuldade() {
		return dificuldade;
	}

	public void setNivel(NivelDificuldade dificuldade) {
		this.dificuldade = dificuldade;
	}

	public List<Casa> getCasas() {
		return casas;
	}

	public void setCasas(List<Casa> casas) {
		this.casas = casas;
	}

	public String toString () {

		StringBuilder stringBuilder = new StringBuilder ();
		stringBuilder.append("\n" + "Corpo da Questão" + "\n");		

		stringBuilder.append("\n" + "Enunciado: " + this.enunciado + "\n");		

		stringBuilder.append ("\n" + "Nível de Dificuldade: " + this.dificuldade + "\n");		

		stringBuilder.append("\n" + "Tempo na Questão: " + this.tempo + "\n");		

		stringBuilder.append("\n" + "Número de Questões: " + this.quantidade + "\n");
		
		stringBuilder.append("\n" + "Opções de Resposta: " + this.opcResposta + "\n");		

		return stringBuilder.toString();
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Questao other = (Questao) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}	
}
