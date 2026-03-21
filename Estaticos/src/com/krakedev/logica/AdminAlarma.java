package com.krakedev.logica;

import java.util.ArrayList;

import com.krakedev.ejercicio.entidades.Alarma;

public class AdminAlarma {
	private ArrayList<Alarma> alarmas;
	
	public AdminAlarma() {
		alarmas = new ArrayList<Alarma>();
	}
	
	public void agregarAlarma(Alarma alarma) {
		alarmas.add(alarma);
	}

	public ArrayList<Alarma> getAlarmas() {
		return alarmas;
	}
}
