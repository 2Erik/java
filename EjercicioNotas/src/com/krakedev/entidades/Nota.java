package com.krakedev.entidades;

public class Nota {
	private Materia materia;
	private double nota;
	
	
	
	public Nota(Materia materia, double nota) {
		this.materia = materia;
		this.nota = nota;
	}


	public void mostrar() {
		System.out.println("Materia: "+materia.getNombre()+" Codigo: "+materia.getCodigo()+" Nota: "+nota);
	}
	
	
	public Materia getMateria() {
		return materia;
	}


	public void setMateria(Materia materia) {
		this.materia = materia;
	}


	public double getNota() {
		return nota;
	}
	public void setNota(double nota) {
		this.nota = nota;
	}
	
}
