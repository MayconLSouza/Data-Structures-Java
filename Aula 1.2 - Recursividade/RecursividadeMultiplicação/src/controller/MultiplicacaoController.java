package controller;

public class MultiplicacaoController {

	public MultiplicacaoController() {
		super();
	}
	
	public int multiplicacao(int numberA, int numberB) {
		//Condição de parada
		if(numberB == 0) {
			return 0;
		} else {
			return  numberA + multiplicacao(numberA, numberB-1);	//Chamada da próxima função
		}
	}

}
