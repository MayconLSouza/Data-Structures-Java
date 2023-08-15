//2. Criar uma função recursiva que receba o dividendo e o divisor de uma operação de divisão e, por subtrações, exiba o resto da divisão.

package view;

import controller.RestoController;

public class Principal {

	public static void main(String[] args) {
		int dividendo = 21;
		int divisor = 5;
		
		RestoController pc = new RestoController();
		System.out.println(pc.resto(dividendo, divisor));		//sysout

	}

}
