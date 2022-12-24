package com.dsena7.estruturadados.buscas;

/*
 * Bubble Sort é um algoritmo de ordenação que pode ser aplicado em Arrays e Listas dinâmicas. Se o objetivo é ordenar os valores
 * em forma decrescente, então, a posição atual é comparada com a próxima posição e, se a posição atual for maior que a posição
 * posterior, é realizada a troca dos valores nessa posição.
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