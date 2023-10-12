package br.edu.fatec.zl.Lista;

public class No<T> {

	T dado;
	No<T> proximo;
	
	@Override
	public String toString() {
		return (String) dado;
	}
	
}
