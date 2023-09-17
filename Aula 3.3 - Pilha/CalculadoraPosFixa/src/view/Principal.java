package view;

import javax.swing.JOptionPane;

import br.edu.fateczl.pilhaint.PilhaInt;
import controller.NPRController;

public class Principal {

	public static void main(String[] args) {
		
		PilhaInt pilha = new PilhaInt();
		NPRController methods = new NPRController();
		int entrada = 0;
		String msgErro = "OPCAO INVALIDA!!!";
		String MenuTexto = """
						   Escolha uma opcao:
						    1 - Inserir valor
						    2 - Realizar uma operacao
						    9 - Encerrar calculadora
						   """;
		int valor;
		String operacao;
		
		while(entrada != 9) {
			
			entrada = Integer.parseInt(JOptionPane.showInputDialog(MenuTexto));
			
			switch (entrada) {
				case 1:
					valor = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor: "));
					methods.insereValor(pilha, valor);
					break;
				case 2:
					operacao = JOptionPane.showInputDialog("Digite uma operacao(+,-,*,/): ");
					valor = methods.npr(pilha, operacao);
					methods.insereValor(pilha, valor);
					JOptionPane.showMessageDialog(null,"Resultado da operacao = " + valor);
					break;
				case 9:
					System.exit(0);
					break;
				default:
					JOptionPane.showMessageDialog(null, msgErro);
					break;
			}
			
		}
			
	}

}
