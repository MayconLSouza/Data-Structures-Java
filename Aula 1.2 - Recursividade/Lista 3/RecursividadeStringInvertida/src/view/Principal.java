package view;

import controller.Methods;

public class Principal {
	
	public static void main (String[] args) {
		String entrada = "ola mundo";

		Methods methods = new Methods();
		System.out.println(methods.palavraInvertida(entrada));	//sysout
	}
}
