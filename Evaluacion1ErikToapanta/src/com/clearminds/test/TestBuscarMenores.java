package com.clearminds.test;

import java.util.ArrayList;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;
import com.clearminds.maquina.MaquinaDulces;

public class TestBuscarMenores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaquinaDulces maquina=new MaquinaDulces();
		ArrayList<Producto> productosMenores;
		maquina.agregarCelda(new Celda("A1"));
		maquina.agregarCelda(new Celda("A2"));
		maquina.agregarCelda(new Celda("B1"));
		maquina.agregarCelda(new Celda("B2"));
		
		Producto producto=new Producto("KE34","Papitas",0.85);
		maquina.cargarProducto(producto, "A1", 4);
		
		Producto producto2=new Producto("D456","Doritos",0.70);
		maquina.cargarProducto(producto2, "A2", 6);
		
		Producto producto3=new Producto("D456","Doritos",2);
		maquina.cargarProducto(producto3, "B1", 6);
		
		Producto producto4=new Producto("D456","Doritos",1.5);
		maquina.cargarProducto(producto4, "B2", 6);
		
		productosMenores=maquina.buscarMenores(2);
		for(int i=0;i<productosMenores.size();i++) {
			System.out.println("Nombre: "+productosMenores.get(i).getNombre()+" "+productosMenores.get(i).getPrecio());
		}
	}

}
