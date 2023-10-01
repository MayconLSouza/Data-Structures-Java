/*
 * No parque de diversoes, forma-se uma fila de criancas para ir ao brinquedo denominado Boomerang. Para entrar no brinquedo, 
 * a crianca deve ter mais de 1.60m e mais de 16 anos. Criar uma aplicacao Java, baseada na biblioteca Fila Generica, que faca:
 *	1) Criar um objeto model com os atributos:
 *	2) Criar uma classe view (Principal.java) que, na main:
 *			a. Inicialize uma nova fila
 *			b. Insira 30 clientes com suas caracteristicas, sendo:
 *				i. Nome (Pessoa1, Pessoa2, Pessoa3, ...)
 *				ii. Idade (Numero entre 10 e 40)
 *				iii. Altura (Numero entre 1.35 e 2.00)
 *	3) Criar uma classe controller chamada ParqueController, que tenha um metodo brinquedo(Fila fila): void, que receba a fila populada, 
 *     como parametro, e faca, para cada Cliente:
 *			a. Verificar se a pessoa esta em condicoes de ir ao brinquedo
 *			b. Exibir o nome do cliente, se passou para dentro do brinquedo ou nao e a razao
 *	4) O metodo main da classe Principal.java deve chamar o metodo brinquedo(Fila fila): void.
 * O metodo brinquedo(Fila fila): void deve estar baseado nas operacoes da fila (insert(), remove(), list(), size(), isEmpty())
 */
package view;

import java.util.Random;

import br.edu.fateczl.fila.Fila;
import controller.ParqueController;
import model.Pessoa;

public class Principal {

	public static void main(String[] args) {
		
		Fila<Pessoa> fila = new Fila<>();
		Random random = new Random();
		ParqueController parque = new ParqueController();
		
		for(int i = 0 ; i < 30 ; i++ ) {
			Pessoa pessoa = new Pessoa();
			pessoa.nome = "Pessoa" + (i+1);
			pessoa.idade = random.nextInt(31) + 10;
			pessoa.altura = (float) (Math.random() * 0.65 + 1.35);
			fila.insert(pessoa);
		}
		
		parque.brinquedo(fila);
		
	}

}
