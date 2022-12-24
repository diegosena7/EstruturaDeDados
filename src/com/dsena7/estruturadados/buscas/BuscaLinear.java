package com.dsena7.estruturadados.buscas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * Uma busca linear ou sequencial percorre uma lista em busca de um elemento X de modo que a função do tempo em relação ao número 
 * de elementos é linear, ou seja, cresce proporcionalmente a quantidade de elementos a ser percorridos.
 */
public class BuscaLinear {

	public static void main(String[] args) {

		List<String> estados = new ArrayList<>();

		estados.add("SP");
		estados.add("RJ");
		estados.add("AL");
		estados.add("RS");
		estados.add("CE");

		for (String sigla : estados) {
			System.out.println(sigla);
		}

		Scanner sc = new Scanner(System.in);
		System.out.println("Informe a sigla do estado: ");
		String buscaSigla = sc.nextLine();
		Boolean encontrouSigla = false;

		// Busca Linear
		for (String string : estados) {
			if (string.equalsIgnoreCase(buscaSigla)) {
				encontrouSigla = true;
				break;
			}
		}
		if (encontrouSigla) {
			System.out.println("ENCONTROU");
		} else {
			System.out.println("NÃO ENCONTROU");
		}
		sc.close();
	}
}
