package model;

import java.io.Serializable;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

import Enum.NivelDificuldade;

public class Questao implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String enunciado;
	private Time tempo;
	private int qtd;
	private String opcResposta;
	private NivelDificuldade nivel;
	private List<Casa> casas = new ArrayList<>();
	
	public Questao() {
		super();
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

	public Time getTempo() {
		return tempo;
	}

	public void setTempo(Time tempo) {
		this.tempo = tempo;
	}

	public int getQtd() {
		return qtd;
	}

	public void setQtd(int qtd) {
		this.qtd = qtd;
	}

	public String getOpcResposta() {
		return opcResposta;
	}

	public void setOpcResposta(String opcResposta) {
		this.opcResposta = opcResposta;
	}

	public NivelDificuldade getNivel() {
		return nivel;
	}

	public void setNivel(NivelDificuldade nivel) {
		this.nivel = nivel;
	}

	public List<Casa> getCasas() {
		return casas;
	}

	public void setCasas(List<Casa> casas) {
		this.casas = casas;
	}

	@Override
	public String toString() {
		return "Questao [id=" + id + ", enunciado=" + enunciado + ", tempo=" + tempo + ", qtd=" + qtd + ", opcResposta="
				+ opcResposta + ", nivel=" + nivel + ", casas=" + casas + "]";
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
