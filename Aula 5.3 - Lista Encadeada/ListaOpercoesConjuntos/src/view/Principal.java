package view;

import br.edu.fatec.zl.Lista.Lista;
import controller.OperacoesConjuntos;

public class Principal {

	public static void main(String[] args) throws Exception {
		
		Lista<Integer> listaA = new Lista<>();
		Lista<Integer> listaB = new Lista<>();
		OperacoesConjuntos op = new OperacoesConjuntos();
		int[] vetorA = {3, 5, 8, 12, 9, 7, 16};
		int[] vetorB = {9, 6, 2, 3, 7};
		int tamanhoA = vetorA.length;
		int tamanhoB = vetorB.length;

		//Iniciar Lista A
		for(int i = 0; i < tamanhoA; i++) {
			listaA.add(vetorA[i], i);
		}
		
		//Iniciar Lista B
		for(int i = 0; i < tamanhoB; i++) {
			listaB.add(vetorB[i], i);
		}
		
		//Conjunto Interseccao
		op.interseccao(listaA, listaB);

		//Conjunto Uniao
		op.uniao(listaA, listaB);

	}
}