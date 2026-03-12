package com.krakedev.evaluacion;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Directorio {
	private ArrayList<Contacto> contactos = new ArrayList<Contacto>();
	private Date fechaDate;
	
	public boolean agregarContacto(Contacto contacto) {
			
			Contacto existe=buscarPorCedula(contacto.getCedula());
			
			if(existe == null) {
				contactos.add(contacto);
				fechaDate = new Date();
				return true;
			}else {
				return true;
			}
		}
	
	public Contacto buscarPorCedula(String contacto) {
		for(int i=0;i<contactos.size();i++) {
			if(contacto.equalsIgnoreCase(contactos.get(i).getCedula())) {
				return contactos.get(i);
			}
		}
		
		return null;
	}
	
	public String consultarUltimaModificacion() {
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		
		return simpleDateFormat.format(fechaDate);
	}
	
	public int contarPerdidos() {

		int contador = 0;

		for(int i = 0; i < contactos.size(); i++) {

			if(contactos.get(i).getDireccion() == null) {
				contador++;
			}
		}
		return contador;
	}
	
	
	public ArrayList<Contacto> getContactos() {
		return contactos;
	}
	public void setContactos(ArrayList<Contacto> contactos) {
		this.contactos = contactos;
	}
}
