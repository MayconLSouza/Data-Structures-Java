// 1. Crie uma função recursiva que exiba a quantidade de dígitos de um número inteiro passado como parâmetro.

package view;

import controller.DigitosController;

public class Principal {

	public static void main(String [] args) {
		int number = 12345;

		DigitosController methods = new DigitosController();
		System.out.println(methods.quantidadeDigitos(number));	//sysout
	}
}
