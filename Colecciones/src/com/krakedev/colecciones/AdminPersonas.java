package com.krakedev.colecciones;

import java.util.ArrayList;

public class AdminPersonas {
	private ArrayList<Persona> personas;
	
	public AdminPersonas() {
		personas = new ArrayList<Persona>();
	}
	
	public void agregar(Persona persona) {
		personas.add(persona);
	}
	public void imprimir() {
		Persona elementoPersona;
		for(int i=0;i<personas.size();i++) {
			elementoPersona = personas.get(i);
			System.out.println(elementoPersona.getNombre()+" "+elementoPersona.getEdad());
		}
	}
	public Persona buscarPersona(String nombre) {
		Persona elelmtoPersona = null;
		Persona personaEncontrada = null;
		for(int i=0;i<personas.size();i++) {
			elelmtoPersona = personas.get(i);
			if(nombre.equals(elelmtoPersona.getNombre())) {
				personaEncontrada = elelmtoPersona;
			}
		}
		
		return personaEncontrada;
	}
	
	public ArrayList<Persona> buscarMayores(int edad){
		ArrayList<Persona> mayores = new ArrayList<Persona>();
		Persona elemtoPersona = null;
		for(int i=0;i<personas.size();i++) {
			elemtoPersona = personas.get(i);
			if(elemtoPersona.getEdad()>edad) {
				mayores.add(elemtoPersona);
			}
		}
		
		return mayores;
	}
}
