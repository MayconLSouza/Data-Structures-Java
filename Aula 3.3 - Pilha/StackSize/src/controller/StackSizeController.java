package controller;

import br.edu.fateczl.pilhaint.PilhaInt;

public class StackSizeController {

	public StackSizeController() {
		super();
	}
	
	public int stackSize() {
		int[] array = {0, 5, 7, -4, 3, 5, -2, -1, 10, 4, 3, -6, 2, -9, 1, -5};
		PilhaInt stack = new PilhaInt();
		
		//Empilhar pilha
		for (int i = 0; i < array.length; i++) {
			//Se 0 ou positivo
			if(array[i] >= 0) {
				//Empilhar valor 
				stack.push(array[i]);
			} else {		//Se negativo
				try {
					//Desempilhar 2 valores
					int number1 = stack.pop();
					int number2 = stack.pop();
					//Somar eles
					int add = number1 + number2;
					//Empilhar numero negativo e valor da soma
					stack.push(array[i]);
					stack.push(add);
				} catch (Exception e) {
					String msgError = e.getMessage();
					System.err.println(msgError);
				}	//fim catch
			}	//fim else
		}	//fim for
		
		return stack.size();
		
	}

}
