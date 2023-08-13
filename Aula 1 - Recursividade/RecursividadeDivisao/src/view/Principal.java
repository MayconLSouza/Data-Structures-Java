package view;

import controller.DivisaoController;

public class Principal {

		public static void main(String[] args) {
			int dividendo = 21;
			int divisor = 5;
			
			DivisaoController dc = new DivisaoController();		
			System.out.println(dc.divisao(dividendo, divisor));		//sysout
		}
		
}
