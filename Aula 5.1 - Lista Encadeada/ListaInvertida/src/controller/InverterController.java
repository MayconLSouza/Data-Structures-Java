package controller;

import br.edu.fatec.zl.Lista.Lista;
import br.edu.fateczl.fila.Fila;

public class InverterController {
	
	public InverterController() {
		super();
	}

	public void inverteLista(Lista<Integer> lista) {
		
		//Cria uma fila para auxiliar a inverter
		Fila<Integer> fila = new Fila<>();
		
		//Passa os valores da lista para fila
		while(!lista.isEmpty()) {
			try {
				int elemento = lista.get(0);
				fila.insert(elemento);
				lista.removeFirst();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		//Passa os valores da fila de volta para lista de maneira invertida
		while(!fila.isEmpty()) {
			try {
				int elemento = fila.remove();
				lista.addFirst(elemento);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}

}
