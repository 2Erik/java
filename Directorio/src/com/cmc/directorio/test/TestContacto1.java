package com.cmc.directorio.test;

import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContacto1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Telefono tel = new Telefono("movi", "098745895", 80);
		Contacto c = new Contacto("Erik", "Toapanta", tel, 200);
		
		System.out.println(c.getNombre());
		System.out.println(c.getApellido());
		System.out.println(c.getTelefono().getOperadora());
		System.out.println(c.getTelefono().getNumero());
		System.out.println(c.getTelefono().getCodigo());
		System.out.println(c.getPeso());
	}

}
