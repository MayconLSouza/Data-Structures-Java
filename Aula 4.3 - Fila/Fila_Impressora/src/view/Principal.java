/*
 * Criar um projeto Java que implementa com a biblioteca Fila Generica para simular um ambiente corporativo, comum, como agencias bancarias 
 * que tem diversos computadores e 1 impressora central. Nesses casos, a impressora tem uma fila de impressees para que cada documento enviado 
 * comece e termine a impressao sem que documentos se misturem. A aplicacao deve ter uma classe no package controller, 
 * ImpressoraController que tem os seguintes metodos:
 * 	- insereDocumento(Fila f, String documento): void, o documento no formato ID_PC;Nome_Arquivo (Já validado antes do envio) 
 *    devera enfileirar os documentos enviados
 * 	- imprime(Fila f):void, que desenfilera um documento da fila, por vez, exibe no console [#PC: ID_PC – Arquivo: Nome_Arquivo]. 
 *    Cada impressao dura de 1 a 2 segundos usar Math.random() ou a classe Random e um Thread.sleep*(tempo) para simular o tempo de impressao.
 *    Exibir uma excecao caso nao haja documento na fila de impressao.
 * Deve ter tambem uma classe Principal no package view com operacoes usando JOptionPane que permita ao usuario inserir e validar os documentos de entrada 
 * e iniciar um procedimento de impressao. A aplicacao deve rodar ate uma opcao de saida ser selecionada pelo usuario
 * Como a classe de ImpressoraController nao e uma Thread, para forcar um sleep, deve-se usar uma chamada estatica da classe Thread (Thread.sleep(tempo))
 */
package view;

import javax.swing.JOptionPane;
import br.edu.fateczl.fila.Fila;
import controller.ImpressoraController;

public class Principal {

	public static void main(String[] args) {
		
		String menuTexto = """
							O que deseja fazer?
							1 - Inserir documentos para impressão
							2 - Imprimir todos documentos
							9 - Encerrar
						   """;
		int opcao = 0;
		String documento;
		int idPC;
		String nomeArquivo;
		ImpressoraController impressora = new ImpressoraController();
		Fila<String> impressao = new Fila<>();
		
		while(opcao != 9) {
			
			opcao = Integer.parseInt(JOptionPane.showInputDialog(menuTexto));
			
			switch(opcao) {
				case 1:
					idPC = (int) (Math.random() * 1001);
					nomeArquivo = JOptionPane.showInputDialog("Insira o nome do arquivo que deseja imprimir.");
					documento = idPC + "-" + nomeArquivo;
					impressora.insereDocumento(impressao, documento);
					break;
				case 2:
					impressora.imprime(impressao);
					break;
				case 9:
					System.exit(0);
					break;
				default:
					JOptionPane.showMessageDialog(null,"OPÇÃO INVÁLIDA!!! Tente novamente.");
			}
		}

	}

}
