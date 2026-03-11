package com.krakedev.entidades;

import java.util.ArrayList;

public class Curso {
	private ArrayList<Estudiante> estudiantes=new ArrayList<Estudiante>();
	
	public Estudiante buscarEstudiantePorCedula(Estudiante estudiante) {
		
		for(int i=0;i<estudiantes.size();i++) {
			if(estudiantes.get(i).getCedula().equals(estudiante.getCedula())) {
				return estudiantes.get(i);
			}
		}
		
		return null;
	}
	
	public void matricularEstudiante(Estudiante estudiante) {
		boolean existe=false;
		for(int i=0;i<estudiantes.size();i++) {
			if(estudiantes.get(i).getCedula().equals(estudiante.getCedula())){
				existe = true;
			}
		}
		if(!existe) {
			estudiantes.add(estudiante);
		}else {
			System.out.println("El estudiante ya existe");
		}
	}
	
	public double calcularPromedioCurso() {
		double suma=0;
		for(int i=0;i<estudiantes.size();i++) {
			suma = estudiantes.get(i).calcularPromedioNotasEstudiante();
		}
		return suma/estudiantes.size();
	}

	public void mostrar() {
		for(int i=0;i<estudiantes.size();i++) {
			System.out.println(estudiantes.get(i).getNombre()+" Promedio: "+estudiantes.get(i).calcularPromedioNotasEstudiante());
		}
	}
	
	public ArrayList<Estudiante> getEstudiantes() {
		return estudiantes;
	}

	public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
		this.estudiantes = estudiantes;
	}
	
	
}
