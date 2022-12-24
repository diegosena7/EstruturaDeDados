package com.dsena7.estruturadados.application;

import com.dsena7.estruturadados.vetor_array.VetorObjects;

public class TesteVetorObjets {

	public static void main(String[] args) throws Exception {

		VetorObjects vetObjects = new VetorObjects(3);

		vetObjects.adicionaElemento("B");
		vetObjects.adicionaElemento("C");
		vetObjects.adicionaElemento("E");
		vetObjects.adicionaElemento("F");
		vetObjects.adicionaElemento("G");
		vetObjects.adicionaElemento("H");
		vetObjects.adicionaElemento("I");

		System.out.println(vetObjects);

		vetObjects.removePorIndiceDoVetor(0);
		vetObjects.removePorIndiceDoVetor(2);
		vetObjects.removePorIndiceDoVetor(4);

		System.out.println(vetObjects);

		int position = vetObjects.buscaPosicaoVetorExemplo2("H");

		if (position >= 0) {
			System.out.println("Elemento encontrado, removendo...");
			vetObjects.removePorIndiceDoVetor(position);
		}else {
			System.out.println("Elemento não encontrado...");
		}
		
		System.out.println(vetObjects);
		
		vetObjects.adicionaElementoPorPosicao(0, "KK");
		
		System.out.println(vetObjects);
		
		vetObjects.SubstituiElementoPorPosicao(0, "A");
		
		System.out.println(vetObjects);
	}
}
