package controller;

public class FatorialController {

	public FatorialController() {
		super();
	}
	
	public int fatorial(int numero) {
		//Condição de chamada
		if(numero == 1) {
			return 1;
		} else {
			return numero * fatorial(numero-1);		//Chamada da próxima função
		}
	}

}
