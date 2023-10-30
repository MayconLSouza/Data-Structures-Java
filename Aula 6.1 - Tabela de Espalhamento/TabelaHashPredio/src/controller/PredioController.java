package controller;

import br.edu.fatec.zl.Lista.Lista;
import model.Morador;

@SuppressWarnings("unchecked")
public class PredioController {
	
	Lista<Morador>[] andar;

	public PredioController() {
		andar = new Lista[10];
		int tamanho = andar.length;
		for(int i = 0; i < tamanho; i++) {
			andar[i] = new Lista<Morador>();  
		}
	}
	
	public void cadastrarMorador(int apartamento, String nome, String modeloCarro, String corCarro, String placaCarro) throws Exception {
		int numeroAndar = hash(apartamento);
		Morador morador = new Morador(apartamento, nome, modeloCarro, corCarro, placaCarro, numeroAndar);
		if(andar[numeroAndar].isEmpty()) {
			andar[numeroAndar].addFirst(morador);
		} else {
			andar[numeroAndar].addLast(morador);
		}
	}
	
	public void consultarMorador(int apartamento) throws Exception{
		int numeroAndar = hash(apartamento);
		int tamanho = andar[numeroAndar].size();
		boolean flagMoradorExistente = false;
		for(int i = 0; i < tamanho; i++) {
			Morador morador = andar[numeroAndar].get(i);
			if(apartamento == morador.apartamento) {
				System.out.println(morador.toString());
				flagMoradorExistente = true;
				break;
			}
		}
		if(!flagMoradorExistente) {
			System.out.println("Morador nao encontrado");
		}
	}
	
	public void excluirMorador(int apartamento) throws Exception{
		int numeroAndar = hash(apartamento);
		int tamanho = andar[numeroAndar].size();
		boolean flagMoradorExistente = false;
		for(int i = 0; i < tamanho; i++) {
			Morador morador = andar[numeroAndar].get(i);
			if(apartamento == morador.apartamento) {
				andar[numeroAndar].remove(i);
				flagMoradorExistente = true;
				break;
			}
		}
		if(!flagMoradorExistente) {
			System.out.println("Morador nao encontrado");
		}
	}
	
	public void consultarAndar(int numeroAndar) throws Exception{
		if(andar[numeroAndar].isEmpty()) {
			System.out.println("Andar vazio");
		} else {
			int tamanho = andar[numeroAndar].size();
			for(int i = 0; i < tamanho; i++) {
				Morador morador = andar[numeroAndar].get(i);
				System.out.println(morador.toString());
			}
		}
	}

	private int hash(int apartamento) {
		int numeroAndar = apartamento / 100;
		numeroAndar -= 1;
		return numeroAndar;
	}

}
