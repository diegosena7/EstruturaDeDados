package com.dsena7.estruturadados.vetor_array;

import java.util.ArrayList;
import java.util.Scanner;

public class ContatoServiceArrayList extends ContatoService{

	public static void imprimirVetor(ArrayList<Contato> lista) {

		System.out.println(lista);
	}

	public static void limparVetor(ArrayList<Contato> lista) {

		lista.clear();

		System.out.println("Todos os contatos do vetor foram exclu�dos");
	}

	public static void imprimeTamanhoVetor(ArrayList<Contato> lista) {

		System.out.println("Tamanho do vetor � de: " + lista.size());
	}

	public static void excluirPorPosicao(Scanner scan, ArrayList<Contato> lista) {

		int pos = leInformacaoInt("Entre com a posi��o a ser removida", scan);

		try {

			lista.remove(pos);

			System.out.println("Contato exclu�do");

		} catch (Exception e) {
			System.out.println("Posi��o inv�lida!");
		}
	}

	public static void excluirContato(Scanner scan, ArrayList<Contato> lista) {

		int pos = leInformacaoInt("Entre com a posi��o a ser removida", scan);

		try {

			Contato contato = (Contato) lista.get(pos);

			lista.contains(contato);

			System.out.println("Contato exclu�do");

		} catch (Exception e) {
			System.out.println("Posi��o inv�lida!");
		}
	}

	public static void pesquisarContatoExiste(Scanner scan, ArrayList<Contato> lista) {

		int pos = leInformacaoInt("Entre com a posi��o a ser pesquisada", scan);

		try {

			Contato contato = (Contato) lista.get(pos);

			boolean existe = lista.contains(contato);

			if (existe) {
				System.out.println("Contato existe, seguem dados:");
				System.out.println(contato);
			} else {
				System.out.println("Contato n�o existe");
			}

		} catch (Exception e) {
			System.out.println("Posi��o inv�lida!");
		}
	}

	public static void pesquisarUltimoIndice(Scanner scan, ArrayList<Contato> lista) {

		int pos = leInformacaoInt("Entre com a posi��o a ser pesquisada", scan);

		try {

			Contato contato = (Contato) lista.get(pos);

			System.out.println("Contato existe, seguem dados:");
			System.out.println(contato);

			System.out.println("Fazendo pesquisa do �ltimo �ndice do contato encontrado:");
			pos = lista.lastIndexOf(contato);

			System.out.println("Contato encontrado na posi��o " + pos);

		} catch (Exception e) {
			System.out.println("Posi��o inv�lida!");
		}
	}

	public static void obtemContato(Scanner scan, ArrayList<Contato> lista) {

		int pos = leInformacaoInt("Entre com a posi��o a ser pesquisada", scan);

		try {

			Contato contato = (Contato) lista.get(pos);

			System.out.println("Contato existe, seguem dados:");
			System.out.println(contato);

			System.out.println("Fazendo pesquisa do contato encontrado:");
			pos = lista.indexOf(contato);

			System.out.println("Contato encontrado na posi��o " + pos);

		} catch (Exception e) {
			System.out.println("Posi��o inv�lida!");
		}
	}

	public static void obtemContatoPosicao(Scanner scan, ArrayList<Contato> lista) {

		int pos = leInformacaoInt("Entre com a posi��o a ser pesquisada", scan);

		try {

			Contato contato = (Contato) lista.get(pos);

			System.out.println("Contato existe, seguem dados:");
			System.out.println(contato);

		} catch (Exception e) {
			System.out.println("Posi��o inv�lida!");
		}
	}

	public static void adicionarContatoFinal(Scanner scan, ArrayList<Contato> lista) throws Exception {

		System.out.println("Criando um contato, entre com as informa��es:");
		String nome = leInformacao("Entre com o nome", scan);
		String telefone = leInformacao("Entre com o telefone", scan);
		String email = leInformacao("Entre com o email", scan);

		Contato contato = new Contato(nome, telefone, email);

		lista.add(contato);

		System.out.println("Contato adicionado com sucesso!");
		System.out.println(contato);
	}

	public static void adicionarContatoPosicao(Scanner scan, ArrayList<Contato> lista) {

		System.out.println("Criando um contato, entre com as informa��es:");
		String nome = leInformacao("Entre com o nome", scan);
		String telefone = leInformacao("Entre com o telefone", scan);
		String email = leInformacao("Entre com o email", scan);

		Contato contato = new Contato(nome, telefone, email);

		int pos = leInformacaoInt("Entre com a posi��o a adicionar o contato", scan);

		try {
			lista.add(pos, contato);

			System.out.println("Contato adicionado com sucesso!");
			System.out.println(contato);

		} catch (Exception e) {
			System.out.println("Posi��o inv�lida, contato n�o adicionado");
		}
	}

	public static String leInformacao(String msg, Scanner scan) {

		System.out.println(msg);
		String entrada = scan.nextLine();

		return entrada;
	}

	public static void criarContatosDinamicamente(int quantidade, ArrayList<Contato> lista) throws Exception {

		Contato contato;

		for (int i = 1; i <= quantidade; i++) {

			contato = new Contato();
			contato.setNome("Contato " + i);
			contato.setTelefone("1111111" + i);
			contato.setEmail("contato" + i + "@email.com");

			lista.add(contato);
		}
	}
}
