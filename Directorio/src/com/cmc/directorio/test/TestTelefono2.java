package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefonio;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Telefono tel=new Telefono("movi", "098234234", 20);
		AdminTelefonio at=new AdminTelefonio();
		at.activarMensajeria(tel);
		
		System.out.println(tel.getCodigo());
		System.out.println(tel.getNumero());
		System.out.println(tel.getOperadora());
		System.out.println(tel.isTieneWhatsapp());
	}

}
