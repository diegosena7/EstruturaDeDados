package com.dsena7.estruturadados.application;

import com.dsena7.estruturadados.vetor_array.Vetor;

public class Teste3 {

	public static void main(String[] args) throws Exception {

		Vetor vet = new Vetor(10);

		vet.adicionaElemento("B");
		vet.adicionaElemento("C");
		vet.adicionaElemento("E");
		vet.adicionaElemento("F");
		vet.adicionaElemento("G");

		System.out.println(vet);

		vet.adicionaElementoPorPosicao(0, "A");

		System.out.println(vet);

		vet.adicionaElementoPorPosicao(3, "D");

		System.out.println(vet);

	}
}
