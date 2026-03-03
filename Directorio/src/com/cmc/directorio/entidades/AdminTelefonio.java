package com.cmc.directorio.entidades;

public class AdminTelefonio {
	public void activarMensajeria(Telefono telefono) {
		if(telefono.getOperadora()=="movi") {
			telefono.setTieneWhatsapp(true);
		}
	}
	
	public int contarMovi(Telefono t1, Telefono t2, Telefono t3) {
		int contador = 0;
		if(t1.getOperadora()=="movi") {
			contador++;
		}
		if(t2.getOperadora()=="movi") {
			contador++;
		}
		if(t3.getOperadora()=="movi") {
			contador++;
		}
		return contador;
	}
	
	public int contarClaro(Telefono t1, Telefono t2, Telefono t3, Telefono t4) {
		int contador = 0;
		if(t1.getOperadora()=="claro") {
			contador++;
		}
		if(t2.getOperadora()=="claro") {
			contador++;
		}
		if(t3.getOperadora()=="claro") {
			contador++;
		}
		if(t4.getOperadora()=="claro") {
			contador++;
		}
		return contador;
	}
}
