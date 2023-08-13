package view;

import controller.VetorController;

public class Principal {

	public static void main(String[] args) {
		int [] vetor = {4, 8, 9, 1, 3};
		int tamanho = vetor.length;
		
		VetorController vc = new VetorController();
		System.out.println(vc.somaVetor(vetor, tamanho));	//sysout
	}

}
