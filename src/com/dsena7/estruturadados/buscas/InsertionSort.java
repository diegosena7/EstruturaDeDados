package com.dsena7.estruturadados.buscas;

/*
 * Insertion Sort ou ordena��o por inser��o � o m�todo que percorre um vetor de elementos da esquerda para a direita e � medida que avan�a vai ordenando os elementos � esquerda
 * Neste algoritmo usamos uma vari�vel aux para guardar o valor que estamos ordenando no vetor e a vari�vel j veifica se o valor da variavel i � maior para fazer a ordena��o, por isso
 * ela come�acom i -1 e � decrementada com j-- para retornar uma casa no vetor e verificar novamente, quando o valor de j for menor que zero, passamos 
 */
public class InsertionSort {

	public static void main(String[] args) {
		int[] vetor = new int[10];
		
		for (int i = 0; i < vetor.length; i++) {//Preenche vetor com n�meros aleat�rios
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
