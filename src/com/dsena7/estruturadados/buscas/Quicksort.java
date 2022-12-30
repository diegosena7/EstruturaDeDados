package com.dsena7.estruturadados.buscas;

public class Quicksort {

	public static void main(String[] args) {

		int[] vetor = new int[10];

		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = (int) Math.floor(Math.random() * vetor.length);
		}

		System.out.println("Desordenado");
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + " ");
		}

		quicksort(vetor, 0, vetor.length - 1);

		System.out.println("\n\nOrdenado");
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + " ");
		}
	}

	static void quicksort(int[] vetor, int esquerda, int direita) {
		if (esquerda < direita) {
			int part = particao(vetor, esquerda, direita);
			quicksort(vetor, esquerda, part);
			quicksort(vetor, part + 1, direita);
		}
	}

	static int particao(int[] vetor, int esquerda, int direita) {
		int meioVetor = (int) (esquerda + direita) / 2;
		int pivot = vetor[meioVetor];
		int posicaoEsquerdaVetor = esquerda - 1;
		int posicaoDireitaVetor = direita + 1;
		while (true) {
			do {
				posicaoEsquerdaVetor++;
			} while (vetor[posicaoEsquerdaVetor] < pivot);
			do {
				posicaoDireitaVetor--;
			} while (vetor[posicaoDireitaVetor] > pivot);
			if (posicaoEsquerdaVetor >= posicaoDireitaVetor) {
				return posicaoDireitaVetor;
			}
			int aux = vetor[posicaoEsquerdaVetor];
			vetor[posicaoEsquerdaVetor] = vetor[posicaoDireitaVetor];
			vetor[posicaoDireitaVetor] = aux;
		}
	}
}
