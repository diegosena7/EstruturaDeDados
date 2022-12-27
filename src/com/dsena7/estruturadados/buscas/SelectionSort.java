package com.dsena7.estruturadados.buscas;

/*
 * Esse algoritmo tem como função bucar o menor elemento da sequência e colocar esse elemento na primeira posição do array, assim seleciona
 * e ordena crescentemente os valores.
 * Neste algoritmo usamos a variável j para verificar se o valor posterior a variável i é maior, para assim fazer a ordenação. Usamos a variável
 * aux ara guardar o valor e assim fazermos as trocas de posições.
 */
public class SelectionSort {

	public static void main(String[] args) {

		int[] vetor = new int[10];

		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = (int) (Math.random() * vetor.length);
		}

		System.out.println("Desordenado");
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}

		// Selection sort O(N^2)
		int posicao_menor, aux;
		for (int i = 0; i < vetor.length; i++) { // O(N)
			posicao_menor = i;
			for (int j = i + 1; j < vetor.length; j++) { // O(N)
				if (vetor[j] < vetor[posicao_menor]) {
					posicao_menor = j;
				}
			}
			aux = vetor[posicao_menor];
			vetor[posicao_menor] = vetor[i];
			vetor[i] = aux;
		}

		System.out.println("\nOrdenado");
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}
	}
}