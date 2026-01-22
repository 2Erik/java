package com.krakedev;

public class TestCalculadora {

	public static void main(String[] args) {
		Calculadora calcu;
		int resultadoSuma;
		int resultadoResta;
		double resultadoMultiplicar;
		double resultadoDividir;
		double resultadoPromedio;
		
		calcu = new Calculadora();
		
		calcu.suma(5, 8);
		resultadoSuma = calcu.suma(8, 3);
		resultadoResta = calcu.resta(5, 2);
		resultadoMultiplicar = calcu.multiplicar(2.4, 2);
		resultadoDividir = calcu.dividir(7, 3);
		resultadoPromedio = calcu.promedio(8, 3, 8);
		calcu.mostarResultado();
		
		
		
		System.out.println("RESULTADO SUMA: "+resultadoSuma);
		System.out.println("RESULTADO RESTA: "+resultadoResta);
		System.out.println("RESULTADO MULTIPLICACION: "+resultadoMultiplicar);
		System.out.println("RESULTADO DIVIDIR: "+resultadoDividir);
		System.out.println("RESULTADO PROMEDIO: "+resultadoPromedio);
	}

}
