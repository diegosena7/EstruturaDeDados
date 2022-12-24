package com.dsena7.estruturadados.buscas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * Algorito de Busca Bin�ria
 * Algoritmo de busca em vetores que segue o paradigma de divis�o e conquista. Ela parte do pressuposto de que o vetor est� ordenado e realiza sucessivas divis�es do espa�o 
 * de busca comparando o elemento buscado com o elemento no meio do vetor.
 */
public class BuscaBinaria {

	public static void main(String[] args) {
		
		List<Integer> numeros = new ArrayList<>();
		
		numeros.add(1);
		numeros.add(3);
		numeros.add(7);
		numeros.add(9);
		numeros.add(11);
		numeros.add(13);
		
		for (Integer num : numeros) {
			System.out.println(num);
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o n�mero  buscar: ");
		Integer numBuscado = sc.nextInt();
		
		Integer contador = 0;
		Boolean achou = false;
		Integer inicio = 0;
		Integer meio;
		Integer fim  = numeros.size() - 1;
		
		//Busca bin�ria
		while(inicio <= fim) {
			meio = (int) ((inicio + fim) /2);
			contador ++;
			if(numeros.get(meio) == numBuscado) {
				achou = true;
				break;
			}else if(numeros.get(meio) < numBuscado) {
				inicio = meio + 1;
			}else {
				fim = meio -1;
			}
		}
		System.out.println("Qtidade de testes " + contador);
		if(achou) {
			System.out.println("ACHOU");
		}else {
			System.out.println("N�O ACHOU");
		}
		sc.close();
	}
}
