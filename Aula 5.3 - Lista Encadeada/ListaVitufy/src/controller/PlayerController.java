package controller;

import br.edu.fatec.zl.Lista.Lista;
import model.Musica;

public class PlayerController {

	public PlayerController() {
		super();
	}
	
	public void adicionaMusica(Lista<Musica> lista, String infoMusica) throws Exception {
		String[] dados = infoMusica.split(";");
		Musica musica = new Musica();
		musica.nome = dados[0];
		musica.nomeArtista = dados[1];
		musica.duracao = Integer.parseInt(dados[2]);
		if(lista.isEmpty()) {
			lista.addFirst(musica);
		} else {
			lista.addLast(musica);
		}
	}
	
	public void removeMusica(Lista<Musica> lista, int posicao) throws Exception {
		if(lista.isEmpty()) {
			System.out.println("Playlist vazia");
		} else {
			lista.remove(posicao);
		}
	}
	
	public void executaPlaylist(Lista<Musica> lista) throws Exception {
		if(lista.isEmpty()) {
			System.out.println("Playlist vazia");
		} else {
			int tamanho = lista.size();
			for (int i = 0; i < tamanho; i++) {
				Musica musica = new Musica();
				musica = lista.get(i);
				System.out.println("Tocando agora: " + musica.nome);
				System.out.println("Artista: " + musica.nomeArtista);
				System.out.println("Duracao: " + musica.duracao + " min");
				Thread.sleep(musica.duracao * 100);
				System.out.println("Fim da musica. Pausa para respirar\n");
			}
			System.out.println("Ah, que pena! Sua playlist acabou, Ate a proxima!!!\n");
		}
	}

}
