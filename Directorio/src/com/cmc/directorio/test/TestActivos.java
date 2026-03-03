package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestActivos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Telefono t1 = new Telefono("movi", "0995246378", 0);
		Contacto c1 = new Contacto("Erik", "Toapanta", t1, 530);
		AdminContactos adc = new AdminContactos();
		
		System.out.println("Tiene Whatsapp: "+c1.getTelefono().isTieneWhatsapp());
		adc.activarUsuario(c1);
		System.out.println("Esta activo: "+c1.isActivo());
	}

}
