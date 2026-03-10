package com.krakedev.colecciones;

import java.util.ArrayList;

public class TestAdminPersonas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdminPersonas adminPersonas = new AdminPersonas();
		adminPersonas.agregar(new Persona("Erik", "T",25));
		adminPersonas.agregar(new Persona("Hulk", "T",50));
		adminPersonas.agregar(new Persona("Capitan", "T",45));
		
		adminPersonas.imprimir();
		Persona p1 = adminPersonas.buscarPersona("Erik");
		
		if (p1!=null) {
			System.out.println("Encontrado: "+p1.getNombre());
		}else {
			System.out.println("La persona no EXISTE");
		}
		
		ArrayList<Persona> personasMayores = adminPersonas.buscarMayores(30);
		
		System.out.println(personasMayores.size());
		
	}

}
