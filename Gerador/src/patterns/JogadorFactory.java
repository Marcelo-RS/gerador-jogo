package patterns;

import java.util.ArrayList;
import java.util.List;

import Enum.Nome;
import model.Jogador;

public class JogadorFactory {
	
	public static JogadorFactory getJogadorFactory() {
		return new JogadorFactory();
	}
	
	public List<Jogador> getListaJogador(List<Nome> nomes, int quantidade){
		
		if (quantidade > nomes.size()) {
			quantidade = nomes.size();
		}
		
		List<Jogador> Jogadores = new ArrayList<Jogador>();
		
		Jogador Jogador;
		Long id;
		
		for (Integer i = 0;  i <= quantidade-1; i++ ) {
			Jogador = new Jogador();
			Jogador.setNome(nomes.get(i));
			id = Long.valueOf(i);
			Jogador.setId(id);
			Jogadores.add(Jogador);
		}
		return Jogadores;
	}
	
}
