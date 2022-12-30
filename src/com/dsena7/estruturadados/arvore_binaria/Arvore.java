package com.dsena7.estruturadados.arvore_binaria;

import com.dsena7.estruturadados.estruturabase.Elemento;

public class Arvore<T extends Comparable<T>> {

	public static void main(String[] args) {
		Arvore<Integer> arvore = new Arvore<>();
		arvore.adicionarElemento(10);
		arvore.adicionarElemento(8);
		arvore.adicionarElemento(5);
		arvore.adicionarElemento(9);
		arvore.adicionarElemento(7);
		arvore.adicionarElemento(18);
		arvore.adicionarElemento(13);
		arvore.adicionarElemento(20);

		System.out.println("Em ordem: ");
		arvore.percorreRaizEmOrdem(arvore.getRaiz());

//		System.out.println("\nEm pre ordem: ");
//		arvore.percorreRaizEmPreOrdem(arvore.getRaiz());
//
//		System.out.println("\nEm pos ordem: ");
//		arvore.percorreRaizEmPosOrdem(arvore.getRaiz());

		arvore.remover(20);

		System.out.println("\n\nEm-ordem");
		arvore.percorreRaizEmOrdem(arvore.getRaiz());

		arvore.remover(5);

		System.out.println("\n\nEm-ordem");
		arvore.percorreRaizEmOrdem(arvore.getRaiz());

		arvore.remover(8);

		System.out.println("\n\nEm-ordem");
		arvore.percorreRaizEmOrdem(arvore.getRaiz());

		arvore.remover(9);

		System.out.println("\n\nEm-ordem");
		arvore.percorreRaizEmOrdem(arvore.getRaiz());

		arvore.remover(13);

		System.out.println("\n\nEm-ordem");
		arvore.percorreRaizEmOrdem(arvore.getRaiz());

		arvore.remover(7);
		arvore.remover(18);

		System.out.println("\n\nEm-ordem");
		arvore.percorreRaizEmOrdem(arvore.getRaiz());

		arvore.remover(10);

		System.out.println("\n\nEm-ordem");
		arvore.percorreRaizEmOrdem(arvore.getRaiz());
	}

	private Elemento<T> raiz;

	public Arvore() {
		super();
	}

	public Arvore(Elemento<T> raiz) {
		this.raiz = null;
	}

	public Elemento<T> getRaiz() {
		return this.raiz;
	}

	public void percorreRaizEmOrdem(Elemento<T> elementoAtual) {
		if (elementoAtual != null) {
			percorreRaizEmOrdem(elementoAtual.getEsquerda());
			System.out.println(elementoAtual.getValor());
			percorreRaizEmOrdem(elementoAtual.getDireita());
		}
	}

	public void percorreRaizEmPreOrdem(Elemento<T> elementoAtual) {
		if (elementoAtual != null) {
			System.out.println(elementoAtual.getValor());
			percorreRaizEmPreOrdem(elementoAtual.getEsquerda());
			percorreRaizEmPreOrdem(elementoAtual.getDireita());
		}
	}

	public void percorreRaizEmPosOrdem(Elemento<T> elementoAtual) {
		if (elementoAtual != null) {
			percorreRaizEmPosOrdem(elementoAtual.getEsquerda());
			percorreRaizEmPosOrdem(elementoAtual.getDireita());
			System.out.println(elementoAtual.getValor());
		}
	}

	public void adicionarElemento(T valorElemento) {
		Elemento<T> novoElemento = new Elemento<T>(valorElemento);

		if (raiz == null) {
			this.raiz = novoElemento;
		} else {
			Elemento<T> atual = this.raiz;
			while (true) {
				if (novoElemento.getValor().compareTo(atual.getValor()) == -1) {
					if (atual.getEsquerda() != null) {
						atual = atual.getEsquerda();
					} else {
						atual.setEsquerda(novoElemento);
						break;
					}
				} else { // se for maior ou igual
					if (atual.getDireita() != null) {
						atual = atual.getDireita();
					} else {
						atual.setDireita(novoElemento);
						break;
					}
				}
			}
		}
	}

	public boolean remover(T valor) {
		// buscar o elemento na árvore
		Elemento<T> atual = this.raiz;
		Elemento<T> paiAtual = null;
		while (atual != null) {
			if (atual.getValor().equals(valor)) {
				break;
			} else if (valor.compareTo(atual.getValor()) == -1) { // valor procurado é menor que o atual
				paiAtual = atual;
				atual = atual.getEsquerda();
			} else {
				paiAtual = atual;
				atual = atual.getDireita();
			}
		}
		// verifica se existe o elemento
		if (atual != null) {

			// elemento tem 2 filhos ou elemento tem somente filho à direita
			if (atual.getDireita() != null) {

				Elemento<T> substituto = atual.getDireita();
				Elemento<T> paiSubstituto = atual;
				while (substituto.getEsquerda() != null) {
					paiSubstituto = substituto;
					substituto = substituto.getEsquerda();
				}
				substituto.setEsquerda(atual.getEsquerda());
				if (paiAtual != null) {
					if (atual.getValor().compareTo(paiAtual.getValor()) == -1) { // atual < paiAtual
						paiAtual.setEsquerda(substituto);
					} else {
						paiAtual.setDireita(substituto);
					}
				} else { // se não tem paiAtual, então é a raiz
					this.raiz = substituto;
					paiSubstituto.setEsquerda(null);
					this.raiz.setDireita(paiSubstituto);
					this.raiz.setEsquerda(atual.getEsquerda());
				}

				// removeu o elemento da árvore
				if (substituto.getValor().compareTo(paiSubstituto.getValor()) == -1) { // substituto < paiSubstituto
					paiSubstituto.setEsquerda(null);
				} else {
					paiSubstituto.setDireita(null);
				}

			} else if (atual.getEsquerda() != null) { // tem filho só à esquerda
				Elemento<T> substituto = atual.getEsquerda();
				Elemento<T> paiSubstituto = atual;
				while (substituto.getDireita() != null) {
					paiSubstituto = substituto;
					substituto = substituto.getDireita();
				}
				if (paiAtual != null) {
					if (atual.getValor().compareTo(paiAtual.getValor()) == -1) { // atual < paiAtual
						paiAtual.setEsquerda(substituto);
					} else {
						paiAtual.setDireita(substituto);
					}
				} else { // se for a raiz
					this.raiz = substituto;
				}

				// removeu o elemento da árvore
				if (substituto.getValor().compareTo(paiSubstituto.getValor()) == -1) { // substituto < paiSubstituto
					paiSubstituto.setEsquerda(null);
				} else {
					paiSubstituto.setDireita(null);
				}
			} else { // não tem filho
				if (paiAtual != null) {
					if (atual.getValor().compareTo(paiAtual.getValor()) == -1) { // atual < paiAtual
						paiAtual.setEsquerda(null);
					} else {
						paiAtual.setDireita(null);
					}
				} else { // é a raiz
					this.raiz = null;
				}
			}
			return true;
		} else {
			return false;
		}
	}
}