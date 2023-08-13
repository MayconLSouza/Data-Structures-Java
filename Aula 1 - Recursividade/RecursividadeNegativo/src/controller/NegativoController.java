package controller;

public class NegativoController {

	public NegativoController() {
		super();
	}

	public int negativo(int[] vetor,int tamanho,int elementos) {
		//Condição de parada
		if (tamanho == 0) {
			return elementos;
		} else {	
			if (vetor[tamanho-1] < 0) {
				elementos++;
			}
			return negativo(vetor, tamanho-1, elementos);		//Chamada da próxima função
		}
	}
} 
