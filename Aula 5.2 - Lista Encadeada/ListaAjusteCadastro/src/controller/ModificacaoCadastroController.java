package controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import br.edu.fatec.zl.Lista.Lista;
import model.Cliente;

public class ModificacaoCadastroController {

	public ModificacaoCadastroController() {
		super();
	}
	
	public void novoCadastro(int idadeMin,int idadeMax, double limiteCredito) throws Exception {
		Lista<Cliente> lista = new Lista<>();
		File cadastro = new File("C:\\TEMP", "cadastro.csv");
		//Verifico se o arquivo existe
		if(cadastro.exists() && cadastro.isFile()) {
			//abre arquivo
			FileInputStream fluxo = new FileInputStream(cadastro);
			//le arquivo
			InputStreamReader leitor = new InputStreamReader(fluxo);
			//converte arquivo
			BufferedReader buffer = new BufferedReader(leitor);
			//coloca conteudo do arquivo no buffer
			String linha = buffer.readLine();
			//realiza a operacao
			while(linha != null) {	//procurando EOF(end of file)
				String[] atributo = linha.split(";");
				Cliente cliente = new Cliente();
				cliente.cpf = atributo[0];
				cliente.nome = atributo[1];
				cliente.idade = Integer.parseInt(atributo[2]);
				String limiteCreditoStr = atributo[3].replace(",", "."); // Substituir virgula por ponto
				cliente.limiteCredito = Double.parseDouble(limiteCreditoStr);
				if(cliente.idade >= idadeMin && cliente.idade <= idadeMax && cliente.limiteCredito >= limiteCredito) {
					if(lista.isEmpty()) {
						lista.addFirst(cliente);
					} else {
						lista.addLast(cliente);
					}
				}
				linha = buffer.readLine();
			}
			//fecha arquivo
			buffer.close();
			leitor.close();
			fluxo.close();
			String nomeArquivo = "Idade" + idadeMin + "-" + idadeMax + "limite" + limiteCredito + ".csv";
			novoArquivo(lista, nomeArquivo);
		} else {
			throw new IOException("Arquivo Invalido");
		}
	}

	private void novoArquivo(Lista<Cliente> lista, String nomeArquivo) throws Exception {
		File arq = new File("C:\\TEMP", nomeArquivo);
		int cont = 0;
		StringBuffer buffer = new StringBuffer();
		if(!lista.isEmpty()) {
			while(cont < lista.size()) {
				Cliente cliente = lista.get(cont);
				String linhaCSV = cliente.cpf + ";" + cliente.nome + ";" + cliente.idade + ";" + cliente.limiteCredito + "\r\n";
				buffer.append(linhaCSV);
				cont++;
			}
			//abre o arquivo
			FileWriter fileWriter = new FileWriter(arq);
			//escreve o conteudo no arquivo
			PrintWriter print = new PrintWriter(fileWriter);
			//abre o arquivo e escreve o conteudo
			print.write(buffer.toString());
			//finaliza a escrita
			print.flush();
			//fecha o arquivo
			print.close();
			//fecha o arquivo
			fileWriter.close();
			System.out.println("Arquivo Criado");
		} else {
			System.out.println("Nao foi encontrado nenhum cliente de acordo com os criterios de busca");
		}
		
	}

}
