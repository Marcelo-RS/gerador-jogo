package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import model.observer.AcaoObserver;

//Padrão Observer

public class Jogo implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;
	private boolean status = false;
	private String tema;
	private String nome;
	private String instrucoes;
	private List<Casa> casas = new ArrayList<>();
	private Jogador jogador;

	private Set<AcaoObserver> interessados = new HashSet<AcaoObserver>();

	public void registraInteressado(AcaoObserver interessado) {
		this.interessados.add(interessado);
	}

	public void cancelaInteresse(AcaoObserver interessado) {
		this.interessados.remove(interessado);
	}

	public Jogo(Integer id, boolean status) {
		this.id = id;
		this.status = status;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
		
		for (AcaoObserver interessado : this.interessados) {
			interessado.notificaAlteracao(this);
		}
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getInstrucoes() {
		return instrucoes;
	}

	public void setInstrucoes(String instrucoes) {
		this.instrucoes = instrucoes;
	}

	public List<Casa> getCasas() {
		return casas;
	}

	public void setCasas(List<Casa> casas) {
		this.casas = casas;
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
		Jogo other = (Jogo) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
