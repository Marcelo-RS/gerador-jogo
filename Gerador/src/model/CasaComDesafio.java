package model;

import java.io.Serializable;
import java.util.List;

public class CasaComDesafio extends Casa implements Serializable{
		
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String desafio;
	
	public CasaComDesafio(Integer id, int numero, int qtd, Jogo jogo, List<Questao> questoes) {
		super(id, numero, qtd, jogo, questoes);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDesafio() {
		return desafio;
	}

	public void setDesafio(String desafio) {
		this.desafio = desafio;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		CasaComDesafio other = (CasaComDesafio) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}
