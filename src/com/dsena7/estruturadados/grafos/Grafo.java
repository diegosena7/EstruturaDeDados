package com.dsena7.estruturadados.grafos;

import java.util.ArrayList;

/*
 * Um Grafo � constitu�do por um conjunto de v�rtices, um conjunto de arestas e uma fun��o de incid�ncia.
 * Grafos normalmente s�o representados graficamente por diagramas, onde os v�rtices s�o pontos e as arestas s�o linhas
 * (ou setas, no caso dos d�grafos) que ligam os pontos dos respectivos v�rtices envolvidos no relacionamento.
 * 
 * Os v�rtices s�o elementos, inter-relacionados de alguma forma, pertencentes a um conjunto discreto (enumer�vel).
 * As arestas s�o elementos de um conjunto discreto que descrevem, de alguma forma, as rela��es entre os v�rtices do grafo.
 * A fun��o de incid�ncia � uma fun��o que mapeia, para cada aresta do grafo, um par de v�rtices envolvidos no relacionamento.
 */
public class Grafo<T> {
	
	public static void main(String[] args) {
		
		Grafo<String> grafo = new Grafo<>();
		grafo.adicionarVertice("Jo�o");
		grafo.adicionarVertice("Lorenzo");
		grafo.adicionarVertice("Creuza");
		grafo.adicionarVertice("Cr�ber");
		grafo.adicionarVertice("Cr�udio");
		
		grafo.adicionarAresta(2.0, "Jo�o", "Lorenzo");
		grafo.adicionarAresta(3.0, "Lorenzo", "Cr�ber");
		grafo.adicionarAresta(1.0, "Cr�ber", "Creuza");
		grafo.adicionarAresta(1.0, "Jo�o", "Creuza");
		grafo.adicionarAresta(2.0, "Cr�udio", "Lorenzo");
		grafo.adicionarAresta(3.0, "Cr�udio", "Jo�o");
		
		grafo.buscaEmLargura();
	}

	private ArrayList<Vertice<T>> vertices;
    private ArrayList<Aresta<T>> arestas;
    
    public Grafo(){
        this.vertices = new ArrayList<Vertice<T>>();
        this.arestas = new ArrayList<Aresta<T>>();
    }
    
    public void adicionarVertice(T dado){
        Vertice<T> novoVertice = new Vertice<T>(dado);
        this.vertices.add(novoVertice);
    }
    
    public void adicionarAresta(Double peso, T dadoInicio, T dadoFim){
        Vertice<T> inicio = this.getVertice(dadoInicio);
        Vertice<T> fim = this.getVertice(dadoFim);
        Aresta<T> aresta = new Aresta<T>(peso, inicio, fim);
        inicio.adicionarArestaSaida(aresta);
        fim.adicionarArestaEntrada(aresta);
        this.arestas.add(aresta);
    }
    
    public Vertice<T> getVertice(T dado){
        Vertice<T> vertice = null;
        for(int i=0; i < this.vertices.size(); i++){
            if (this.vertices.get(i).getDado().equals(dado)){
                vertice = this.vertices.get(i);
                break;
            }
        }
        return vertice;
    }
    
    //Neste exemplo ao obter o valor devemos marcar o mesmo, usamos a vari�vel marcados para tal
    public void buscaEmLargura(){
        ArrayList<Vertice<T>> marcados = new ArrayList<Vertice<T>>();
        ArrayList<Vertice<T>> fila = new ArrayList<Vertice<T>>();
        Vertice<T> atual = this.vertices.get(0);
        marcados.add(atual);
        System.out.println(atual.getDado());
        fila.add(atual);
        while(fila.size() > 0){
            Vertice<T> visitado = fila.get(0);
            for(int i=0; i < visitado.getArestasSaida().size(); i++){
                Vertice<T> proximo = visitado.getArestasSaida().get(i).getFim();
                if (!marcados.contains(proximo)){ //se o v�rtice ainda n�o foi marcado
                    marcados.add(proximo);
                    System.out.println(proximo.getDado());
                    fila.add(proximo);
                }
            }
            fila.remove(0);
        }
    }
}
