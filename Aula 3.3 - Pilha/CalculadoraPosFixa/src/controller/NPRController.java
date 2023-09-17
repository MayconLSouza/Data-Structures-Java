package controller;

import javax.swing.JOptionPane;
import br.edu.fateczl.pilhaint.PilhaInt;

public class NPRController {
	
	
	public NPRController() {
		super();
	}
	
	
	public void insereValor(PilhaInt pilha, int valor) {
		pilha.push(valor);
		exibirPilha(pilha);
	}
	
	public int npr(PilhaInt pilha, String operacao) {
		
		boolean flagOP = false;
		int resultado = 0, ultimoValor = 0, valorAntigo = 0;
		
		while(pilha.size() < 2) {
			JOptionPane.showMessageDialog(null, "OPERACAO INVALIDA!!! E NECESSARIO TER AO MENOS 2 VALORES PARA REALIZAR UMA OPERACAO");
			int valor = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor novamente: "));
			insereValor(pilha, valor);
		}
		
		flagOP = verificaOP(operacao, flagOP);
		while(!flagOP) {
			JOptionPane.showMessageDialog(null, "OPERACAO INVALIDA!!!");
			operacao = JOptionPane.showInputDialog("Digite a operação que deseja realizar(+,-,*,/) novamente: ");
			flagOP = verificaOP(operacao, flagOP);
		}
		
		try {
			ultimoValor = pilha.pop();
		} catch (Exception e) {
			String msgErro = e.getMessage();
			System.err.println(msgErro);
			System.exit(1);
		}
		try {
			valorAntigo = pilha.pop();
		} catch (Exception e) {
			String msgErro = e.getMessage();
			System.err.println(msgErro);
			System.exit(1);
		}
		
		while( (ultimoValor == 0) && (operacao.equals("/")) ) {
			JOptionPane.showMessageDialog(null, "OPERACAO INVALIDA!!! NAO E POSSIVEL DIVISAO POR 0");
			pilha.push(valorAntigo);
			pilha.push(ultimoValor);
			operacao = JOptionPane.showInputDialog("Digite a operação que deseja realizar(+,-,*,/) novamente: ");
			flagOP = verificaOP(operacao, flagOP);
			while(!flagOP) {
				JOptionPane.showMessageDialog(null, "OPERACAO INVALIDA!!!");
				operacao = JOptionPane.showInputDialog("Digite a operação que deseja realizar(+,-,*,/) novamente: ");
				flagOP = verificaOP(operacao, flagOP);
			}
		}
		
		switch (operacao) {
			case "+": 
				resultado = valorAntigo + ultimoValor;
				break;
			case "-":
				resultado = valorAntigo - ultimoValor;
				break;
			case "*":
				resultado = valorAntigo * ultimoValor;
				break;
			case "/":
				resultado = valorAntigo / ultimoValor;
				break;
		}		
				
		return resultado;
		
	}
	
	public static void exibirPilha(PilhaInt pilha) {
		
		PilhaInt pilhaExibir = new PilhaInt();
		
		while(!pilha.isEmpty()) {
			try {
				pilhaExibir.push(pilha.pop());
			} catch (Exception e) {
				String msgErro = e.getMessage();
				System.err.println(msgErro);
				System.exit(1);
			}
		}
		
		System.out.println("\n");
		
		while(!pilhaExibir.isEmpty()) {
			try {
				int elemento = pilhaExibir.pop();
				System.out.println(elemento);
				pilha.push(elemento);
			} catch (Exception e) {
				String msgErro = e.getMessage();
				System.err.println(msgErro);
				System.exit(1);
			}
		}

	}
	
	
	public boolean verificaOP(String operacao, boolean flagOP) {
		
		String[] vetorOP = {"+","-","*","/"};
		
		for (int i = 0; i < vetorOP.length; i++) {
			if(operacao.equals(vetorOP[i])) {
				return true;
			}
		}
		
		return false;
		
	}
	
}
