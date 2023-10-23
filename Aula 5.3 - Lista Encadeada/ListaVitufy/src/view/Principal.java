package view;

import javax.swing.JOptionPane;

import br.edu.fatec.zl.Lista.Lista;
import controller.PlayerController;
import model.Musica;

public class Principal {

	public static void main(String[] args) throws Exception {
		
		Lista<Musica> lista = new Lista<>();
		PlayerController walkman = new PlayerController();
		int opcao = 0;
		String menu = """
						Vamos curtir um som juntos?
						1 - Adiconar musica
						2 - Remover musica
						3 - Solta o som DJ
						9 - Fim
					  """;
		String nome;
		String artista;
		String duracao;
		String musica;
		int posicao;
		
		while(opcao != 9) {
			opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));
			switch(opcao) {
			case 1:
				nome = JOptionPane.showInputDialog("O que voce quer ouvir?");
				artista = JOptionPane.showInputDialog("E quem canta esse som brabo?");
				duracao = JOptionPane.showInputDialog("Quanto tempo dura essa composicao?");
				musica = nome + ";" + artista + ";" + duracao;
				walkman.adicionaMusica(lista, musica);
				break;
			case 2:
				posicao = Integer.parseInt(JOptionPane.showInputDialog("Qual musica que nao combinou com voce?"));
				walkman.removeMusica(lista, posicao);
				break;
			case 3:
				System.out.println("Som na caixa e aproveite\n");
				walkman.executaPlaylist(lista);
				break;
			case 9:
				System.exit(0);
				break;
			default:
				System.out.println("Opcao invalida meu parceiro(a), poderia digitar novamente");
			}
		}
	}

}
