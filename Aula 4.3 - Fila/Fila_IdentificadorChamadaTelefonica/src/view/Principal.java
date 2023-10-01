/* Criar um projeto Java que implementa com a biblioteca Fila Generica para simular um identificador de chamadas telefonicas 
 * enquanto o aparelho esta fora da rede ou desligado. A aplicacao deve ter uma classe no package controller, 
 * TelefoneController que tem os seguintes metodos:
 * - insereLigacao(Fila f, String numeroTelefone): void, que insere numeros de telefone em uma fila iniciada
 * - consultaLigacoes(Fila f):void, que desenfilera cada ligacao realizada e exibe no console. Exibir uma excecao caso nao haja ligacao
 * Deve ter tambem uma classe Principal no package view com operacoes usando JOptionPane que permita ao usuario inserir numeros e 
 * consultar as chamadas perdidas. A aplicacao deve rodar ate uma opcao de saida ser selecionada pelo usuario.
*/
package view;

import javax.swing.JOptionPane;

import br.edu.fateczl.fila.Fila;
import controller.TelefoneController;

public class Principal {

	public static void main(String[] args) {
		
		String menuTexto = """
							O que deseja fazer?
							1 - Realizar ligação
							2 - Consultar todas as ligações
							9 - Encerrar
						   """;
		int opcao = 0;
		String numeroTelefone;
		TelefoneController telefone = new TelefoneController();
		Fila<String> ligacao = new Fila<>();
		
		while(opcao != 9) {
			
			opcao = Integer.parseInt(JOptionPane.showInputDialog(menuTexto));
			
			switch(opcao) {
				case 1:
					numeroTelefone = JOptionPane.showInputDialog("Insira o número de telefone que está realizando esta chamada.");
					telefone.insereLigacao(ligacao, numeroTelefone);
					break;
				case 2:
					telefone.consultaLigacao(ligacao);
					break;
				case 9:
					System.exit(0);
					break;
				default:
					JOptionPane.showMessageDialog(null, "OPÇÃO INVÁLIDA!!! Tente novamente.");
			}
			
		}

	}

}
