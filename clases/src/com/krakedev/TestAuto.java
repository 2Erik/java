package com.krakedev;

public class TestAuto {

	public static void main(String[] args) {
		Auto auto1=new Auto();
		Auto auto2=new Auto();
		
		auto1.marca="Toyota";
		auto1.anio=2015;
		auto1.precio=28000;
		
		auto2.marca="Ford";
		auto2.anio=2020;
		auto2.precio=45000;
		
		System.out.println("Marcar auto 1: "+auto1.marca);
		System.out.println("Anio auto 1: "+auto1.anio);
		System.out.println("Precio auto 1: "+auto1.precio);
		
		System.out.println("-----------");
		
		System.out.println("Marcar auto 2: "+auto2.marca);
		System.out.println("Anio auto 2: "+auto2.anio);
		System.out.println("Precio auto 2: "+auto2.precio);

	}

}
