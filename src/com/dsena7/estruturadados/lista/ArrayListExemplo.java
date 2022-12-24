package com.dsena7.estruturadados.lista;

import java.util.ArrayList;

public class ArrayListExemplo {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		
		list.add("Diego");
		list.add("Nayara");
		list.add("Ryan");
		list.add("Ted");
		list.add("Santos FC");
		list.add("Java");
		list.add("Camel");
		
		System.out.println(list);
		
		list.remove(6);
		
		System.out.println(list);
		
		for (String string : list) {
			System.out.println("Item: " + string);
		}
		
		System.out.println("Index 0 = " + list.get(0));
		
		System.out.println("Tamanho da lista: " + list.size());
	}
}
