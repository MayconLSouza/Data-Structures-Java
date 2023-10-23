package controller;

import br.edu.fatec.zl.Lista.Lista;

public class OperacoesConjuntos {

	public OperacoesConjuntos() {
		super();
	}

	public void interseccao(Lista<Integer> listaA, Lista<Integer> listaB) {
		Lista<Integer> listaI = new Lista<>();
		int tamanhoA = listaA.size();
		int tamanhoB = listaB.size();
		int contadorI = 0;
		//Construir a lista de interseccao
		for(int i = 0; i < tamanhoA; i++) {
			for(int j = 0; j < tamanhoB; j++) {
				try {
					if(listaA.get(i) == listaB.get(j)){
						listaI.add(listaA.get(i), contadorI);
						contadorI++;
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		//Retirar elementos iguais
		int tamanhoI = listaI.size();
		for(int i = 0; i < tamanhoI - 1; i++) {
			try {
				if(listaI.get(i) == listaI.get(i+1)) {
					listaI.remove(i);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		//Exibir lista interseccao
		System.out.println("Conjunto Interseccao");
		for (int i = 0; i < tamanhoI; i++) {
			try {
				System.out.println("#" + i + " = " + listaI.get(i));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public void uniao(Lista<Integer> listaA, Lista<Integer> listaB) {
		Lista<Integer> listaU = new Lista<>();
		int tamanhoA = listaA.size();
		int tamanhoB = listaB.size();
		//Adicionar lista A a lista uniao
		for(int i = 0; i < tamanhoA; i++) {
			try {
				listaU.add(listaA.get(i), i);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		//Adicionar lista B a lista uniao
		for(int i = 0; i < tamanhoB; i++) {
			try {
				listaU.add(listaB.get(i), i + tamanhoA);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		int tamanhoU = listaU.size();
		//Exibir lista uniao
		System.out.println("\nConjunto Uniao");
		for (int i = 0; i < tamanhoU; i++) {
			try {
				System.out.println("#" + i + " = " + listaU.get(i));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
