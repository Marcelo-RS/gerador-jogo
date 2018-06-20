package patterns;

import model.Jogo;

public class JogoSingleton {

	private static JogoSingleton instancia;
	private Jogo nome;
	private Jogo tema;

	private JogoSingleton() {

	}

	public static JogoSingleton getInstance() {

		if (JogoSingleton.instancia == null)
			JogoSingleton.instancia = new JogoSingleton();
		return JogoSingleton.instancia;
	}

	public Jogo getNome() {

		if (nome == null)
			nome = new Jogo();
		return nome;
	}

	public Jogo getTema() {

		if (tema == null)
			tema = new Jogo();
		return tema;
	}
}
