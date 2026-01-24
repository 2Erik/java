package com.krakedev;

public class TestEncapsulamiento {

	public static void main(String[] args) {
		Encapsulamiento fecha = new Encapsulamiento();
		fecha.setAnio(2000);
		fecha.setMes(12);
		fecha.setDia(12);
		
		System.out.println("MES: "+fecha.getMes());
	}

}
