package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefonio;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Telefono t1 = new Telefono("movi", "0987456123", 45);
		Telefono t2 = new Telefono("claro", "0987476123", 30);
		Telefono t3 = new Telefono("claro", "0987555523", 15);
		Telefono t4 = new Telefono("claro", "098777523", 5);
		
		AdminTelefonio ad = new AdminTelefonio();
		int numeroClaro = ad.contarClaro(t1, t2, t3, t4);
		System.out.println(numeroClaro);
	}

}
