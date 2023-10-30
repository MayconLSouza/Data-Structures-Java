package view;

import controller.PredioController;

public class Principal {

	public static void main(String[] args) throws Exception {
		
		PredioController methods = new PredioController();
		
		for(int i = 1; i <= 10; i++) {
			int apartamento = i + (i * 100); 
			String nome = "morador" + i;
			String modeloCarro = "carro" + i;
			String corCarro = "cor" + i;
			String placaCarro = "abc" + i * 1000;
			methods.cadastrarMorador(apartamento, nome, modeloCarro, corCarro, placaCarro);
		}
		
		methods.consultarMorador(202);
		methods.excluirMorador(808);
		methods.consultarMorador(808);
		int apartamento =  510; 
		String nome = "morador" + 510;
		String modeloCarro = "carro" + 510;
		String corCarro = "cor" + 510;
		String placaCarro = "abc" + 5100;
		methods.cadastrarMorador(apartamento, nome, modeloCarro, corCarro, placaCarro);
		methods.consultarAndar(4);
		
		
	}

}
