//3. Construir uma função recursiva que receba um vetor e seu tamanho e apresente a quan�dade de números pares existentes no vetor. Considere que a entrada deve ser, 
// apenas de números naturais diferentes de zero.

package view;

import controller.ParController;

public class Principal {

	public static void main(String[] args) {
		int [] vetor = {6, 9, 8, 1, 2, 10, 5};
		int tamanho = vetor.length;

		ParController pc = new ParController();
		System.out.println(pc.par(vetor, tamanho));		//sysout
	}

}
