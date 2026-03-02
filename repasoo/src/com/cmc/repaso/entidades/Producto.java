package com.cmc.repaso.entidades;

public class Producto {
	private String nombre;
	private double precio;
	//CONSTRUCTOR
	public Producto(String nombre, double precio) {
		this.nombre=nombre;
		this.precio=precio;
	}
	//METODOS
	public double calcularPrecioPromo(int descuento) {
		return precio * (100-descuento)/100;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		if(precio>=0) {
			this.precio = precio;
		}else {
			this.precio = precio*-1;
		}
		
	}
}
