package controller;

import br.edu.fatec.zl.Lista.Lista;
import model.Chocolate;

@SuppressWarnings("unchecked")
public class ControllerChocolate {
	
	Lista<Chocolate>[] despensa;

	public ControllerChocolate() {
		despensa = new Lista[5];
		int tamanho = despensa.length;
		for(int i = 0; i < tamanho; i++) {
			despensa[i] = new Lista<>();
		}
	}
	
	public void adicionaChocolate(Chocolate chocolate) throws Exception {
		boolean flagChocolate = false;
		chocolate.volume = chocolate.altura * chocolate.largura * chocolate.comprimento;
		flagChocolate = defineChocolate(chocolate, flagChocolate);
		if(!flagChocolate) {
			System.out.println("Com as medidas informadas nao foi possivel definir o chocolate");
		} else {
			int hash = chocolate.hash(chocolate.volume);
			if(despensa[hash].isEmpty()) {
				despensa[hash].addFirst(chocolate);
			} else {
				despensa[hash].addLast(chocolate);
			}
			System.out.println("Chocolate foi adicionado com sucesso");
		}
	}
	
	private boolean defineChocolate(Chocolate chocolate, boolean flagChocolate) {
		if(chocolate.volume >= 50 && chocolate.volume <= 60) {
			chocolate.peso = 60;
			chocolate.receita = "Bombom";
			return true;
		} else if (chocolate.volume >= 100 && chocolate.volume <= 110) {
			chocolate.peso = 115;
			chocolate.receita = "Pave";
			return true;
		} else if (chocolate.volume >= 150 && chocolate.volume <= 165) {
			chocolate.peso = 160;
			chocolate.receita = "Brigadeiro";
			return true;
		} else if (chocolate.volume >= 200 && chocolate.volume <= 220) {
			chocolate.peso = 215;
			chocolate.receita = "Bolo";
			return true;
		} else if (chocolate.volume >= 260 && chocolate.volume <= 280) {
			chocolate.peso = 280;
			chocolate.receita = "Ovo de pascoa";
			return true;
		} else {
			return false;
		}
	}
	
	public void procurarChocolate(Chocolate chocolateProcurado) throws Exception {
		if(chocolateProcurado.receita.equals("Bombom")) {
			if(despensa[0].isEmpty()) {
				System.out.println("Nao possui nenhum chocolate para fazer bombom neste momento");
			} else {
				int tamanho = despensa[0].size();
				for(int i = 0; i < tamanho; i++) {
					Chocolate chocolate = despensa[0].get(i);
					System.out.println(chocolate.toString());
				}
			}
		} else if (chocolateProcurado.receita.equals("Pave")) {
			if(despensa[1].isEmpty()) {
				System.out.println("Nao possui nenhum chocolate para fazer pave neste momento");
			} else {
				int tamanho = despensa[1].size();
				for(int i = 0; i < tamanho; i++) {
					Chocolate chocolate = despensa[1].get(i);
					System.out.println(chocolate.toString());
				}
			}
		} else if(chocolateProcurado.receita.equals("Brigadeiro")) {
			if(despensa[2].isEmpty()) {
				System.out.println("Nao possui nenhum chocolate para fazer brigadeiro neste momento");
			} else {
				int tamanho = despensa[2].size();
				for(int i = 0; i < tamanho; i++) {
					Chocolate chocolate = despensa[2].get(i);
					System.out.println(chocolate.toString());
				}
			}
		} else if(chocolateProcurado.receita.equals("Bolo")) {
			if(despensa[3].isEmpty()) {
				System.out.println("Nao possui nenhum chocolate para fazer bolo neste momento");
			} else {
				int tamanho = despensa[3].size();
				for(int i = 0; i < tamanho; i++) {
					Chocolate chocolate = despensa[3].get(i);
					System.out.println(chocolate.toString());
				}
			}
		} else if(chocolateProcurado.receita.equals("Ovo de pascoa")) {
			if(despensa[4].isEmpty()) {
				System.out.println("Nao possui nenhum chocolate para fazer ovo de pascoa neste momento");
			} else {
				int tamanho = despensa[4].size();
				for(int i = 0; i < tamanho; i++) {
					Chocolate chocolate = despensa[4].get(i);
					System.out.println(chocolate.toString());
				}
			}
		}
	}
	
	public void usarChocolate(Chocolate chocolateProcurado) throws Exception {
		if(chocolateProcurado.receita.equals("Bombom")) {
			if(despensa[0].isEmpty()) {
				System.out.println("Nao possui nenhum chocolate para fazer bombom neste momento");
			} else {
				despensa[0].removeFirst();
				System.out.println("Chocolate para fazer bombom foi removido");
			}
		} else if (chocolateProcurado.receita.equals("Pave")) {
			if(despensa[1].isEmpty()) {
				System.out.println("Nao possui nenhum chocolate para fazer pave neste momento");
			} else {
				despensa[1].removeFirst();
				System.out.println("Chocolate para fazer pave foi removido");
			}
		} else if(chocolateProcurado.receita.equals("Brigadeiro")) {
			if(despensa[2].isEmpty()) {
				System.out.println("Nao possui nenhum chocolate para fazer brigadeiro neste momento");
			} else {
				despensa[2].removeFirst();
				System.out.println("Chocolate para fazer brigadeiro foi removido");
			}
		} else if(chocolateProcurado.receita.equals("Bolo")) {
			if(despensa[3].isEmpty()) {
				System.out.println("Nao possui nenhum chocolate para fazer bolo neste momento");
			} else {
				despensa[3].removeFirst();
				System.out.println("Chocolate para fazer bolo foi removido");
			}
		} else if(chocolateProcurado.receita.equals("Ovo de pascoa")) {
			if(despensa[3].isEmpty()) {
				System.out.println("Nao possui nenhum chocolate para fazer ovo de pascoa neste momento");
			} else {
				despensa[3].removeFirst();
				System.out.println("Chocolate para fazer ovo de pascoa foi removido");
			}
		}
	}

}
