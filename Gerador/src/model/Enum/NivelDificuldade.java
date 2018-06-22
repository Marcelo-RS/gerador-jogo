package model.Enum;

public enum NivelDificuldade {
	FACIL(0), MEDIO(1), DIFICIL(2);
	
	private int valor;	

	private NivelDificuldade(int valor) {
		this.valor = valor;
	}

	public int getValor() {
		return valor;
	}
	
	
}
