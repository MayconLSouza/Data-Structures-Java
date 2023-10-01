package controller;

import br.edu.fateczl.fila.Fila; // Importa a classe Fila generica
import model.Processo; // Importa a classe Processo do modelo

public class EscalonadorController {
    private Processo processo; // Variavel para armazenar o processo atualmente em execucao

    public EscalonadorController() {
        super();
    }

    // Metodo de escalonamento de processos
    public void escalonador(Fila<Processo> fila) {
        while (!fila.isEmpty()) {
            try {
                processo = fila.remove(); // Seleciona o proximo processo da fila de pronto
                if (processo.qtdRetornos > 1) {
                    System.out.println(processo.nome + " está sendo executado.\n");
                    processo.qtdRetornos -= 1; // Decrementa a quantidade de retornos
                    fila.insert(processo); // Reinsere o processo na fila de pronto
                } else {
                    System.out.println(processo.nome + " foi finalizado.\n");
                }
            } catch (Exception e) {
                String msgErro = e.getMessage();
                System.err.println(msgErro);
            }
        }

        System.out.println("Todos os processos foram finalizados.");
    }
}

