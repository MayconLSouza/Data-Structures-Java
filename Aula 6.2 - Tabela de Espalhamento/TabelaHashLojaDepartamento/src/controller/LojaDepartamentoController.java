package controller;

import br.edu.fatec.zl.Lista.Lista;
import model.Departamento;

@SuppressWarnings("unchecked")
public class LojaDepartamentoController {

	Lista<Departamento>[] loja;
	String[] andar = {"terreo","primeiro andar","segundo andar","terceiro andar"};
	
	public LojaDepartamentoController() {
		loja = new Lista[4];
		for (int i = 0; i < 4; i++) {
			loja[i] = new Lista<Departamento>();
		}
	}
	
	public void cadastrarTabela(String[][] departamentos, String[][] descricao) throws Exception {
		//Preencher
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < departamentos[i].length; j++) {
				Departamento departamento = new Departamento(andar[i], departamentos[i][j], descricao[i][j]);
				loja[i].addLast(departamento);
			}
		}
	}
	
	public void cadastrarDepartamento(Departamento departamento) throws Exception {
		int posicao = hash(departamento.andar);
		loja[posicao].addLast(departamento);
		System.out.println("Departamento cadastrado");
	}
	
	public void consultarDepartamento(String nome) throws Exception {
		boolean departamentoExiste = false;
		int tamanhoLoja = loja.length;
		for(int i = 0; i < tamanhoLoja; i++) {
			int tamanhoAndar = loja[i].size();
			for(int j = 0; j < tamanhoAndar; j++) {
				Departamento departamento = loja[i].get(j);
				if(departamento.nome.equals(nome)) {
					System.out.println(departamento.toString());
					departamentoExiste = true;
					break;
				}
			}
		}
		if(!departamentoExiste) {
			System.out.println("Nao foi encontrado nenhum departamento com este nome");
		}
	}
	
	public void consultarAndar(String andar) throws Exception {
		int posicao = hash(andar);
		int tamanhoAndar = loja[posicao].size();
		for(int j = 0; j < tamanhoAndar; j++) {
			Departamento departamento = loja[posicao].get(j);
			System.out.println(departamento.toString());	
		}
	}
	
	public void excluirDepartamento(String nome) throws Exception {
		boolean departamentoExiste = false;
		int tamanhoLoja = loja.length;
		for(int i = 0; i < tamanhoLoja; i++) {
			int tamanhoAndar = loja[i].size();
			for(int j = 0; j < tamanhoAndar; j++) {
				Departamento departamento = loja[i].get(j);
				if(departamento.nome.equals(nome)) {
					loja[i].remove(j);
					System.out.println("Departamento excluido");
					departamentoExiste = true;
					break;
				}
			}
		}
		if(!departamentoExiste) {
			System.out.println("Nao foi encontrado nenhum departamento com este nome");
		}
	}

	private int hash(String andar) {
		switch(andar) {
			case "terreo":
				return 0;
			case "primeiro andar":
				return 1;
			case "segundo andar":
				return 2;
			case "terceiro andar":
				return 3;
		}
		return 9;
	}

}
