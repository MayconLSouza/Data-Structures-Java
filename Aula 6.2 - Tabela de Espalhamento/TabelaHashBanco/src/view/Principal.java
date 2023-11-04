package view;

import javax.swing.JOptionPane;

import controller.BancoController;

public class Principal {

	public static void main(String[] args) throws Exception {
		
		String menu = """
						Selecione uma das opcoes a seguir:
						1 - Inserir Conta
						2 - Consultar Conta
						3 - Excluir Conta
						9 - Fim
					  """;
		int opcao = 0;
		String nome;
		double saldoConta;
		int numeroConta;
		BancoController methods = new BancoController();
		
		//Gerar Contas
		for(numeroConta = 0; numeroConta < 10000; numeroConta++) {
			nome = "cliente" + numeroConta;
			saldoConta = Math.random()*10001;
			saldoConta = Double.parseDouble(String.format("%.2f", saldoConta).replace(",", "."));
			methods.inserirConta(numeroConta, nome, saldoConta);
		}
		
		while(opcao != 9) {
			opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));
			switch(opcao) {
				case 1:
					numeroConta = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero da conta de ate 4 digitos"));
					nome = JOptionPane.showInputDialog("Digite o nome do cliente");
					saldoConta = Double.parseDouble(JOptionPane.showInputDialog("Digite o saldo da conta"));
					methods.inserirConta(numeroConta, nome, saldoConta);
					System.out.println("Conta #" + numeroConta + " foi inserida");
					break;
				case 2:
					numeroConta = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero da conta de ate 4 digitos"));
					methods.consultarConta(numeroConta);
					break;
				case 3:
					numeroConta = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero da conta de ate 4 digitos"));
					methods.excluirConta(numeroConta);
					break;
				case 9:
					System.exit(0);
					break;
				default:
					JOptionPane.showMessageDialog(null, "OPCAO INVALIDA!!!");
					break;
			}
		}
	}

}
