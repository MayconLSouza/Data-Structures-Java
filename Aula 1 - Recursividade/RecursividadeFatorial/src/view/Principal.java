package view;

import controller.FatorialController;

public class Principal {

	public static void main(String[] args) {
		int numero = 5;		//estouro(limite de entrada = 12)

		FatorialController pc = new FatorialController();
		System.out.println(pc.fatorial(numero));	//sysout
	}

}
