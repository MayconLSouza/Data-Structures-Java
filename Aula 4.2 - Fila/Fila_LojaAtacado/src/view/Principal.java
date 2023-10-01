package view;

import br.edu.fateczl.fila.Fila; // Importacao da classe de fila generica
import controller.OperacaoController; // Importacao da classe controller
import model.Cliente; // Importacao da classe modelo para Cliente

public class Principal {

    public static void main(String[] args) {

        Fila<Cliente> fila = new Fila<>(); // Criacao de uma fila de caixa para armazenar objetos Cliente
        OperacaoController op = new OperacaoController(); // Criacao de uma instancia da classe controller

        for (int i = 0; i < 20; i++) {
            Cliente cliente = new Cliente(); // Criacao de uma instancia da classe Cliente
            cliente.nome = "Cliente" + (i + 1); // Define o nome do cliente como "Cliente" seguido de um numero
            cliente.qtdPecas = (int) (Math.random() * 31 + 20); // Gera aleatoriamente uma quantidade de peças entre 20 e 50
            cliente.valorPecas = (float) (Math.random() * 95 + 5); // Gera aleatoriamente um valor das peças entre 5.00 e 100.00
            fila.insert(cliente); // Insere o cliente na fila
            op.caixa(fila);	//Chamada do metodo caixa para atender o cliente e calcular o valor de sua compra
        }
        
    }

}

