package view;

import javax.swing.JOptionPane;

import controller.LojaDepartamentoController;
import model.Departamento;

public class Principal {

	public static void main(String[] args) throws Exception {
		
		String[][] departamentos = {{"celulares e smartphones","tv e video","consoles e games","audio","telefonia fixa","informatica","acessorios e perifericos","pc gamer"},
									{"eletrodomesticos","eletroportaveis","ar e ventilacao","moveis e decoracao","casa e construcao","cama,mesa e banho"},
									{"livros","instrumentos musicais","musica","filmes e series"},	
									{"mercado","automotivo","brinquedos","bebes","gift cards","pet shop","papelaria"}};	
		String[][] descricoes = {{"artigos para telefonia movel","artigos para televisores","artigos para videogames","artigos de som","artigos para telefonia","computadores e laptops corporativos","hardwares","computadores e laptops gamers"},
					 			 {"artigos eletrodomesticos","artigos eletroportateis","ventiladores e ar condicionado","moveis","materiais para construcao","artigos de cama,mesa e banho"},
					 			 {"livraria","instrumentos musicais e acessorios","discos","dvd e blu-ray"},
					 			 {"itens de supermercado","pecas e acessorios para automoveis","itens infantis","itens para a primeira infancia","cartoes presente","comida e acessorios para pet","itens de papelaria"}};
		String menu = """
						Selecione uma das seguintes opcoes
			          ---------------------------------------------------------------
						1 - Cadastrar Departamento
						2 - Consultar Departamento
						3 - Consultar Andar
						4 - Excluir Departamento
						9 - Fim
					  """;
		String menuAndar = """
						Selecione um andar
					  ---------------------------------------------------------------
						0 - Terreo
						1 - Primeiro Andar
						2 - Segundo Andar
						3 - Terceiro Andar 
						   """;
		int opcao = 0;
		int opcaoAndar = 10;
		String andar = null;
		LojaDepartamentoController methods = new LojaDepartamentoController();
		methods.cadastrarTabela(departamentos, descricoes);
		
		while(opcao != 9) {
			opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));
			switch(opcao) {
				case 1:
					String nome = JOptionPane.showInputDialog("Digite o nome do departamento");
					String descricao = JOptionPane.showInputDialog("Digite a descricao do departamento");
					opcaoAndar = Integer.parseInt(JOptionPane.showInputDialog(menuAndar));
					while(opcaoAndar < 0 || opcaoAndar > 3) {
						JOptionPane.showMessageDialog(null, "Andar inexistente");
						opcaoAndar = Integer.parseInt(JOptionPane.showInputDialog(menuAndar));
					}
					switch(opcaoAndar) {
						case 0:
							andar = "terreo";
							break;
						case 1:
							andar = "primeiro andar";
							break;
						case 2:
							andar = "segundo andar";
							break;
						case 3:
							andar = "terceiro andar";
							break;
					}
					Departamento departamento = new Departamento(andar, nome, descricao);
					methods.cadastrarDepartamento(departamento);
					break;
				case 2:
					nome = JOptionPane.showInputDialog("Digite o nome do departamento");
					methods.consultarDepartamento(nome);
					break;
				case 3:
					opcaoAndar = Integer.parseInt(JOptionPane.showInputDialog(menuAndar));
					while(opcaoAndar < 0 || opcaoAndar > 3) {
						JOptionPane.showMessageDialog(null, "Andar inexistente");
						opcaoAndar = Integer.parseInt(JOptionPane.showInputDialog(menuAndar));
					}
					switch(opcaoAndar) {
						case 0:
							andar = "terreo";
							break;
						case 1:
							andar = "primeiro andar";
							break;
						case 2:
							andar = "segundo andar";
							break;
						case 3:
							andar = "terceiro andar";
							break;
					}
					methods.consultarAndar(andar);
					break;
				case 4:
					nome = JOptionPane.showInputDialog("Digite o nome do departamento");
					methods.excluirDepartamento(nome);
					break;
				case 9:
					System.exit(0);
					break;
				default:
					System.out.println("OPCAO INVALIDA!!!");
			}
		}
		
	}

}
