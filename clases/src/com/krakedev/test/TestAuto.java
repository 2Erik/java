package com.krakedev.test;

public class TestAuto {

	public static void main(String[] args) {
		Auto auto1=new Auto();
		Auto auto2=new Auto();
		
		auto1.setMarca("Toyota");
		auto1.setAnio(2025);
		auto1.setPrecio(28000);
		
		auto2.setMarca("Ford");
		auto2.setAnio(2020);
		auto2.setPrecio(48000);
		
		System.out.println("Marcar auto 1: "+auto1.getMarca());
		System.out.println("Anio auto 1: "+auto1.getAnio());
		System.out.println("Precio auto 1: "+auto1.getPrecio());
		
		System.out.println("-----------");
		
		System.out.println("Marcar auto 2: "+auto2.getMarca());
		System.out.println("Anio auto 2: "+auto2.getAnio());
		System.out.println("Precio auto 2: "+auto2.getPrecio());

	}

}
