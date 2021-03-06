package model;

import java.io.Serializable;

import model.observer.AcaoObserver;

//Padão Singleton e Obserber

public class Jogador implements Serializable, AcaoObserver {

	private static final long serialVersionUID = 1L;

	private Integer id;
	private String nome;
	private Jogo jogo;
	private Avatar avatar;
	private static Jogador instance;

	public Jogador(Integer id, String nome) {
		this.id = id;
		this.nome = nome;
	}

	public Jogador() {
		
	}

	public static Jogador getInstance() {

		if (Jogador.instance == null) {

			Jogador.instance = new Jogador();
		}

		return Jogador.instance;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {

		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Avatar getAvatar() {
		return avatar;
	}

	public void setAvatar(Avatar avatar) {
		this.avatar = avatar;
	}

	public Jogo getJogo() {
		return jogo;
	}

	public void setJogo(Jogo jogo) {
		this.jogo = jogo;
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
		Jogador other = (Jogador) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	//Método do Observer
	public void notificaAlteracao(Jogo acao) {
		System.out.println("\n" + "Jogador(a) " + this.nome + " sendo notificado(a)");
		System.out.println("\n" + "A ação " + acao.getId() + " teve o seu valor alterado para " + acao.getStatus());

	}

}
