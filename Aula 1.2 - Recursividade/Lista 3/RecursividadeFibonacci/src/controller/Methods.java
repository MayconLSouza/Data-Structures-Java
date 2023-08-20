package controller;

public class Methods {

	public Methods() {
		super();
	}

	public int fibonacci(int posicao) { 
		//Condição de parada
		if( (posicao == 1) || (posicao == 2) ) {
			return 1;
		} else {
			return fibonacci(posicao-1) + fibonacci(posicao-2);		//Chamada da próxima função
		}
	}
}
