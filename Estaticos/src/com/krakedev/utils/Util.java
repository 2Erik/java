package com.krakedev.utils;

public class Util {
	public static String formatearHora(int numero) {
        if (numero < 10) {
            return "0" + numero;
        } else {
            return "" + numero;
        }
    }

    public static String formatearDia(int dia) {
        switch (dia) {
            case DiaSemana.LUNER:
                return "Lunes";
            case DiaSemana.MARTES:
                return "Martes";
            case DiaSemana.MIERCOLES:
                return "Miercoles";
            case DiaSemana.JUEVES:
                return "Jueves";
            case DiaSemana.VIERNES:
                return "Viernes";
            case DiaSemana.SABADO:
                return "Sabado";
            case DiaSemana.DOMINGO:
                return "Domingo";
            default:
                return "Dia invalido";
        }
    }
}
