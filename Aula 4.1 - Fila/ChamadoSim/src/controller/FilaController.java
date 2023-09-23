package controller;

import java.util.concurrent.atomic.AtomicInteger;
import javax.swing.JOptionPane;
//import controller.Cliente;
import br.edu.fateczl.fila.Fila;

public class FilaController {

	private static AtomicInteger senha = new AtomicInteger(0);
	private static AtomicInteger senhaPreferencial = new AtomicInteger(0);
	private int preferencial = 0;
	private Cliente proximo;

	public FilaController(){
		super();
	}

	public void senhaFila(Fila<Cliente> fila){

		Cliente cliente = new Cliente();

		cliente.nome = JOptionPane.showInputDialog("Digite o nome do cliente");
		
		cliente.senha = senha.incrementAndGet();

		fila.insert(cliente);

	}

	public void senhaPreferencial(Fila<Cliente> filaPreferencial){

		Cliente cliente = new Cliente();

		cliente.nome = JOptionPane.showInputDialog("Digite o nome do cliente");		

		cliente.senha = senhaPreferencial.incrementAndGet();

		filaPreferencial.insert(cliente);

	}

	public void proximaSenha(Fila<Cliente> fila, Fila<Cliente> filaPreferencial){

		//Caso fila preferencial esteja vazia
		if(filaPreferencial.isEmpty()){

			//Caso fila comum esteja ativa 
			if(!fila.isEmpty()){

				//Chama o proximo da fila
				try {
					proximo = fila.remove();
					System.out.println("\nSENHA CHAMADA = " + proximo.senha);
					System.out.println("NOME DO(A) CLIENTE = " + proximo.nome);
				} catch (Exception e) {
					e.printStackTrace();
				}

			//Caso fila comum tambem esteja vazia
			} else {

				JOptionPane.showMessageDialog(null, "Não há clientes na fila.");

			}
		
		//Caso fila preferencial esteja ativa
		} else {

			//Chamar 3 preferenciais
			if (preferencial < 3) {
            
				//Verifica se preferencial nao esta vazia
				if (!filaPreferencial.isEmpty()) {
                
					try {
						proximo = filaPreferencial.remove();
						System.out.println("\nATENDIMENTO PREFERENCIAL");
	                	System.out.println("SENHA CHAMADA = " + proximo.senha);
	                	System.out.println("NOME DO(A) CLIENTE = " + proximo.nome);
					} catch (Exception e) {
						e.printStackTrace();
					}

            	} else {

                	JOptionPane.showMessageDialog(null, "Não há clientes preferenciais na fila.");

            	}
				
            	preferencial++;

            //Chamar 1 fila comum
        	} else {

            	if (!fila.isEmpty()) {

                	try {
						proximo = fila.remove();
						System.out.println("\nSENHA CHAMADA = " + proximo.senha);
	                	System.out.println("NOME DO(A) CLIENTE = " + proximo.nome);
					} catch (Exception e) {
						e.printStackTrace();
					}
                	
                	preferencial = 0;

            	} else {

                	JOptionPane.showMessageDialog(null, "Não há clientes na fila.");

            	}	

        	}

		}
		
	}

}
