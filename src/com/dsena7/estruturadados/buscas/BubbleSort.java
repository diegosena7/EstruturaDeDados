package com.dsena7.estruturadados.buscas;

/*
 * Bubble Sort � um algoritmo de ordena��o que pode ser aplicado em Arrays e Listas din�micas. Se o objetivo � ordenar os valores
 * em forma decrescente, ent�o, a posi��o atual � comparada com a pr�xima posi��o e, se a posi��o atual for maior que a posi��o
 * posterior, � realizada a troca dos valores nessa posi��o.
 * Neste caso usamos a vari�vel j recebendo i + 1, para testar os valores que est�o depois do in�cio, assim ode fazer a compara��o
 * entre os valores iterados. Caso o valor de i seja maior que o valor de j, usamos a vari�vel aux para mudar os valores de lugar, 
 * dessa forma conseguimos ordenar o vetor.
 */
public class BubbleSort {

	public static void main(String[] args) {

		int[] vetor = new int[100];

		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = (int) (Math.random() * vetor.length);
//			System.out.println(vetor[i]);
		}

		// BubbleSort O(N^2) N ao quadrado
		long inicio = System.currentTimeMillis();
		long fim;
		int aux;
		for (int i = 0; i < vetor.length; i++) { // O(N)
			for (int j = i + 1; j < vetor.length; j++) { // O(N)
				if (vetor[i] > vetor[j]) {
					aux = vetor[j];
					vetor[j] = vetor[i];
					vetor[i] = aux;
				}
			}
		}
		fim = System.currentTimeMillis();
        System.out.println("Tempo: " + (fim-inicio));
		System.out.println("Vetor ordenado");
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}

	}
}