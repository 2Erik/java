package com.krakedev;

public class Rectangulo {
	public int base;
	public int altura;
	
	public int calcularArea() {
		int area;
		area = base * altura;
		return area;
	}
	
	public double calcularPerimetro() {
		return 2*(base + altura);
	}
}
