package Enum;

public enum Nome {
	
	MARIA(0), MARCOS(1), JOAO(2), LUCAS(3), PAULA(4), PEDRO(5);
	
	private int valor;

	private Nome(int valor) {
		
		this.valor = valor;
	}

	public int getValor() {
		
		return valor;
	}
	
	
}
