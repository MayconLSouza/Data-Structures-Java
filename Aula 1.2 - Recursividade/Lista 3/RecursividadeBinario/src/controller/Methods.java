package controller;

public class Methods {

	public Methods() {
		super();
	}

	public String binario(int decimal) {
		//Condição de parada
		if(decimal == 1){
			return String.valueOf(1);
		} else {
			return binario(decimal/2) + String.valueOf(decimal % 2);	//Chamada da próxima função
		}
	}
}
