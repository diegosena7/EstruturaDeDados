package com.dsena7.estruturadados.application;

import com.dsena7.estruturadados.vetor_array.VetorObjects;

public class Exer3 {

	public static void main(String[] args) throws Exception {

		VetorObjects<String> list = new VetorObjects<>(5);

		list.adicionaElemento("A");
		list.adicionaElemento("B");
		list.adicionaElemento("C");
		list.adicionaElemento("D");
		list.adicionaElemento("E");

		System.out.println(list.buscaPosicaoVetorExemplo2("B"));
		System.out.println(list.buscaPosicaoVetorExemplo1(3));
		
		System.out.println(list);
		
//		list.limparArrayOpcao1();
//		list.limparArrayOpcao2();
//		list.limparArrayOpcao3();
		
		System.out.println(list);
	}
}
