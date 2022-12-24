package com.dsena7.estruturadados.application;

import com.dsena7.estruturadados.vetor_array.Vetor;

public class Teste2 {

	public static void main(String[] args) throws Exception {

		Vetor vet = new Vetor(5);
		
		vet.adicionaElemento("Teste 1");
		vet.adicionaElemento("Teste 2");
		
		System.out.println("Posição = " + vet.buscaPosicaoVetorExemplo1(0));
		System.out.println("Posição = " + vet.buscaPosicaoVetorExemplo1(1));
		
		System.out.println("Posição = " + vet.buscaPosicaoVetorExemplo2("Teste 1"));
		System.out.println("Posição = " + vet.buscaPosicaoVetorExemplo2("Teste 00"));
			
	}
}
