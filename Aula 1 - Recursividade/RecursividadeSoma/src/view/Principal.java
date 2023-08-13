package view;

import controller.SomaController;

public class Principal {

	public static void main(String[] args) {
		int numero = 5;
		
		SomaController pc = new SomaController();
		System.out.println(pc.soma(numero));	//sysout
	}

}
