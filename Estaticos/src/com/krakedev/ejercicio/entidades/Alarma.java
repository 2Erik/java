package com.krakedev.ejercicio.entidades;

import com.krakedev.utils.Util;

public class Alarma {
 private int dia;
 private int hora;
 private int minutos;
 
 public Alarma(int dia, int hora, int minutos) {
	super();
	this.dia = dia;
	this.hora = hora;
	this.minutos = minutos;
 }
 
 

 public int getDia() {
	return dia;
 }

 public void setDia(int dia) {
	this.dia = dia;
 }

 public int getHora() {
	return hora;
 }

 public void setHora(int hora) {
	this.hora = hora;
 }

 public int getMinutos() {
	return minutos;
 }

 public void setMinutos(int minutos) {
	this.minutos = minutos;
 }



 @Override
 public String toString() {
	 return Util.formatearDia(dia) + ", "
	            + Util.formatearHora(hora) + ":"
	            + Util.formatearHora(minutos);
 }
 
 
 
}
