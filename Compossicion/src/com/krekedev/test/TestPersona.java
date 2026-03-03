package com.krekedev.test;

import com.krakedev.composicion.Direccion;
import com.krakedev.composicion.Persona;

public class TestPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona p1=new Persona();
		Direccion dir=new Direccion();
		
		p1.setNombre("Erik");
		p1.setApellido("Toapanta");
		dir.setCallePrincipal("Av Siempre viva");
		dir.setCalleSecundaria("La que cruza");
		dir.setNumero("N-47");
		p1.setDireccion(dir);
		
		
		String nombre =p1.getNombre();
		Direccion d1=p1.getDireccion();
		
		System.out.println(nombre);
		System.out.println(d1.getCallePrincipal());
	}

}
