package view;

import br.edu.fateczl.fila.Fila;
import br.edu.fateczl.pilhaint.PilhaInt;
import controller.FilaLista1Controller;

public class Principal {

	public static void main(String[] args) {
		
		FilaLista1Controller methods = new FilaLista1Controller();
		
		//Exercicio 1
		Fila<Integer> ex1 = new Fila<>();
		ex1.insert(18);
		ex1.insert(39);
		ex1.insert(12);
		ex1.insert(73);
		ex1.insert(90);
		ex1.insert(61);
		methods.Exercicio1(ex1);
		
		//Exercicio 2a
		methods.Exercicio2A();
		
		//Exercicio 2b
		methods.Exercicio2B();
		
		//Exercicio 4
		PilhaInt pilha = new PilhaInt();
		pilha.push(75);
		pilha.push(315);
		pilha.push(481);
		pilha.push(200);
		pilha.push(557);
		pilha.push(74);
		pilha.push(245);
		pilha.push(222);
		pilha.push(269);
		pilha.push(82);
		pilha.push(469);
		pilha.push(448);
		pilha.push(584);
		pilha.push(163);
		pilha.push(186);
		pilha.push(539);
		pilha.push(389);
		methods.Exercicio4(pilha);
	}

}
