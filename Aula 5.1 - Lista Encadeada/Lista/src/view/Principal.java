package view;

import br.edu.fatec.zl.Lista.Lista;

public class Principal {

	public static void main(String[] args) {
		Lista<Integer> lista = new Lista<>();
		try {
			lista.addFirst(1);
			lista.addLast(2);
			lista.add(10, 1);
			lista.addFirst(0);
			System.out.println(lista.get(1));
			lista.add(20, 2);
			System.out.println(lista.get(3));
			lista.removeFirst();
			lista.removeLast();
			lista.remove(1);
			System.out.println(lista.get(1));
			System.out.println("Tamanho = " + lista.size());
		} catch (Exception e) {
			String msgErro = e.getMessage();
			System.err.println(msgErro);
		}
	}

}
