package view;

import br.edu.fatec.zl.Lista.Lista;
import controller.InverterController;

public class Principal {

	public static void main(String[] args) {
		
		Lista<Integer> lista = new Lista<>();
		InverterController methods = new InverterController();
		
		
		//Preenche lista
		try {
			lista.addFirst(3);
			lista.addLast(5);
			lista.addLast(18);
			lista.addLast(12);
			lista.addLast(9);
			lista.addLast(7);
			lista.addLast(6);
			lista.addLast(2);
			lista.addLast(13);
			lista.addLast(4);
			lista.addLast(16);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		int tamanho = lista.size();
		
		//Mostra lista original
		System.out.println("Lista original");
		for (int i = 0; i < tamanho; i++) {
			try {
				System.out.println("#" + i + " = " + lista.get(i));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		methods.inverteLista(lista);
		
		//Mostra lista invertida
		System.out.println("\nLista invertida");
		for (int i = 0; i < tamanho; i++) {
			try {
				System.out.println("#" + i + " = " + lista.get(i));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
