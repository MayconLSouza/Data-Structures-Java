package controller;

public class Methods {

	public Methods() {
		super();	
	}

	public String palavraInvertida(String palavra) {
		//Condição de parada
		if(palavra.length() <= 1) {
			return palavra;
		} else {
			char ultimoCaracter = palavra.charAt(palavra.length()-1);
			palavra = palavra.substring(0, palavra.length() - 1);
			return ultimoCaracter + palavraInvertida(palavra);	//Chamada da próxima função
		}
	}
}
