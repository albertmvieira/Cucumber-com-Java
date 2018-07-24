package cursoCucumber.services;

import cursoCucumber.entidades.Filme;
import cursoCucumber.entidades.NotaAluguel;

public class AluguelService {
	
	public NotaAluguel alugar(Filme filme) {
		NotaAluguel nota = new NotaAluguel();
		nota.setPreco(filme.getAluguel());
		return nota;
		
	}

}
