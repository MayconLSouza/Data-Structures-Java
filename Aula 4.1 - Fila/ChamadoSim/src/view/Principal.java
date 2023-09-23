package view;

import javax.swing.JOptionPane;

import br.edu.fateczl.fila.Fila;
import controller.Cliente;
import controller.FilaController;

public class Principal {

	public static void main(String[] args) {

		FilaController methods = new FilaController();	
		Fila<Cliente> filaPreferencial = new Fila<>();
		Fila<Cliente> fila = new Fila<>();
		String MenuTexto = """
						Escolha uma das opcoes a seguir:
						1 - Pegar senha fila
						2 - Pegar senha preferencial
						3 - Chamar próxima senha
						9 - Encerrar
						""";
		int entrada = 0;

		while(entrada != 9)	{
			
			entrada = Integer.parseInt(JOptionPane.showInputDialog(MenuTexto));

			switch(entrada){

				case 1:
					methods.senhaFila(fila);
					break;
				case 2:
					methods.senhaPreferencial(filaPreferencial);
					break;
				case 3:
					methods.proximaSenha(fila, filaPreferencial);
					break;
				case 9:
					JOptionPane.showMessageDialog(null,"Sistema de senhas encerrado");
					System.exit(0);
					break;
				default:
					JOptionPane.showMessageDialog(null,"OPÇÃO INVÁLIDA!!! Escolha novamente uma opção");

			}
		
		}
	}
}				
