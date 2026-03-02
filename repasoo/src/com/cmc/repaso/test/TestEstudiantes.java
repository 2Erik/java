package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Estudiantes;

public class TestEstudiantes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Estudiantes e = new Estudiantes("Erik");
		e.calificar(0);
		
		System.out.println(e.getResultado());
	}

}
