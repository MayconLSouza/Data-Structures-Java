package controller;

import br.edu.fateczl.pilhaint.PilhaInt;

public class FatController {

	public FatController() {
		super();
	}
	
	public long calcFatorial(int number) {
		
		long fat = 1;
		PilhaInt p = new PilhaInt();
		
		//Preenche a pilha
		while(number > 1) {
			p.push(number);
			number -= 1;
		}
		
		//Calcula fatorial através da pilha
		while(!p.isEmpty()) {
			try {
				fat *= p.pop();
			} catch (Exception e) {
				String msgError = e.getMessage();	
				System.err.println(msgError);
			}
		}
		
		return fat;
	}

}
