package view;

import javax.swing.JOptionPane;

import controller.ModificacaoCadastroController;

public class Principal {

	public static void main(String[] args) throws Exception {

		ModificacaoCadastroController methods = new ModificacaoCadastroController();
		int idadeMin = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade minima"));
		int idadeMax = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade maxima"));
		double limiteCredito = Double.parseDouble(JOptionPane.showInputDialog("Digite o limite de credito"));
		methods.novoCadastro(idadeMin, idadeMax, limiteCredito);
		
	}

}
