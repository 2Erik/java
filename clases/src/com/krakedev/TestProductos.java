package com.krakedev;

public class TestProductos {

	public static void main(String[] args) {
		Productos productoA = new Productos();
		Productos productoB = new Productos();
		Productos productoC = new Productos();
		
		Productos productoD = new Productos("Pera", 0.35);
		
		System.out.println("Cnstructor: "+productoD.getNombre());
		System.out.println("----------------------");
		
		productoA.setNombre("Condones");
		productoA.setDescripcion("Con textura");
		productoA.setPrecio(2.50);
		productoA.setStockActual(20);
		
		productoB.setNombre("Nivea");
		productoB.setDescripcion("Crema hidratante");
		productoB.setPrecio(5.60);
		productoB.setStockActual(24);
		
		productoC.setNombre("Guantes");
		productoC.setDescripcion("Latex");
		productoC.setPrecio(1.00);
		productoC.setStockActual(40);
		
		System.out.println("Nombre: "+productoA.getNombre());
		System.out.println("Descripcion: "+productoA.getDescripcion());
		System.out.println("Precio: "+productoA.getPrecio());
		System.out.println("Stock: "+productoA.getStockActual());
		
		System.out.println("------------------");
		
		System.out.println("Nombre: "+productoB.getNombre());
		System.out.println("Descripcion: "+productoB.getDescripcion());
		System.out.println("Precio: "+productoB.getPrecio());
		System.out.println("Stock: "+productoB.getStockActual());
		
		System.out.println("------------------");
		
		System.out.println("Nombre: "+productoC.getNombre());
		System.out.println("Descripcion: "+productoC.getDescripcion());
		System.out.println("Precio: "+productoC.getPrecio());
		System.out.println("Stock: "+productoC.getStockActual());
	}

}
