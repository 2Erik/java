package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Item;

public class TestItem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Item i = new Item();
		i.setProductosActuales(20);
		
		i.imprimir();
		System.out.println("---------------");
		i.vender(8);
		i.devolver(4);
		i.imprimir();
	}

}
