package view;

import controller.Methods;

public class Principal {
	
	public static void main (String [] args) {
		int decimal = 25; 	//Entrada limitada a 2000

		Methods methods = new Methods();
		System.out.println(methods.binario(decimal));	//sysout
	}
}
