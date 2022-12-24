package com.dsena7.estruturadados.application;

import java.util.Scanner;

import com.dsena7.estruturadados.lista.Lista;
import com.dsena7.estruturadados.vetor_array.Contato;
import com.dsena7.estruturadados.vetor_array.ContatoService;

public class Exer4 {

	public static void main(String[] args) throws Exception {
		
		// criação das variáveis
		Scanner scan = new Scanner(System.in);

		// criar vetor com 20 de capacidade
		Lista<Contato> lista = new Lista<Contato>(20);

		// criar e adicionar X contatos
		ContatoService.criarContatosDinamicamente(5, lista);

		// criar um menu para que o usuário escolha a opção
		int opcao = 1;

		while (opcao != 0) {

			opcao = ContatoService.obterOpcaoMenu(scan);

			switch (opcao) {
			case 1:
				ContatoService.adicionarContatoFinal(scan, lista);
				break;
			case 2:
				ContatoService.adicionarContatoPosicao(scan, lista);
				break;
			case 3:
				ContatoService.obtemContatoPosicao(scan, lista);
				break;
			case 4:
				ContatoService.obtemContato(scan, lista);
				break;
			case 5:
				ContatoService.pesquisarUltimoIndice(scan, lista);
				break;
			case 6:
				ContatoService.pesquisarContatoExiste(scan, lista);
				break;
			case 7:
				ContatoService.excluirPorPosicao(scan, lista);
				break;
			case 8:
				ContatoService.excluirContato(scan, lista);
				break;
			case 9:
				ContatoService.imprimeTamanhoVetor(lista);
				break;
			case 10:
				ContatoService.limparVetor(lista);
				break;
			case 11:
				ContatoService.imprimirVetor(lista);
				break;
			default:
				break;
			}
		}

		System.out.println("Usuário digitou 0, programa terminado");
	}
}