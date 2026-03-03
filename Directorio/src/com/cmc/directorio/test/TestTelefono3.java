package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefonio;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Telefono t1 = new Telefono("movi", "0987456123", 45);
		Telefono t2 = new Telefono("movi", "0987476123", 30);
		Telefono t3 = new Telefono("movi", "0987555523", 15);
		
		AdminTelefonio ad = new AdminTelefonio();
		int numeroMovi = ad.contarMovi(t1, t2, t3);
		System.out.println(numeroMovi);
	}

}
