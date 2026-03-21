package com.krakedev.sobrecarga;

public class Bienvenida {
	public void saludar(String nombre) {
		System.out.println("Hola "+nombre);
	}
	
	//La sobrecarga el el mismo nombre pero con distintos parametros
	public void saludar(String nombre, String apellido) {
		System.out.println("Hola "+nombre);
	}
}
