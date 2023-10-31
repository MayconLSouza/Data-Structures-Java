package view;

import controller.ControllerChocolate;
import model.Chocolate;

public class Principal {

	public static void main(String[] args) throws Exception {
		
		ControllerChocolate methods = new ControllerChocolate();
		int[] altura = {10, 3, 5, 5, 6, 5};
		int[] largura = {10, 4, 5, 3, 6, 4};
		int[] comprimento = {10, 5, 4, 10, 6, 14};
		
		for(int i = 0; i < 6; i++) {
			Chocolate chocolate = new Chocolate();
			chocolate.altura = altura[i];
			chocolate.largura = largura[i];
			chocolate.comprimento = comprimento[i];
			methods.adicionaChocolate(chocolate);
		}
		
		Chocolate chocolateProcurar = new Chocolate();
		chocolateProcurar.receita = "Ovo de pascoa";
		methods.procurarChocolate(chocolateProcurar);
		
		Chocolate chocolateUsar = new Chocolate();
		chocolateUsar.receita = "Bombom";
		methods.usarChocolate(chocolateUsar);

	}

}
