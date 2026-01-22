package com.krakedev;

public class TestCalculadora {

	public static void main(String[] args) {
		Calculadora calcu;
		int resultadoSuma;
		int resultadoResta;
		
		calcu = new Calculadora();
		calcu.suma(5, 8);
		resultadoSuma = calcu.suma(8, 3);
		resultadoResta = calcu.resta(5, 2);
		
		
		System.out.println("RESULTADO SUMA: "+resultadoSuma);
		System.out.println("RESULTADO RESTA: "+resultadoResta);
	}

}
