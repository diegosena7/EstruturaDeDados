package com.dsena7.estruturadados.lista;

import com.dsena7.estruturadados.estruturabase.Elemento;

public class ListaLigada {

	private Elemento primeiro;
	private Elemento ultimo;
	private int tamanho;

	public ListaLigada() {
		this.tamanho = 0;
	}

	public Elemento getPrimeiro() {
		return primeiro;
	}

	public void setPrimeiro(Elemento primeiro) {
		this.primeiro = primeiro;
	}

	public Elemento getUltimo() {
		return ultimo;
	}

	public void setUltimo(Elemento ultimo) {
		this.ultimo = ultimo;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	public void adicionar(String novoValor) {
		Elemento novo = new Elemento(novoValor);

		if (primeiro == null && ultimo == null) {
			primeiro = novo;
			ultimo = novo;
		} else {
			ultimo.setProximo(novo);
			ultimo = novo;
		}
		tamanho++;
	}

	public int getTamanho() {
		return tamanho;
	}

	public void remover(String valorProcurado) {
		Elemento atual= this.primeiro;
		Elemento anterior = null;
		for(int i = 0; i <this.getTamanho(); i ++) {
			if(atual.getValor().equalsIgnoreCase(valorProcurado)) {
				anterior.setProximo(atual.getProximo());
				atual = null;
				break;
			}
			anterior = atual;
			atual = atual.getProximo();
		}
	}

	public Elemento get(int posicao) {
		Elemento atual = primeiro;
		for(int i = 0; i < posicao; i++) {
			if(atual.getProximo() != null) {
				atual = atual.getProximo();
			}
		}
		return atual;
	}
}
