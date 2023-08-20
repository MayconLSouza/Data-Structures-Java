package controller;

public class Methods {

	public Methods() {
		super();
	}
	
	public double soma(int number) {
		//Condição de parada
		if(number == 1) {
			return 1.0;
		} else {
			return soma(number-1)+ 1.0/fatorial(number);	//Chamada da próxima função
		}
	}
	
	public int fatorial(int divisor) {
		//Condição de parada
		if(divisor == 1) {
			return 1;
		} else {
			return divisor * fatorial(divisor-1);	//Chamada da próxima função
		}
	}
}
