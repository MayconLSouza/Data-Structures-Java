package controller;

import br.edu.fateczl.fila.Fila;
import model.Pessoa;

public class ParqueController {

	private Pessoa pessoa;
	
	public ParqueController() {
		super();
	}
	
	public void brinquedo(Fila<Pessoa> fila) {
		try {
			while(!fila.isEmpty()) {
				pessoa = fila.remove();
				if(pessoa.idade > 16 && pessoa.altura > 1.60) {
					System.out.println(pessoa.nome + " entrou no Boomerang\n");
				} else if(pessoa.idade > 16) {
					System.out.println(pessoa.nome + " nao entrou no Boomerang por nao ter a altura permitida(acima de 1.60 m) = " + pessoa.altura + " m\n");
				} else if(pessoa.altura > 1.60) {
					System.out.println(pessoa.nome + " nao entrou no Boomerang por nao ter a idade permitida(acima de 16 anos) = " + pessoa.idade + " anos\n");
				} else {
					System.out.println(pessoa.nome + " nao entrou no Boomerang por nao ter altura(acima de 1.60m) nem idade(acima de 16 anos) permitida = " + pessoa.idade + " anos e " + pessoa.altura + " m");
				}
			}
		} catch (Exception e) {
			String msgErro = e.getMessage();
			System.err.println(msgErro);
		}
	}

}
