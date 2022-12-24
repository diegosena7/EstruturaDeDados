package com.dsena7.estruturadados.application;

import com.dsena7.estruturadados.vetor_array.Vetor;

public class Teste {

	public static void main(String[] args) throws Exception {

		Vetor vet = new Vetor(5);
		
		vet.adicionaElemento("Teste 1");
		vet.adicionaElemento("Teste 2");
		vet.adicionaElemento("Teste 3");
		vet.adicionaElemento("Teste 4");
		vet.adicionaElemento("Teste 5");
		
		System.out.println("Tamanho vetor = " + vet.verificaTamanhoVetor());	
		System.out.println("Itens vetor = " + vet);	
	}
}
