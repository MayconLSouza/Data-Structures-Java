package view;

import controller.ParImparController;

public class Principal {

	public static void main(String[] args) throws Exception {

		int[] vetor = new int[100];
		
		for(int i = 0; i < 100; i++) {
			vetor[i] = (int) (Math.random()*101);
		}
		
		ParImparController methods = new ParImparController();
		
		methods.op(vetor);
		
	}

}
