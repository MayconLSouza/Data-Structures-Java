// 2. Criar uma aplicação em Java que tenha uma função recursiva que, recebendo um número inteiro de 10 a 999999 e recebendo um 2o número inteiro (de 0 a 9), 
// tenha uma função recursiva que apresente quantas vezes o 2o número aparece no primeiro.

package view;

import controller.NumberController;

public class Principal {
	
	public static void main(String[] args) {
		NumberController methods = new NumberController();
		int numberA = 201555, numberB = 5;
		
		if( (numberA < 10) || (numberA > 999999) || (numberB < 0) || (numberB > 9) ) {
			System.out.println("Numero invalido");
			System.exit(0);
		}

		System.out.println(methods.number(numberA, numberB));	//sysout
		
	}
}
