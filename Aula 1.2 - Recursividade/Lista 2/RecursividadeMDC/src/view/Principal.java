// Fazer uma função recursiva que receba 2 números inteiros positivos e apresente o MDC desses números.

package view;

import controller.MDCController;

public class Principal {

	public static void main(String[] args) {
		int numberA = 20, numberB = 24;
		
		MDCController pc = new MDCController();
		System.out.println(pc.mdc(numberA, numberB));	//sysout
	}

}
