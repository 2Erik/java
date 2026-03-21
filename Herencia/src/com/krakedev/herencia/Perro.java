package com.krakedev.herencia;

public class Perro extends Animal {
	
	public Perro() {
		System.out.println("Constructor animal");
	}
	
	// con extends hereda los metodos de Animal
	public void ladrar() {
		System.out.println("Guauuu");
	}
	
	@Override
	public void dormir() {
		//Reutilizar lo q hace dormir de la super clase
		super.dormir();
		System.out.println("Perro duerme");
	}
}
