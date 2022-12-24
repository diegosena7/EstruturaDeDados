package com.dsena7.estruturadados.vetor_array;

public class VetorObjects<T> {

	private T[] elementos;
	private int tamanho = 0;

	public VetorObjects(int capacidade) {
		this.elementos = (T[]) new String[capacidade];
		this.tamanho = 0;
	}

	private void aumentaCapacidadeVetor() {
		T[] elementosNovos = (T[]) new Object[elementos.length * 2];
		for (int i = 0; i < elementos.length; i++) {
			elementosNovos[i] = elementos[i];
		}
		elementos = elementosNovos;
	}

	public void adicionaElementoPorPosicao(int posicao, T elemento) {
		if (tamanho == elementos.length) {
			aumentaCapacidadeVetor();
		}

		if (!(posicao < tamanho && posicao >= 0)) {
			throw new IllegalArgumentException("Posição inválida.");
		}
		for (int i = tamanho - 1; i >= posicao; i--) {// percorre o elemento de trás pra frente
			elementos[i + 1] = elementos[i];
		}
		elementos[posicao] = elemento;
		tamanho++;
	}

	public void adicionaElemento(T elemento) throws Exception {
		if (tamanho == elementos.length) {
			aumentaCapacidadeVetor();
		}

		if (this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
		} else {
			throw new Exception("O vetor está cheio");
		}
	}

	public void SubstituiElementoPorPosicao(int posicao, T elemento) throws Exception {
		if (tamanho == elementos.length) {
			aumentaCapacidadeVetor();
		}

		if (this.tamanho < this.elementos.length) {
			this.elementos[posicao] = elemento;
			this.tamanho++;
		} else {
			throw new Exception("O vetor está cheio");
		}
	}

	public int verificaTamanhoVetor() {
		return this.tamanho;
	}

	public Object buscaPosicaoVetorExemplo1(int posicao) {
		if (!(posicao < tamanho && posicao >= 0)) {
			throw new IllegalArgumentException("Posição inválida.");
		}
		return this.elementos[posicao];
	}

	public int buscaPosicaoVetorExemplo2(T elemnto) {
		for (int i = 0; i < this.tamanho; i++) {
			if (this.elementos[i].equals(elemnto)) {
				return i;
			}
		}
		return -1;
	}

	public void removePorIndiceDoVetor(int posicao) {
		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posição inválida.");
		}
		for (int i = posicao; i < tamanho -1; i++) {
			elementos[i] = elementos[i + 1];
		}
		tamanho--;
	}
	
	public void removePorIndiceDoVetor(T elemento) {
		int posicao = buscaPosicaoVetorExemplo2(elemento);
		if(posicao > -1) {
			removePorIndiceDoVetor(posicao);
		}
	}
	
	public boolean contem(T elemento) {
		return buscaPosicaoVetorExemplo2(elemento) >= 0;
	}
	
	public int ultimoIndiceArray(T elemento) {
		for(int i = tamanho -1; i >= 0; i--) {
			if(elementos[i].equals(elemento)) {
				return i;
			}
		}
		return -1;
	}
	
	public void limparArrayOpcao1() {
		elementos = (T[]) new Object[elementos.length];
	}
	
	public void limparArrayOpcao2() {
		tamanho = 0;
	}
	
	public void limparArrayOpcao3() {
		for(int i = 0; i < tamanho; i ++) {
			elementos[i] = null;
		}
		tamanho = 0;
	}

	@Override
	public String toString() {
		StringBuilder stringB = new StringBuilder();
		stringB.append("[");

		for (int i = 0; i < this.tamanho - 1; i++) {
			stringB.append(this.elementos[i]);
			stringB.append(", ");
		}
		if (this.tamanho > 0) {
			stringB.append(this.elementos[this.tamanho - 1]);
		}
		stringB.append("]");
		return stringB.toString();
	}
}
