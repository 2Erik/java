package com.krakedev.test;

public class TestCuadrado {

	public static void main(String[] args) {
		Cuadrado c1 = new Cuadrado(5);
		Cuadrado c2 = new Cuadrado(3);
		Cuadrado c3 = new Cuadrado(12);
		
		System.out.println("Area 1: "+c1.calcularArea());
		System.out.println("Area 2: "+c2.calcularArea());
		System.out.println("Area 3: "+c3.calcularArea());
		System.out.println("Perimetro 1: "+c1.calcularPerimetro());
		System.out.println("Perimetro 2: "+c2.calcularPerimetro());
		System.out.println("Perimetro 3: "+c3.calcularPerimetro());

	}

}
