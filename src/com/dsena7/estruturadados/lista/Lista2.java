package com.dsena7.estruturadados.lista;

import java.lang.reflect.Array;

import com.dsena7.estruturadados.estruturabase.EstruturaEstatica;

public class Lista2<T> extends EstruturaEstatica<T>{

	private T[] elementos; 
	private int tamanho;

	//Usamos o construtor herdado da classe EstruturaEstatica chamando o super() da Superclasse
	public Lista2(){
		super();
	}
	
	//Usamos o construtor herdado da classe EstruturaEstatica chamando o super() da Superclasse
	public Lista2(int capacidade){
		super(capacidade);
	}
	
	public boolean adicionaElemento(T elemento) {
		return super.adicionaElemento(elemento);
	}

	public boolean adicionaElementoPorPosicao(int posicao, T elemento) {
		return super.adicionaElementoPorPosicao(posicao, elemento);

	}
}