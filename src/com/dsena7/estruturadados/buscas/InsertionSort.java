package com.dsena7.estruturadados.buscas;

/*
 * Insertion Sort ou ordenação por inserção é o método que percorre um vetor de elementos da esquerda para a direita e à medida que avança vai ordenando os elementos à esquerda
 * Neste algoritmo usamos uma variável aux para guardar o valor que estamos ordenando no vetor e a variável j veifica se o valor da variavel i é maior para fazer a ordenação, por isso
 * ela começacom i -1 e é decrementada com j-- para retornar uma casa no vetor e verificar novamente, quando o valor de j for menor que zero, passamos 
 */
public class InsertionSort {

	public static void main(String[] args) {
		int[] vetor = new int[10];
		
		for (int i = 0; i < vetor.length; i++) {//Preenche vetor com números aleatórios
			vetor[i] = (int) (Math.random() * vetor.length);
		}
		

		System.out.println("Desordenado");
		for (int i = 0; i < vetor.length; i++) {
			 System.out.println(vetor[i]);
		}
		
		//Insertion sort
		int aux, j;
		for(int i = 1; i < vetor.length; i++) {
			aux = vetor[i];
			j = i -1;
			
			while(j >= 0 && vetor[j]> aux){
				vetor[j + 1] = vetor[j];
				j--;
			}
			vetor[j + 1] = aux;
		}
		
		System.out.println("----------");
		System.out.println("Ordenado");
		for (int i = 0; i < vetor.length; i++) {
			 System.out.println(vetor[i]);
		}
	}
}
