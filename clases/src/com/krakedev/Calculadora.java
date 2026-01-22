package com.krakedev;

public class Calculadora {
	
	public int suma(int valor1, int valor2) {
		int resultado =  valor1 + valor2;
		return resultado;
	}
	
	public int resta(int valor1, int valor2) {
		int resultado = valor1 - valor2;
		return resultado;
	}
	
	public double multiplicar(double valor1, double valor2) {
		return valor1 * valor2;
	}
	
	public double dividir(double valor1, double valor2) {
		return valor1 / valor2;
	}
	
	public double promedio(double valor1, double valor2, double valor3) {
		double promedio = (valor1 + valor2 + valor3)/3;
		return promedio;
	}
	
	public void mostarResultado() {
		System.out.println("Ahora no joven, Sali al almuerzo. Regreso en 15 minutos");
	}

}
