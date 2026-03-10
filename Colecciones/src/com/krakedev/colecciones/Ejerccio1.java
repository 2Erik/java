package com.krakedev.colecciones;

import java.util.ArrayList;

public class Ejerccio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> cadenas;
		String valorRecuperado;
		cadenas = new ArrayList<String>();
		
		System.out.println(cadenas.size());
		
		cadenas.add("uno");
		cadenas.add("dos");
		
		System.out.println(cadenas.size());
		valorRecuperado = cadenas.get(0);
		System.out.println(valorRecuperado);
		
		for (int i = 0; i<cadenas.size();i++) {
			System.out.println(cadenas.get(i));
			
		}
	}

}
