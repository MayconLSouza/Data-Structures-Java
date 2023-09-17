package controller;

import javax.swing.JOptionPane;

import br.edu.fateczl.pilhastring.PilhaString;

public class HistoricoController {

    public HistoricoController() {
        super();
    }

    // Metodo para adicionar um novo endercço ao historico
    public void novoEndereco(PilhaString historico) {

        String endereco = JOptionPane.showInputDialog("Digite o novo endereco: ");

        // Valida endereco
        if (endereco.startsWith("http://") && endereco.contains("www.")) {
            historico.push(endereco); // Adiciona o endereco a pilha
            JOptionPane.showMessageDialog(null, "ENDERECO ADICIONADO AO HISTORICO COM SUCESSO");
        } else {
            JOptionPane.showMessageDialog(null, "ENDERECO INVALIDO!!! NAO FOI POSSIVEL INSERIR NOVO ENDERECO NO HISTORICO");
        }
    }

    // Metodo para remover o ultimo endereco do historico
    public void removerEndereco(PilhaString historico) {  

    	// Verifica se pilha esta vazia
        if (historico.isEmpty()) {
            JOptionPane.showMessageDialog(null, "ERRO!!! NAO FOI POSSIVEL REMOVER ENDERECO NO HISTORICO POIS ELE ESTA VAZIO");
        } else {
            try {
                historico.pop(); // Remove o ultimo endereco da pilha
            } catch (Exception e) {
                String msgErro = e.getMessage();
                System.err.println(msgErro);
                System.exit(1);
            }
            JOptionPane.showMessageDialog(null, "ENDERECO REMOVIDO DO HISTORICO COM SUCESSO");
        }
    }

    // Metodo para consultar e exibir o ultimo endereco do historico
    public void ultimoEndereco(PilhaString historico) {
        
    	// Verifica se pilha esta vazia
        if (historico.isEmpty()) {
            JOptionPane.showMessageDialog(null, "ERRO!!! NAO FOI POSSIVEL CONSULTAR ULTIMO ENDERECO DO HISTORICO POIS ELE ESTA VAZIO");
        } else {
            try {
                String dominio = historico.top(); // Obtem o ultimo endereco da pilha
                JOptionPane.showMessageDialog(null, "Ultimo dominio acessado = " + dominio);
            } catch (Exception e) {
                String msgErro = e.getMessage();
                System.err.println(msgErro);
                System.exit(1);
            }
        }
    }
}

