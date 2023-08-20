package controller;

public class FatorialDuploController {

	public FatorialDuploController() {
		super();
	}
	
	public int fatorialDuplo(int numero) {
		//Condição de parada
		if(numero == 1) {
			return 1;
		} else {
			return numero * fatorialDuplo(numero-2);	//Chamada da próxima função
		}
	}
}
