package com.dsena7.estruturadados.application;

import com.dsena7.estruturadados.vetor_array.Contato;
import com.dsena7.estruturadados.vetor_array.VetorObjects;

public class TesteVetorContatos {

	public static void main(String[] args) throws Exception {
		
		VetorObjects vetObjects = new VetorObjects(3);
		
		Contato cont1 = new Contato("Diego", "11947168617", "diego@dsena7.com.br");
		Contato cont2 = new Contato("Ryan", "11946987763", "ryan@dsena7.com.br");
		Contato cont3 = new Contato("Nayara", "11963574499", "nayara@dsena7.com.br");
		
		vetObjects.adicionaElemento(cont1);
		vetObjects.adicionaElemento(cont2);
		vetObjects.adicionaElemento(cont3);
		
		System.out.println(vetObjects);
	}
}
