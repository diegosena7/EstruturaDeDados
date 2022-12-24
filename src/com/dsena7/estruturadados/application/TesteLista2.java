package com.dsena7.estruturadados.application;

import com.dsena7.estruturadados.lista.Lista;
import com.dsena7.estruturadados.vetor_array.Contato;

public class TesteLista2 {

	public static void main(String[] args) throws Exception {

		Lista<String> listVetor = new Lista(2);
		Lista<Contato> listVetorCont = new Lista(2);
		
		Contato cont1 = new Contato("Diego", "11947168617", "diego@dsena7.com.br");
		
//		listVetorCont.adicionaElemento(cont1);
		
		listVetor.adiciona("TESTES");
		listVetor.adiciona("Diego");
		
//		System.out.println(listVetorCont);
		System.out.println(listVetor);
		
		Boolean contem = listVetor.contem("Diego");
		if(contem) {
			System.out.println("Cont�m");
		}else {
			System.out.println("N�o cont�m");
		}
		
		//Verifica o �ltimo elemento da lista
		System.out.println("�ltimo elemento = " + listVetor.ultimoIndice("Diego"));
	}
}
