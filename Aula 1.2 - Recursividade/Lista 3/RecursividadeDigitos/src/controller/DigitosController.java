package controller;

public class DigitosController {
	
	public DigitosController() {
		super();
	}

	public int quantidadeDigitos(int number) {
		//Condição de parada
		if(number < 1){
			return 0;
		} else {
			return 1 + quantidadeDigitos(number/10);	//Chamada da próxima função
		}
	}
}
