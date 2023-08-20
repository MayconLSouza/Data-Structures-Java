package controller;

public class NumberController {

	public NumberController() {
		super();
	}
	
	//Função recursiva
	public int number(int numberA, int numberB) {
		//Condição de parada
		if (numberA < 1){
			return 0;
		} else {
			if( (numberA % 10) == numberB ) {
				return 1 + number(numberA/10, numberB);	//Chamada da próxima função
			}
			return number(numberA/10, numberB);	//Chamada da próxima função
		}
	}
	
}
