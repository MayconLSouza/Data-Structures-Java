// 1. Criar uma função recursiva que receba 2 valores A e B e, por somas, apresente o resultado da multiplicação de A por B.

package view;

import controller.MultiplicacaoController;

public class Principal {

	public static void main(String[] args) {
		int numberA = 4, numberB = 5;

		MultiplicacaoController pc = new  MultiplicacaoController();
		System.out.println(pc.multiplicacao(numberA, numberB));		//sysout
	}

}
