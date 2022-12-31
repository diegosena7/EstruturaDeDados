package com.dsena7.estruturadados.grafos;

import java.util.ArrayList;

/*
 * Um Grafo é constituído por um conjunto de vértices, um conjunto de arestas e uma função de incidência.
 * Grafos normalmente são representados graficamente por diagramas, onde os vértices são pontos e as arestas são linhas
 * (ou setas, no caso dos dígrafos) que ligam os pontos dos respectivos vértices envolvidos no relacionamento.
 * 
 * Os vértices são elementos, inter-relacionados de alguma forma, pertencentes a um conjunto discreto (enumerável).
 * As arestas são elementos de um conjunto discreto que descrevem, de alguma forma, as relações entre os vértices do grafo.
 * A função de incidência é uma função que mapeia, para cada aresta do grafo, um par de vértices envolvidos no relacionamento.
 */
public class Grafo<T> {
	
	public static void main(String[] args) {
		
		Grafo<String> grafo = new Grafo<>();
		grafo.adicionarVertice("João");
		grafo.adicionarVertice("Lorenzo");
		grafo.adicionarVertice("Creuza");
		grafo.adicionarVertice("Créber");
		grafo.adicionarVertice("Cráudio");
		
		grafo.adicionarAresta(2.0, "João", "Lorenzo");
		grafo.adicionarAresta(3.0, "Lorenzo", "Créber");
		grafo.adicionarAresta(1.0, "Créber", "Creuza");
		grafo.adicionarAresta(1.0, "João", "Creuza");
		grafo.adicionarAresta(2.0, "Cráudio", "Lorenzo");
		grafo.adicionarAresta(3.0, "Cráudio", "João");
		
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
    
    //Neste exemplo ao obter o valor devemos marcar o mesmo, usamos a variável marcados para tal
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
                if (!marcados.contains(proximo)){ //se o vértice ainda não foi marcado
                    marcados.add(proximo);
                    System.out.println(proximo.getDado());
                    fila.add(proximo);
                }
            }
            fila.remove(0);
        }
    }
}
