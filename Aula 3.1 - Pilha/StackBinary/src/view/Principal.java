package view;

import controller.ConverteController;

public class Principal {

	public static void main(String[] args) {
		
		ConverteController convert = new ConverteController();
		
		int decimal = 1001;

		if (decimal < 0 || decimal > 1000) {
			System.out.println("Nao foi possivel realizar a conversao");
			System.exit(0);		
		}

		String binario = convert.decToBin(decimal);
		System.out.println("Decimal = " + decimal + "\nBinario = " + binario);
	}
}
