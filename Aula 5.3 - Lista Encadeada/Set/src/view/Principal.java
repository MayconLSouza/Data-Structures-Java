package view;

import br.edu.fateczl.Set.Set;

public class Principal {

	public static void main(String[] args) {
		Set<Integer> setInteiro = new Set<>();
		Set<String> setString = new Set<>();
		
		//Set inteiros
		try {
			setInteiro.addFirst(1);
			setInteiro.addLast(2);
			setInteiro.add(10, 1);
			setInteiro.addFirst(0);
			System.out.println(setInteiro.get(1));
			setInteiro.add(20, 2);
			System.out.println(setInteiro.get(3));
			setInteiro.removeFirst();
			setInteiro.removeLast();
			setInteiro.remove(1);
			System.out.println(setInteiro.get(1));
			System.out.println("Tamanho = " + setInteiro.size());
			//Repetir elemento
			setInteiro.addFirst(1);
//			setInteiro.addLast(10);
//			setInteiro.add(10, 1);
		} catch (Exception e) {
			String msgErro = e.getMessage();
			System.err.println(msgErro);
		}
		
//		//Set String
//		try {
//			setString.addFirst("Banana");
//			setString.addLast("Uva");
//			setString.add("Goiaba", 1);
//			//Repetir elemento
//			setString.addFirst("Banana");
//			setString.addLast("Uva");
//			setString.add("Goiaba", 1);
//		} catch (Exception e) {
//			String msgErro = e.getMessage();
//			System.err.println(msgErro);
//		}
	}

}