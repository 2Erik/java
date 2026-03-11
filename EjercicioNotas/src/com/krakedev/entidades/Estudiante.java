package com.krakedev.entidades;

import java.util.ArrayList;

public class Estudiante {
	private String nombre;
	private String apellido;
	private String cedula;
	private ArrayList<Nota> notas=new ArrayList<Nota>();
	
	

	public Estudiante(String cedula, String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.cedula = cedula;
	}

	public void agregarNota(Nota nuevaNota) {
		if (nuevaNota.getNota() > 0 && nuevaNota.getNota() <= 10) {
			boolean existe = false;
			for (int i = 0; i < notas.size(); i++) {
				if (nuevaNota.getMateria().getCodigo()
						.equals(notas.get(i).getMateria().getCodigo())) {
					existe = true;
					break;
				}
			}
			if(!existe) {
				notas.add(nuevaNota);
			}else {
				System.out.println("La materia ya tiene nota");
			}
		} else {
			System.out.println("Nota invalida");
		}
	}
	
	public void modificarNota(String codigo, double nuevaNota) {
		for(int i=0;i<notas.size();i++) {
			if(notas.get(i).getMateria().getCodigo().equals(codigo)) {
				if(nuevaNota>0 && nuevaNota<=10) {
					notas.get(i).setNota(nuevaNota);
				}else {
					System.out.println("Nota invalida");
				}
			}else {
				System.out.println("La materia no existe");
			}
		}
	}
	
	public double calcularPromedioNotasEstudiante() {
		
		double promedio=0;
		double suma=0;
		for(int i=0;i<notas.size();i++) {
			suma+=notas.get(i).getNota();
		}
		promedio=suma/notas.size();
		
		return promedio;
	}
	
	public void mostrar () {
		for(int i=0;i<notas.size();i++) {
			System.out.println(nombre+" "+notas.get(i).getMateria()+" "+notas.get(i).getNota());
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public ArrayList<Nota> getNotas() {
		return notas;
	}

	public void setNotas(ArrayList<Nota> notas) {
		this.notas = notas;
	}

}
