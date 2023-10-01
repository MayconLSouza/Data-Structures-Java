package controller;

import javax.swing.JOptionPane;

import br.edu.fateczl.fila.Fila;

public class ImpressoraController {
	
	private long tempoImpressao;

	public ImpressoraController() {
		super();
	}
	
	public void insereDocumento(Fila<String> impressao, String documento) {
		impressao.insert(documento);
	}
	
	public void imprime(Fila<String> impressao) {
		if(!impressao.isEmpty()) {
			try {
				while(!impressao.isEmpty()) {
					String[] documento = (impressao.remove()).split("-");
					System.out.println("#PC " + documento[0]);
					System.out.println("Arquivo = " + documento[1]);
					tempoImpressao = (long) (Math.random() * 1000 + 1000);
					Thread.sleep(tempoImpressao);
					System.out.println("Impressao concluida.\n");
				}
				System.out.println("Todos os documentos foram impressos.");
			} catch (Exception e) {
				String msgErro = e.getMessage();
				System.err.println(msgErro);
			}
		} else {
			JOptionPane.showMessageDialog(null, "Não há arquivos para imprimir no momento.");
		}
		
	}

}
