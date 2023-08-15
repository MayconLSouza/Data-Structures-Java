package view;

import controller.PotenciaController;

public class Principal {

	public static void main(String[] args) {		
		int base = 2;
		int expoente = 5;
		
		PotenciaController pc = new PotenciaController();
		System.out.println(pc.potencia(base, expoente));	//sysout
	}

}
