package com.krakedev;

public class TestEncapsulamiento {

	public static void main(String[] args) {
		Encapsulamiento fecha1 = new Encapsulamiento(2000);
		Encapsulamiento fecha2 = new Encapsulamiento(2015, 12, 11);
		
		System.out.println("MES: "+fecha2.getMes());
	}

}
