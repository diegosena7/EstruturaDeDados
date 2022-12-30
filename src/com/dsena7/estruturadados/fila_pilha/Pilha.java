package com.dsena7.estruturadados.fila_pilha;

import com.dsena7.estruturadados.lista.ListaLigada;

public class Pilha {

	private ListaLigada listaLigada;

	public Pilha() {
		this.listaLigada = new ListaLigada();
	}

	public static void main(String[] args) {

		Pilha pilha = new Pilha();

		pilha.adicionarPilha("E");
		pilha.adicionarPilha("B");
		pilha.adicionarPilha("Z");
		pilha.adicionarPilha("D");
		pilha.adicionarPilha("C");

		System.out.println("Topo: " + pilha.getElemento());

		pilha.removerElemento();

		System.out.println("Novo Topo: " + pilha.getElemento());

	}

	public void adicionarPilha(String novoElemento) {
		this.listaLigada.adicionaNoComeco(novoElemento);
	}

	public void removerElemento() {
		this.listaLigada.remover(this.getElemento());
	}

	public String getElemento() {
		return (String) this.listaLigada.getPrimeiro().getValor();
	}
}
