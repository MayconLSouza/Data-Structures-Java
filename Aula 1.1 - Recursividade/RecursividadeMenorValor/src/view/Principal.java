package view;

import controller.MenorController;

public class Principal {

	public static void main(String[] args) {
		int [] vetor = {1, 2, 4, 5, 8, 9};
		int tamanho = vetor.length;
		int menor = vetor[tamanho-1];
		
		MenorController pc = new MenorController();
		System.out.println(pc.menor(vetor, tamanho, menor));	//sysout
	}

}
