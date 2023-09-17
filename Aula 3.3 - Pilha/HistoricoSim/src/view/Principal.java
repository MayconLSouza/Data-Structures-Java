package view;

import javax.swing.JOptionPane;

import br.edu.fateczl.pilhastring.PilhaString; 
import controller.HistoricoController; 

public class Principal {

    public static void main(String[] args) {

        // Cria uma instancia de PilhaString para representar o historico
        PilhaString historico = new PilhaString();

        // Cria uma instancia de HistoricoController para manipular as operacoes do historico
        HistoricoController methods = new HistoricoController();

        // Define o menu de opcoes 
        String MenuTexto = """
                           Escolha uma das opcoes a seguir:
                            1 - Inserir novo endereco
                            2 - Remover ultimo endereco
                            3 - Ultimo endereco acessado
                            9 - Encerrar historico
                           """;

        int entrada = 0; // Variavel para armazenar a entrada do usuario

        while (entrada != 9) { // Loop principal do programa

            // Exibe o menu e obtem a escolha do usuario
            entrada = Integer.parseInt(JOptionPane.showInputDialog(MenuTexto));

            // Executa a operacao selecionada com base na escolha do usuario
            switch (entrada) {
                case 1:
                    methods.novoEndereco(historico); // Chama o metodo para inserir um novo endereço
                    break;
                case 2:
                    methods.removerEndereco(historico); // Chama o metodo para remover o ultimo endereco
                    break;
                case 3:
                    methods.ultimoEndereco(historico); // Chama o metodo para consultar o ultimo endereco
                    break;
                case 9:
                    System.exit(0); // Encerra o programa
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "OPCAO INVALIDA!!!"); // Exibe mensagem de erro para opcoes invalidas
            }

        }

    }
}

