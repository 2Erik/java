package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContactos2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Telefono t1 = new Telefono("movi", "0995246378", 0);
		Telefono t2 = new Telefono("claro", "0995247778", 10);
		Contacto c1 = new Contacto("Erik", "Toapanta", t1, 530);
		Contacto c2 = new Contacto("Jessica", "Tagua", t2, 333);
		
		AdminContactos adc = new AdminContactos();
		
		Contacto masPesado = adc.buscarMasPeso(c1, c2);
		System.out.println(masPesado.getNombre());
		System.out.println(masPesado.getApellido());
		System.out.println(masPesado.getPeso());
		System.out.println(masPesado.getTelefono().getCodigo());
		System.out.println(masPesado.getTelefono().getNumero());
		System.out.println(masPesado.getTelefono().getOperadora());
		
		boolean sonIguales = adc.compararOperadoras(c1, c2);
		System.out.println("Son iguales: "+sonIguales);
	}

}
