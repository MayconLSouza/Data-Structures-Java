package controller;

public class MDCController {

	public MDCController() {
		super();
	}
	
	public int mdc(int numberA, int numberB) {
		//Condição de parada
		if(numberA == numberB) {
			return numberA;		
		} else {
			if(numberA > numberB) {
				return mdc(numberA-numberB, numberB);		//Chamada da próxima função
			}
			return mdc(numberB, numberA);		//Chamada da próxima função
		}
	}

}
