package com.dsena7.estruturadados.buscas;

/*
 * O heapsort utiliza uma estrutura de dados chamada heap binário para ordenar os elementos a medida que os insere na estrutura. Assim, ao final das inserções,
 * os elementos podem ser sucessivamente removidos da raiz da heap, na ordem desejada. Um heap binário é uma árvore binária mantida na forma de um vetor.
 * No heap, o elemento Pai (raiz) é maior que seus filhos.
 */
public class HeapSort {

	public static void main(String[] args) {
		int[] vetor = new int[10];

		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = (int) (Math.random() * vetor.length);
		}

		System.out.println("Desordenado");
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i] + " ");
		}
		
		int tamanhoVetor = vetor.length;
		
		for(int i = tamanhoVetor /2 - 1; i >= 0; i--) {//pegamos a metade do vetor e vamos decrementando, assim ajustamos parte do vetor com heap
			aplicarHeap(vetor, tamanhoVetor, i);
		}
		
		System.out.println("\nAplicadoHeap");
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i] + " ");
		}
		
		for(int j = tamanhoVetor - 1; j > 0; j --) {//pegamos o último elemento do vetor e vamos decrementando, colocando o vetor em ordem crescente
			int aux = vetor[0];
			vetor[0] = vetor[j];
			vetor[j] = aux;
			aplicarHeap(vetor, j, 0);
		}
		
		System.out.println("\nOrdenado");
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i] + " ");
		}
	}
	
	public static void aplicarHeap(int[] vetor, int n, int i) {
		int raiz = i;
		int esquerda = 2 * i + 1;
		int direita = 2 * i + 2;
		
		//Passamos para a raiz o elemento da esquerda ou direita,caso ele seja maior que a raiz, implementando o heap
		if(esquerda < n && vetor[esquerda] > vetor[raiz]) {
			raiz = esquerda;
		}
		
		if(direita < n && vetor[direita] > vetor[raiz]) {
			raiz = direita;
		}
		
		if(raiz !=i) {
			int aux = vetor[i];
			vetor[i] = vetor[raiz];
			vetor[raiz] = aux;
			aplicarHeap(vetor, n, raiz);
		}
	}
}
