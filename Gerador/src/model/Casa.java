package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Casa implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private int numero;
	private int qtd;
	private Jogo jogo;
	private List<Questao> questoes = new ArrayList<>();
	
	public Casa(Integer id, int numero, int qtd, Jogo jogo, List<Questao> questoes) {
		super();
		this.id = id;
		this.numero = numero;
		this.qtd = qtd;
		this.jogo = jogo;
		this.questoes = questoes;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getQtd() {
		return qtd;
	}
	public void setQtd(int qtd) {
		this.qtd = qtd;
	}
	public Jogo getJogo() {
		return jogo;
	}
	public void setJogo(Jogo jogo) {
		this.jogo = jogo;
	}
	public List<Questao> getQuestoes() {
		return questoes;
	}
	public void setQuestoes(List<Questao> questoes) {
		this.questoes = questoes;
	}
	@Override
	public String toString() {
		return "Casa [id=" + id + ", numero=" + numero + ", qtd=" + qtd + ", jogo=" + jogo + "]";
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
		Casa other = (Casa) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}	
}
