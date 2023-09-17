package controller;

import br.edu.fateczl.pilhastring.PilhaString;	// Importa a classe PilhaString

public class PalindromoController {

	public PalindromoController() {
		super();
	}
	
	// Metodo para inverter uma cadeia de caracteres
    public String invertePalavra(String cadeia) {
        
        PilhaString pilha = new PilhaString(); // Cria uma instancia da classe PilhaString
        String ultimoCaracter; // Declara uma variavel para armazenar o ultimo caractere
        String cadeiaInvertida = ""; // Declara uma variavel para armazenar a cadeia invertida
        
        // Empilha os caracteres da cadeia
        while(cadeia.length() > 0) {
        	
            ultimoCaracter = Character.toString(cadeia.charAt(cadeia.length()-1));	//Pega o ultimo caracter da cadeia
            pilha.push(ultimoCaracter); // Coloca o ultimo caractere na pilha
            cadeia = cadeia.substring(0, cadeia.length() - 1); // Remove o ultimo caractere da cadeia original
            
        }	//fim while
        
        // Desempilha os caracteres e constroi a cadeia invertida
        while(!pilha.isEmpty()) {
            try {
                cadeiaInvertida = pilha.pop() + cadeiaInvertida; // Desempilha e concatena os caracteres
            } catch (Exception e) {
                String msgError = e.getMessage();
                System.err.println(msgError);
            }
        }
        
        return cadeiaInvertida; // Retorna a cadeia invertida
        
    }
    
    // Metodo para comparar duas cadeias de caracteres
    public boolean comparaPalavras(String cadeia, String cadeiaInvertida) {
        
        return cadeia.equals(cadeiaInvertida); // Compara as duas cadeias e retorna true se forem iguais, caso contrário, retorna false
        
    }

}
