package view;

import controller.Methods;

public class Principal {

	public static void main (String[] args) {
		int posicao = 5;	//Entrada limitada a 20.
		
		Methods methods = new Methods();
		System.out.println(methods.fibonacci(posicao));	//sysout
	}
}
