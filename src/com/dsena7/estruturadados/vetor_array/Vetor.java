package com.dsena7.estruturadados.vetor_array;

public class Vetor {

	private String[] elementos;
	private int tamanho = 0;

	public Vetor(int capacidade) {
		this.elementos = new String[capacidade];
		this.tamanho = 0;
	}

	private void aumentacapaidadeVetor() {
		String[] elementosNovos = new String[elementos.length * 2];
		for (int i = 0; i < elementos.length; i++) {
			elementosNovos[i] = elementos[i];
		}
		elementos = elementosNovos;
	}

	public void adicionaElementoPorPosicao(int posicao, String elemento) {
		if (tamanho == elementos.length) {
			aumentacapaidadeVetor();
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

	public void adicionaElemento(String elemento) throws Exception {
		if (tamanho == elementos.length) {
			aumentacapaidadeVetor();
		}

		if (this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
		} else {
			throw new Exception("O vetor está cheio");
		}
	}

	public int verificaTamanhoVetor() {
		return this.tamanho;

	}

	public String buscaPosicaoVetorExemplo1(int posicao) {
		if (!(posicao < tamanho && posicao >= 0)) {
			throw new IllegalArgumentException("Posição inválida.");
		}
		return this.elementos[posicao];
	}

	public int buscaPosicaoVetorExemplo2(String elemnto) {
		for (int i = 0; i < this.tamanho; i++) {
			if (this.elementos[i].equalsIgnoreCase(elemnto)) {
				return i;
			}
		}
		return -1;
	}
	
	public void removePorIndiceDoVetor(int posicao) {
		if (!(posicao < tamanho && posicao >= 0)) {
			throw new IllegalArgumentException("Posição inválida.");
		}
		for (int i = posicao; i < tamanho; i++) {
			elementos[i] = elementos[i + 1];
		}
		tamanho --;
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
