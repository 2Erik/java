package com.krakedev;

public class Encapsulamiento {
	private int anio;
	private int mes;
	private int dia;
	
	//Constructores
	public Encapsulamiento(int anio) {
		this.anio = anio;
	}
	
	public Encapsulamiento(int anio, int mes, int dia) {
		this.anio = anio;
		this.mes =  mes;
		this.dia = dia;
	}
	//Metodos getters and setters
	public int getAnio() {
		return anio;
	}
	public void setAnio(int anio) {
		this.anio = anio;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	
}
