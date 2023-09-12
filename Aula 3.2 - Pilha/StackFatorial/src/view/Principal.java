package view;

import javax.swing.JOptionPane;

import controller.FatController;

public class Principal {

	public static void main(String[] args) {
		
		int number;
		long result;
		FatController methods = new FatController();
		
		number = Integer.parseInt(JOptionPane.showInputDialog("Digite um número entre 0 e 10."));
		
		while (number < 0 || number > 10) {
			JOptionPane.showMessageDialog(null, "Número inválido !!!");
			number = Integer.parseInt(JOptionPane.showInputDialog("Digite um número entre 0 e 10."));
		}
		
		result = methods.calcFatorial(number);
		
		System.out.println("Resultado do fatorial de " + number + " = " + result);
		System.out.println(number + "! = " + result);
		
	}

}
