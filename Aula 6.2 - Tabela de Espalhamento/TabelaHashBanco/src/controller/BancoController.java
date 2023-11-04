package controller;

import br.edu.fatec.zl.Lista.Lista;
import model.Cliente;

@SuppressWarnings("unchecked")
public class BancoController {
	
	Lista<Cliente>[] conta;

	public BancoController() {
		conta = new Lista[10000];
		for(int i = 0; i < conta.length; i++) {
			conta[i] = new Lista<Cliente>();
		}
	}
	
	public void inserirConta(int numeroConta, String nome, double saldoConta) throws Exception {
		Cliente cliente = new Cliente(numeroConta, nome, saldoConta);
		int posicao = cliente.hash(cliente.numeroConta);
		conta[posicao].addLast(cliente);
	}
	
	public void consultarConta(int numeroConta) throws Exception {
		Cliente cliente = new Cliente();
		boolean contaEncontrada = false;
		int posicao = cliente.hash(numeroConta);
		int tamanhoConta = conta[posicao].size();
		for(int i = 0; i < tamanhoConta; i++) {
			cliente = conta[posicao].get(i);
			if(cliente.numeroConta == numeroConta) {
				System.out.println(cliente.toString());
				contaEncontrada = true;
				break;
			}
		}
		if(!contaEncontrada) {
			System.out.println("Nao encontramos nenhuma conta com este numero informado");
		}
	}
	
	public void excluirConta(int numeroConta) throws Exception {
		Cliente cliente = new Cliente();
		boolean contaEncontrada = false;
		int posicao = cliente.hash(numeroConta);
		int tamanhoConta = conta[posicao].size();
		for(int i = 0; i < tamanhoConta; i++) {
			cliente = conta[posicao].get(i);
			if(cliente.numeroConta == numeroConta) {
				conta[posicao].remove(i);
				System.out.println("Conta #" + numeroConta + " foi removida");
				contaEncontrada = true;
				break;
			}
		}
		if(!contaEncontrada) {
			System.out.println("Nao encontramos nenhuma conta com este numero informado");
		}
	}

}
