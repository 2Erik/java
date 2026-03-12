package com.krakedev.evaluacion;

public class Telefono {
	private String numero;
	private String tipo;
	 private String estado;
	 
	 
	 
	 public Telefono(String numero, String tipo) {
		 this.numero = numero;
			this.tipo = tipo;

			if(numero == null || tipo == null) {
				estado = "E";
				return;
			}

			if(!tipo.equals("Movil") && !tipo.equals("Convencional")) {
				estado = "E";
				return;
			}

			if(tipo.equals("Movil") && numero.length() != 10) {
				estado = "E";
				return;
			}

			if(tipo.equals("Convencional") && numero.length() != 7) {
				estado = "E";
				return;
			}

			estado = "C";
	}
	 public String getNumero() {
		 return numero;
	 }
	 public void setNumero(String numero) {
		 this.numero = numero;
	 }
	 public String getTipo() {
		 return tipo;
	 }
	 public void setTipo(String tipo) {
		 this.tipo = tipo;
	 }
	 public String getEstado() {
		 return estado;
	 }
	 public void setEstado(String estado) {
		 this.estado = estado;
	 }
}
