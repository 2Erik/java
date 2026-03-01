package com.krakedev.demo.test;

import com.krakedev.demo.Producto;

public class TestProducto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Producto p = new Producto(12, "Pera");
		
		p.setDescripcion("Sana");
		p.setPeso(1);
		
		System.out.println("Codigo: "+p.getCodigo());
		System.out.println("Nombre: "+p.getNombre());
		System.out.println("Descripcion: "+p.getDescripcion());
		System.out.println("Peso: "+p.getPeso());
	}

}
