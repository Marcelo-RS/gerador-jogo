package model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

//Padrão Prototype

public class Avatar implements Serializable, PrototypeAvatar<Avatar> {

	private static final long serialVersionUID = 1L;

	private Integer id;
	private String cor;
	private Set<String> a;
	private Jogador jogador;

	public Avatar(String cor, Set<String> a) {
		this.cor = cor;
		this.a = a;
	}

	public Avatar clone() {

		String cor = "Cópia da Cor: " + this.cor;
		Set<String> a = new HashSet <String>(this.a);
		Avatar avatar = new Avatar(cor, a);

		return avatar;
	}

	public String toString() {

		StringBuffer buffer = new StringBuffer();
		buffer.append("\n");
		buffer.append("Cor do Avatar: ");
		buffer.append(this.cor);
		buffer.append("\n");

		return buffer.toString();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public Jogador getJogador() {
		return jogador;
	}

	public void setJogador(Jogador jogador) {
		this.jogador = jogador;
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
		Avatar other = (Avatar) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
