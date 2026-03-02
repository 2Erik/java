package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Producto;

public class TestProducto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Producto p = new Producto("Pera", 5);
		p.setPrecio(-10);
		
		System.out.println(p.getPrecio());
		System.out.println(p.calcularPrecioPromo(30));
	}

}
