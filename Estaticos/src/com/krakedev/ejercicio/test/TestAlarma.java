package com.krakedev.ejercicio.test;

import java.util.ArrayList;

import com.krakedev.ejercicio.entidades.Alarma;
import com.krakedev.logica.AdminAlarma;
import com.krakedev.utils.DiaSemana;

public class TestAlarma {
	public static void main(String[] args) {
		
		AdminAlarma admin = new AdminAlarma();
		
		Alarma a1=new Alarma(DiaSemana.LUNER, 5, 0);
		Alarma a2=new Alarma(DiaSemana.MIERCOLES, 6, 50);
		Alarma a3=new Alarma(DiaSemana.VIERNES, 7, 14);
		Alarma a4=new Alarma(DiaSemana.DOMINGO, 6, 0);
		
		admin.agregarAlarma(a1);
		admin.agregarAlarma(a2);
		admin.agregarAlarma(a3);
		admin.agregarAlarma(a4);
		
		ArrayList<Alarma>alarmasActuales = admin.getAlarmas();
		System.out.println(alarmasActuales);
	}
}
