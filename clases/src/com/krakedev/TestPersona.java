package com.krakedev;

public class TestPersona {

	public static void main(String[] args) {
		Persona p; //Persona es el tipo de dato la clase que creamos
		Persona p2 = new Persona();
		
		p=new Persona(); // Crear un objeto persona
		System.out.println("nombre: "+p.nombre);
		System.out.println("nombre: "+p.edad);
		System.out.println("nombre: "+p.estatura);
		System.out.println("------------------------");
		
		p2.nombre="Erik";
		System.out.println("p.nombre: "+p.nombre);
		System.out.println("p2.nombre: "+p2.nombre);
		
		p.nombre="Jessica";
		p.edad=26;
		p.estatura=1.63;
		
		System.out.println("-----------------------");
		System.out.println("nombre: "+p.nombre);
		System.out.println("nombre: "+p.edad);
		System.out.println("nombre: "+p.estatura);
	}

}
