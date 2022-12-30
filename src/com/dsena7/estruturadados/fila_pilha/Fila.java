package com.dsena7.estruturadados.fila_pilha;

import com.dsena7.estruturadados.lista.ListaLigada;

public class Fila {

	private ListaLigada lista = new ListaLigada();
	
	public static void main(String[] args) {
		Fila fila = new Fila();
		fila.adiciona("Diego");
		fila.adiciona("Nayara");
		fila.adiciona("Ryan");
		fila.adiciona("Ted");
		
		System.out.println("Primiro fila: "+ fila.getElemento());
		
		fila.remover();
		System.out.println("Primiro fila: "+ fila.getElemento());
	}
	
	public void adiciona(String novoValor){
		lista.adicionar(novoValor);
	}
	
	public void remover() {
		lista.remover(getElemento());
	}
	
	public String getElemento() {
		return (String) lista.getPrimeiro().getValor();
	}
}
