package com.dsena7.estruturadados.application;

import com.dsena7.estruturadados.vetor_array.VetorObjects;

public class Exer1 {

	public static void main(String[] args) throws Exception {

		VetorObjects<String> list = new VetorObjects<>(5);

		list.adicionaElemento("A");
		list.adicionaElemento("B");
		list.adicionaElemento("C");
		list.adicionaElemento("D");
		list.adicionaElemento("E");

		System.out.println(list);

		list.removePorIndiceDoVetor("B");

		System.out.println(list);

		list.removePorIndiceDoVetor("E");

		System.out.println(list);
	}
}
