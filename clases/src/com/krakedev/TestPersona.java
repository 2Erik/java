package com.krakedev;

public class TestPersona {

	public static void main(String[] args) {
		Persona p; //Persona es el tipo de dato la clase que creamos
		Persona p2 = new Persona();
		p=new Persona(); // Crear un objeto persona
		
		System.out.println("nombre: "+p.getNombre());
		System.out.println("edad: "+p.getEdad());
		System.out.println("estatura: "+p.getEstatura());
		System.out.println("------------------------");
		
		p2.setNombre("Erik");
		System.out.println("p.nombre: "+p.getNombre());
		System.out.println("p2.nombre: "+p2.getNombre());
		
		p.setNombre("Jessica");
		p.setEdad(26);
		p.setEstatura(1.63);
		
		System.out.println("-----------------------");
		System.out.println("nombre: "+p.getNombre());
		System.out.println("edad: "+p.getEdad());
		System.out.println("estatura: "+p.getEstatura());
	}

}
