package com.krakedev.colecciones;

import java.util.ArrayList;

public class Ejercicio2 {

	public static void main(String[] args) {
		ArrayList<Persona> personas;
		personas = new ArrayList<Persona>();
		
		personas.add(new Persona("Leo", "Messi"));
		personas.add(new Persona("Juan", "Dando"));
		personas.add(new Persona("Pepe", "Liando"));
		
		for(int i=0; i<personas.size();i++) {
			System.out.println(personas.get(i).getNombre()+" "+personas.get(i).getApellido());
		}

	}

}
