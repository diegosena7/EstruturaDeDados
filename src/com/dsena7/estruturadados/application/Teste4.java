package com.dsena7.estruturadados.application;

import com.dsena7.estruturadados.vetor_array.Vetor;

public class Teste4 {

	public static void main(String[] args) throws Exception {

		Vetor vet = new Vetor(3);

		vet.adicionaElemento("B");
		vet.adicionaElemento("C");
		vet.adicionaElemento("E");
		vet.adicionaElemento("F");
		vet.adicionaElemento("G");
		vet.adicionaElemento("H");
		vet.adicionaElemento("I");

		System.out.println(vet);

		vet.removePorIndiceDoVetor(0);
		vet.removePorIndiceDoVetor(2);
		vet.removePorIndiceDoVetor(4);

		System.out.println(vet);

		int position = vet.buscaPosicaoVetorExemplo2("H");

		if (position >= 0) {
			System.out.println("Elemento encontrado, removendo...");
			vet.removePorIndiceDoVetor(position);
		}else {
			System.out.println("Elemento não encontrado...");
		}
		
		System.out.println(vet);
	}
}
