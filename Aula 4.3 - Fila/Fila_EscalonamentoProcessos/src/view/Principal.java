/*
 * Considerando a biblioteca biblioteca Fila Generica, ja criada, faca:
 * Criar um projeto Java (EscalonamentoProcessos) e importe a biblioteca FilaObject. Esse novo projeto ira receber Objectos com dados de 
 * processos com o formato do objecto abaixo e simular o escalonamento de processos RoundRobin.
 * A classe EscalonadorController no package controller deve ter 1 metodo:
 *	• O metodo escalonador que recebe uma Fila de processos, como parametros, verifica se o numero que vezes e maior que 1, 
 *  decrementa esse valor no objeto e, se for maior que 1, insere o objeto novamente na fila;
 * A classe Principal, no package view, no seu metodo Main, deve inicializar uma fila Com processos, como no exemplo abaixo 
 * Objeto:
 * Nome : String
 * QtdRetornos : Int
 * Exemplo de entrada: {"notepad.exe;14","write.exe;35","chrome.exe;27","acrobat.exe;52","firefox.exe;18","word.exe;25"}. 
 */
package view;

import br.edu.fateczl.fila.Fila; // Importa a classe Fila generica
import controller.EscalonadorController; // Importa a classe EscalonadorController
import model.Processo; // Importa a classe Processo do modelo

public class Principal {

    public static void main(String[] args) {

        // Cria uma fila para armazenar objetos do tipo Processo
        Fila<Processo> fila = new Fila<>();

        // Cria uma instancia da classe EscalonadorController
        EscalonadorController esc = new EscalonadorController();

        // Arrays com nomes de processos e quantidades de retornos
        String[] nome = {"notepad.exe", "write.exe", "chrome.exe", "acrobat.exe", "firefox.exe", "word.exe"};
        int[] retorno = {14, 35, 27, 52, 18, 25};

        // Preenche a fila com processos
        for (int i = 0; i < 6; i++) {
            Processo proc = new Processo();
            proc.nome = nome[i];
            proc.qtdRetornos = retorno[i];
            fila.insert(proc);
        }

        // Chama o metodo escalonador da classe EscalonadorController
        esc.escalonador(fila);
    }

}

