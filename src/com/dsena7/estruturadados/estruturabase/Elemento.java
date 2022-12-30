package com.dsena7.estruturadados.estruturabase;

public class Elemento<T> {

	private T valor;
    private Elemento<T> proximo;
    private Elemento<T> esquerda;
    private Elemento<T> direita;
    
    public Elemento(T novoValor) {
		this.valor = novoValor;
		this.esquerda = null;
		this.direita = null;
	}

    public T getValor() {
        return valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }

    public Elemento<T> getProximo() {
        return proximo;
    }

    public void setProximo(Elemento<T> proximo) {
        this.proximo = proximo;
    }

	public Elemento<T> getEsquerda() {
		return esquerda;
	}

	public void setEsquerda(Elemento<T> esquerda) {
		this.esquerda = esquerda;
	}

	public Elemento<T> getDireita() {
		return direita;
	}

	public void setDireita(Elemento<T> direita) {
		this.direita = direita;
	}
}