package controller;

public class RestoController {

	public RestoController() {
		super();
	}
	
	public int resto(int dividendo, int divisor) {
		//Condição de parada
		if(dividendo < divisor) {
			return dividendo;
		} else {
			dividendo -= divisor;
			return resto(dividendo, divisor);	//Chamada da próxima função
		}
	}
}


