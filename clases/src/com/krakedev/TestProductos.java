package com.krakedev;

public class TestProductos {

	public static void main(String[] args) {
		Productos productoA = new Productos();
		Productos productoB = new Productos();
		Productos productoC = new Productos();
		
		productoA.nombre="Condones";
		productoA.descripcion="Con textura";
		productoA.precio=2.50;
		productoA.stockActual=20;
		
		productoB.nombre="Nivea";
		productoB.descripcion="Crema hidratante";
		productoB.precio=5.60;
		productoB.stockActual=24;
		
		productoC.nombre="Guantes";
		productoC.descripcion="Guantes de latex";
		productoC.precio=1.00;
		productoC.stockActual=40;
		
		System.out.println("Nombre: "+productoA.nombre);
		System.out.println("Descripcion: "+productoA.descripcion);
		System.out.println("Precio: "+productoA.precio);
		System.out.println("Stock: "+productoA.stockActual);
		
		System.out.println("------------------");
		
		System.out.println("Nombre: "+productoB.nombre);
		System.out.println("Descripcion: "+productoB.descripcion);
		System.out.println("Precio: "+productoB.precio);
		System.out.println("Stock: "+productoB.stockActual);
		
		System.out.println("------------------");
		
		System.out.println("Nombre: "+productoC.nombre);
		System.out.println("Descripcion: "+productoC.descripcion);
		System.out.println("Precio: "+productoC.precio);
		System.out.println("Stock: "+productoC.stockActual);
	}

}
