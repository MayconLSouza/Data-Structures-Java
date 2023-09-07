package model;

public class PilhaInt {

	No topo;
	
	//construtor
	public PilhaInt() {
		//topo é a base no início da pilha
		topo = null;
	}
	
	//verifica se pilha está vazia
	public boolean isEmpty() {
		if(topo == null) {
			return true;
		}
		else {
			return false;
		}
	}
	
	//empilha elemento
	public void push(int valor) {
		No elemento = new No();
		elemento.dado = valor;
		elemento.proximo = topo;
		topo = elemento;
	}
	
	//desempilha elemento
	public int pop() throws Exception {
		if(isEmpty()) {
			throw new Exception("Pilha Vazia");
		}
		int valor = topo.dado;
		topo = topo.proximo;
		return valor;
	}
	
	//valor que está no topo
	public int top() throws Exception{
		if(isEmpty()) {
			throw new Exception("Pilha Vazia");
		}
		int valor = topo.dado;
		return valor;
	}
	
	//tamanho da pilha
	public int size() {
		int cont = 0;
		if (!isEmpty()) {
			No aux = topo;
			while(aux != null) {
				cont++;
				aux = aux.proximo;
			}
		}
		return cont;
	}
}
