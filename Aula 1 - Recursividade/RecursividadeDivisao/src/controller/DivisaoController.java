package controller;

public class DivisaoController {

	public DivisaoController() {
		super();
	}
	
	public int divisao(int dividendo, int divisor) {
		//Condição de parada
		if(dividendo < divisor) {
			return 0;
		} else {
			dividendo -= divisor;
			return 1 + divisao(dividendo, divisor);	//Chamada da próxima função 
		}
	}

}
