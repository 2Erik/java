package com.krakedev.estaticos;

public class Calculos {
	//coloco un final para crear constantes
	private final double IVA = 12;
	
	public double calcularIva(double monto) {
		return monto*IVA/100;
	}
}
