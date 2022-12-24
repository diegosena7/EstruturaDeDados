package com.dsena7.estruturadados.buscas;

import java.util.Scanner;

/*
 * Algorito de Busca Binária
 * Algoritmo de busca em vetores que segue o paradigma de divisão e conquista. Ela parte do pressuposto de que o vetor está ordenado e realiza sucessivas divisões do espaço 
 * de busca comparando o elemento buscado com o elemento no meio do vetor.
 */
public class BuscaBinariaComVetor {

	public static void main(String[] args) {
		
		Integer[] vet = new Integer[100];
		
		for (int i = 0; i < vet.length;i ++) {
			vet[i] = i * 2;
			System.out.println(vet[i]);
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o número  buscar: ");
		Integer numBuscado = sc.nextInt();
		
		Integer contador = 0;
		Boolean achou = false;
		Integer inicio = 0;
		Integer meio;
		Integer fim  = vet.length - 1;
		
		//Busca binária
		while(inicio <= fim) {
			meio = (int) ((inicio + fim) /2);
			contador ++;
			if(vet [meio] == numBuscado) {
				achou = true;
				break;
			}else if(vet [meio] < numBuscado) {
				inicio = meio + 1;
			}else {
				fim = meio -1;
			}
		}
		System.out.println("Qtidade de testes " + contador);
		if(achou) {
			System.out.println("ACHOU");
		}else {
			System.out.println("NÃO ACHOU");
		}
		sc.close();
	}
}
