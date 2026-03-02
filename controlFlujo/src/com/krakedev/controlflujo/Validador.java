package com.krakedev.controlflujo;

public class Validador {
	public void validarEdad(int edad) {
		if(edad >= 18) {
			System.out.println("Mayor de edad");
		}else if(edad>=12 && edad<18){
			System.out.println("Adolecente");
		}else {
			System.out.println("Niño");
		}
	}
}
