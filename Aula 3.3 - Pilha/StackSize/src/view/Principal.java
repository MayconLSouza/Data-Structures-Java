package view;

import controller.StackSizeController;

public class Principal {

	public static void main(String[] args) {
		
		int elements;
		StackSizeController methods = new StackSizeController();
		
		elements = methods.stackSize();
		
		System.out.println("Quantidade de valores na pilha = " + elements);
		
	}

}
