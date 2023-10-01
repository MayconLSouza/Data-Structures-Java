package controller;

import javax.swing.JOptionPane;

import br.edu.fateczl.fila.Fila;

public class TelefoneController {
	
	public TelefoneController() {
		super();
	}
	
	public void insereLigacao(Fila<String> ligacao, String numeroTelefone) {
		ligacao.insert(numeroTelefone);
	}
	
	public void consultaLigacao(Fila<String> ligacao) {
		
		//Verifica se possui alguma ligacao no historico de chamadas
		if(ligacao.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Não há nenhuma ligação no momento.");
		} else {
			try {
				//Mostra todas as ligacoes realizadas
				while(!ligacao.isEmpty()) {
					System.out.println(ligacao.remove() + " realizou uma ligacao.\n");
				}
			} catch(Exception e) {
				String msgErro = e.getMessage();
				System.err.println(msgErro);
			}
		}
	}
	

}
