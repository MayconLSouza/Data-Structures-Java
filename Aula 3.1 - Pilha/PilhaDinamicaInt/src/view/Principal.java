package view;

import model.PilhaInt;

public class Principal {

	public static void main(String[] args) {
		
		PilhaInt p =  new PilhaInt();
		
		//Gera valor para empilhar
		for (int i = 0; i < 5; i++) {
			int valor = (int)((Math.random()*100)+1);
			p.push(valor);
		}
		
		try {
			
			//Topo da pilha
			int topo = p.top();
			System.out.println("Topo = " + topo);
			
			//Tamanho da pilha
			int tamanho = p.size();
			System.out.println("Tamanho = " + tamanho);
			
			//Desempilhar
			while(!p.isEmpty()) {
				int valor = p.pop();
				System.out.println(valor);
			}
			
			//Verificar exceção
			p.pop();
			
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
	}

}
