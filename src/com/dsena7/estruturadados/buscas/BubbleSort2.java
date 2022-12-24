package com.dsena7.estruturadados.buscas;

/*
 * Bubble Sort � um algoritmo de ordena��o que pode ser aplicado em Arrays e Listas din�micas. Se o objetivo � ordenar os valores
 * em forma decrescente, ent�o, a posi��o atual � comparada com a pr�xima posi��o e, se a posi��o atual for maior que a posi��o
 * posterior, � realizada a troca dos valores nessa posi��o.
 */
public class BubbleSort2 {

	static void bubbleSort(int[] arr) {
		int n = arr.length;
		int temp = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n - i); j++) {
				if (arr[j - 1] > arr[j]) {
					// swap elements
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}

			}
		}

	}

	public static void main(String[] args) {

		int arr[] = { 3, 60, 35, 2, 45, 320, 5 };

		System.out.println("Array Before Bubble Sort");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		bubbleSort(arr);// sorting array elements using bubble sort

		System.out.println("Array After Bubble Sort");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}
}