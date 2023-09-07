package controller;

import br.edu.fateczl.pilhaint.PilhaInt;

public class ConverteController {

	public ConverteController() {
		super();
	}

	public String decToBin(int decimal) {

		PilhaInt pilha = new PilhaInt();
		String binario = "";

		if(decimal == 0) {
			return "0";
		}

		while(decimal > 0) {
			int resto = decimal % 2;
			pilha.push(resto);
			decimal /= 2;
		}

		while(!pilha.isEmpty()) {
			try {
				binario += pilha.pop();
			} catch (Exception e) {
				String msgError = e.getMessage();
				System.err.println(msgError);
			}
		}
	
		return binario;
			
	}
}
