package com.dsena7.estruturadados.vetor_array;

import java.util.Scanner;

import com.dsena7.estruturadados.lista.Lista;

public class ContatoService {

	public static void imprimirVetor(Lista<Contato> lista) {

		System.out.println(lista);
	}

	public static void limparVetor(Lista<Contato> lista) {

		lista.limpar();

		System.out.println("Todos os contatos do vetor foram exclu�dos");
	}

	public static void imprimeTamanhoVetor(Lista<Contato> lista) {

		System.out.println("Tamanho do vetor � de: " + lista.tamanho());
	}

	public static void excluirPorPosicao(Scanner scan, Lista<Contato> lista) {

		int pos = leInformacaoInt("Entre com a posi��o a ser removida", scan);

		try {

			lista.remove(pos);

			System.out.println("Contato exclu�do");

		} catch (Exception e) {
			System.out.println("Posi��o inv�lida!");
		}
	}

	public static void excluirContato(Scanner scan, Lista<Contato> lista) {

		int pos = leInformacaoInt("Entre com a posi��o a ser removida", scan);

		try {

			Contato contato = (Contato) lista.busca(pos);

			lista.busca(contato);

			System.out.println("Contato exclu�do");

		} catch (Exception e) {
			System.out.println("Posi��o inv�lida!");
		}
	}

	public static void pesquisarContatoExiste(Scanner scan, Lista<Contato> lista) {

		int pos = leInformacaoInt("Entre com a posi��o a ser pesquisada", scan);

		try {

			Contato contato = (Contato) lista.busca(pos);

			boolean existe = lista.contem(contato);

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

	public static void pesquisarUltimoIndice(Scanner scan, Lista<Contato> lista) {

		int pos = leInformacaoInt("Entre com a posi��o a ser pesquisada", scan);

		try {

			Contato contato = (Contato) lista.busca(pos);

			System.out.println("Contato existe, seguem dados:");
			System.out.println(contato);

			System.out.println("Fazendo pesquisa do �ltimo �ndice do contato encontrado:");
			pos = lista.busca(contato);

			System.out.println("Contato encontrado na posi��o " + pos);

		} catch (Exception e) {
			System.out.println("Posi��o inv�lida!");
		}
	}

	public static void obtemContato(Scanner scan, Lista<Contato> lista) {

		int pos = leInformacaoInt("Entre com a posi��o a ser pesquisada", scan);

		try {

			Contato contato = (Contato) lista.busca(pos);

			System.out.println("Contato existe, seguem dados:");
			System.out.println(contato);

			System.out.println("Fazendo pesquisa do contato encontrado:");
			pos = lista.busca(contato);

			System.out.println("Contato encontrado na posi��o " + pos);

		} catch (Exception e) {
			System.out.println("Posi��o inv�lida!");
		}
	}

	public static void obtemContatoPosicao(Scanner scan, Lista<Contato> lista) {

		int pos = leInformacaoInt("Entre com a posi��o a ser pesquisada", scan);

		try {

			Contato contato = (Contato) lista.busca(pos);

			System.out.println("Contato existe, seguem dados:");
			System.out.println(contato);

		} catch (Exception e) {
			System.out.println("Posi��o inv�lida!");
		}
	}

	public static void adicionarContatoFinal(Scanner scan, Lista<Contato> lista) throws Exception {

		System.out.println("Criando um contato, entre com as informa��es:");
		String nome = leInformacao("Entre com o nome", scan);
		String telefone = leInformacao("Entre com o telefone", scan);
		String email = leInformacao("Entre com o email", scan);

		Contato contato = new Contato(nome, telefone, email);

		lista.adiciona(contato);

		System.out.println("Contato adicionado com sucesso!");
		System.out.println(contato);
	}

	public static void adicionarContatoPosicao(Scanner scan, Lista<Contato> lista) {

		System.out.println("Criando um contato, entre com as informa��es:");
		String nome = leInformacao("Entre com o nome", scan);
		String telefone = leInformacao("Entre com o telefone", scan);
		String email = leInformacao("Entre com o email", scan);

		Contato contato = new Contato(nome, telefone, email);

		int pos = leInformacaoInt("Entre com a posi��o a adicionar o contato", scan);

		try {
			lista.adiciona(pos, contato);

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

	public static int leInformacaoInt(String msg, Scanner scan) {

		boolean entradaValida = false;
		int num = 0;

		while (!entradaValida) {

			try {

				System.out.println(msg);
				String entrada = scan.nextLine();

				num = Integer.parseInt(entrada);

				entradaValida = true;

			} catch (Exception e) {
				System.out.println("Entrada inv�lida, digite novamente");
			}
		}

		return num;
	}

	public static int obterOpcaoMenu(Scanner scan) {

		boolean entradaValida = false;
		int opcao = 0;
		String entrada;

		while (!entradaValida) {

			System.out.println("Digite a op��o desejada:");
			System.out.println("1: Adiciona contato no final do vetor");
			System.out.println("2: Adiciona contato em uma posi��o espec�fica");
			System.out.println("3: Obt�m contato de uma posi��o espec�fica");
			System.out.println("4: Consulta contato");
			System.out.println("5: Consulta �ltimo �ndide do contato");
			System.out.println("6: Verifica se contato existe");
			System.out.println("7: Excluir por posi��o");
			System.out.println("8: Excluir contato");
			System.out.println("9: Verifica tamanho do vetor");
			System.out.println("10: Excluir todos os contatos do vetor");
			System.out.println("11: Imprime vetor");
			System.out.println("0: Sair");

			try {

				entrada = scan.nextLine();
				opcao = Integer.parseInt(entrada);

				if (opcao >= 0 && opcao <= 11) {
					entradaValida = true;
				} else {
					throw new Exception();
				}

			} catch (Exception e) {

				System.out.println("Entrada inv�lida, digite novamente\n\n");
			}
		}

		return opcao;
	}

	public static void criarContatosDinamicamente(int quantidade, Lista<Contato> lista) throws Exception {

		Contato contato;

		for (int i = 1; i <= quantidade; i++) {

			contato = new Contato();
			contato.setNome("Contato " + i);
			contato.setTelefone("1111111" + i);
			contato.setEmail("contato" + i + "@email.com");

			lista.adiciona(contato);
		}
	}
}
