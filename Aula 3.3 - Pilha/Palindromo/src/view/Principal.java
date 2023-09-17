package view; 

import javax.swing.JOptionPane; // Importa a classe JOptionPane para receber entrada do usuario
import controller.PalindromoController; // Importa a classe PalindromoController do pacote controller.

public class Principal {

    public static void main(String[] args) {
    	
        String cadeia; // Declara uma variavel para armazenar a entrada do usuario
        String cadeiaLimpa; // Declara uma variavel para armazenar a entrada em minusuculo e apos a remocao de espaços 
        PalindromoController methods = new PalindromoController(); // Cria uma instancia de PalindromoController
        String cadeiaInvertida; // Declara uma variavel para armazenar a versao invertida da entradaa
        boolean palindromo; // Declara uma variavel booleana para armazenar se a entrada e um palindromo ou nao

        // Solicita ao usuario que insira uma palavra
        cadeia = JOptionPane.showInputDialog("Digite a palavra(sem acento)");
        
        // Remove espacos da entrada
        cadeiaLimpa = cadeia.replaceAll("\\s", "");
        
        // Converte a entrada para minusculas
        cadeiaLimpa = cadeiaLimpa.toLowerCase(); 
        
        // Inverte a cadeia usando o metodo da classe PalindromoController
        cadeiaInvertida = methods.invertePalavra(cadeiaLimpa);
        
        // Compara a cadeia original com a cadeia invertida
        palindromo = methods.comparaPalavras(cadeiaLimpa, cadeiaInvertida); 

        // Exibe se a palavra e ou nao um palindromo com base no resultado da comparacao
        if(palindromo) {
            System.out.println(cadeia + " é um palíndromo");
        } else {
            System.out.println(cadeia + " não é um palíndromo");
        }
    }
}

