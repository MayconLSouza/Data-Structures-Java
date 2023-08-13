package controller;

public class SomaController {

	public SomaController() {
		super();
	}
	
	public int soma(int numero) {
		//Condição de parada
		if (numero <= 0) {
			return 0;
		} else {
			return numero + soma(numero-1); //Chamada da próxima função			
		}
	}
}
