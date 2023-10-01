package controller;

import java.text.DecimalFormat; // Importa a classe DecimalFormat para formatar valor da compra para 2 casas decimais
import br.edu.fateczl.fila.Fila; // Importa a classe Fila generica
import model.Cliente; // Importa a classe Cliente do modelo

public class OperacaoController {
	
	private Cliente cliente; // Variavel para armazenar o cliente que atualmente esta sendo atendido
	private float valorCompra; // Variavel para armazenar o valor total da compra do cliente
	private String valorCompraFormatado; // Variavel para armazenar o valor total da compra do cliente formatado como moeda

	public OperacaoController() {
		super();
	}
	
	public void caixa(Fila<Cliente> fila) {
		try {
			// Chama o proximo cliente da fila para o caixa
			cliente = fila.remove();
			
			// Calcula o valor da compra do cliente (quantidade de peças * valor das peças)
			valorCompra = cliente.qtdPecas * cliente.valorPecas;
			
			// Formata o valor da compra para exibicao com 2 casas decimais
			DecimalFormat moeda = new DecimalFormat("0.00");
			valorCompraFormatado = moeda.format(valorCompra);
			
			// Exibe o nome do cliente e o valor da compra formatado
			System.out.println("\n" + cliente.nome);
			System.out.println("Valor da compra = $" + valorCompraFormatado);
			
		} catch (Exception e) {
			// Tratamento de excecao: se ocorrer algum erro, exibe uma mensagem
			String msgErro = e.getMessage();
			System.err.println(msgErro);
		}
	}
}

