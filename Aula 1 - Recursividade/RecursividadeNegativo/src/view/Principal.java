package view;

import controller.NegativoController;

public class Principal {

	public static void main (String[] args) {
		int [] vetor = {0, -2, 5, -6, 1, 3, -5};
		int tamanho = vetor.length;
		int elementos = 0;

		NegativoController pc = new NegativoController();
		System.out.println(pc.negativo(vetor, tamanho, elementos));		//sysout
	}
}