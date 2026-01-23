package com.krakedev;

public class TestRectangulo {

	public static void main(String[] args) {
		Rectangulo r1 = new Rectangulo();
		Rectangulo r2 = new Rectangulo();
		
		int areaR1;
		int areaR2;
		double perimetroR1;
		double perimetroR2;
		
		r1.base = 10;
		r1.altura = 5;
		
		r2.base = 8;
		r2.altura = 3;
		
		perimetroR1 = r1.calcularPerimetro();
		System.out.println("Perimetro rectangulo 1: "+perimetroR1);
		
		perimetroR2 = r2.calcularPerimetro();
		System.out.println("Perimetro rectangulo 2: "+perimetroR2);
		
		areaR2 = r2.calcularArea();
		System.out.println("Area del rectangulo 1: "+areaR2);
		
		areaR1 = r1.calcularArea();
		System.out.println("Area del rectangulo 2: "+areaR1);
	}

}
