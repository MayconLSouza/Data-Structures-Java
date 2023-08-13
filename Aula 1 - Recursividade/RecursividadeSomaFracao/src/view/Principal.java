package view;

import controller.SomaFracaoController;

public class Principal {

	public static void main (String[] args) {
		int divisor = 5;
		
		SomaFracaoController pc = new SomaFracaoController();
		System.out.println(pc.soma(divisor));	//sysout
	}
}
