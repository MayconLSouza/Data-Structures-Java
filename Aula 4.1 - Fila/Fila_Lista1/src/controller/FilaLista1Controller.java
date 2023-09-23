package controller;

import br.edu.fateczl.fila.Fila;
import br.edu.fateczl.pilhaint.PilhaInt;

public class FilaLista1Controller {

	public FilaLista1Controller() {
		super();
	}
	
	public void Exercicio1 (Fila<Integer> fila) {
		
		PilhaInt pilha = new PilhaInt();
		int elemento;
		
		while(!fila.isEmpty()) {
			try {
				elemento = fila.remove();
				pilha.push(elemento);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		while(!pilha.isEmpty()) {
			try {
				elemento = pilha.pop();
				fila.insert(elemento);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		try {
			fila.list();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void Exercicio2A() {
		
		Fila<Integer> fila = new Fila<>();
		
		for(int i = 0 ; i < 10 ; i++ ) {
			if(i % 2 == 0) {
				fila.insert(i*i);
			} else {
				if(i <= 5) {
					fila.insert(i);
				} else {
					int elemento;
					try {
						elemento = fila.remove();
						System.out.println("\nRemovido = " + elemento);
					} catch (Exception e) {
						e.printStackTrace();
					}
					
				}
			}
			try {
				System.out.println("#" + i);
				fila.list();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		int tamanho = fila.size();
		System.out.println("\nTamanho = " + tamanho);
	}

	public void Exercicio2B() {
	
		Fila<Integer> fila = new Fila<>();
		int elemento;
		
		for(int i = 100 ; i < 115 ; i++ ) {
			if(fila.isEmpty()) {
				fila.insert(i + 100);
			} else {
				if(fila.size() <= 4) {
					fila.insert(i + 50);
				} else {
					try {
						elemento = fila.remove();
						System.out.println("\nRemovido = " + elemento);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
			try {
				System.out.println("#" + i);
				fila.list();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		int tamanho = fila.size();
		System.out.println("\nTamanho = " + tamanho);
		
	}

	public void Exercicio4(PilhaInt pilha) {
		
		Fila<Integer> par = new Fila<>();
		Fila<Integer> impar = new Fila<>();
		int elemento = 0;
		
		while(!pilha.isEmpty()) {
			try {
				elemento = pilha.pop();
			} catch (Exception e) {
				e.printStackTrace();
			}
			if(elemento % 2 == 0) {
				par.insert(elemento);
			} else {
				impar.insert(elemento);
			}
		}
		
		try {
			System.out.println("#Par");
			par.list();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			System.out.println("#Impar");
			impar.list();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
