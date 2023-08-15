package controller;

public class SomaFracaoController {

	public SomaFracaoController() {
		super();
	}

	public double soma(int divisor) {
		//Condição de parada
		if (divisor == 1) {
			return 1;
		} else {
			double serie = 1 / (double) divisor;
			return serie + soma(divisor-1);	//Chamada da próxima função
		}
	}
}