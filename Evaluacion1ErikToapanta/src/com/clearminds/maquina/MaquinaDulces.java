package com.clearminds.maquina;

import java.util.ArrayList;
import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class MaquinaDulces {
	private ArrayList<Celda> celdas = new ArrayList<Celda>();
	private double saldo;

	public void agregarCelda(Celda codigo) {
		celdas.add(codigo);
	}

	public void mostrarConfiguracion() {
		for (int i = 0; i < celdas.size(); i++) {
			System.out.println("Celda " + (i + 1) + ": " + celdas.get(i).getCodigo());
		}
	}

	public Celda buscarCelda(String codigo) {
		for (int i = 0; i < celdas.size(); i++) {
			if (codigo.equals(celdas.get(i).getCodigo())) {
				return celdas.get(i);
			}
		}
		return null;
	}

	public void cargarProducto(Producto producto, String codigo, int items) {
		Celda celdaRecuperada = buscarCelda(codigo);
		if (celdaRecuperada != null) {
			celdaRecuperada.ingresarProducto(producto, items);
		} else {
			System.out.println("La celda no existe");
		}
	}

	public void mostrarProductos() {
		Celda elementoCelda;
		for (int i = 0; i < celdas.size(); i++) {
			elementoCelda = celdas.get(i);
			if (elementoCelda.getProducto() != null) {
				System.out.println("Celda: " + elementoCelda.getCodigo() + " Stock: " + elementoCelda.getStock()
						+ " Producto: " + elementoCelda.getProducto().getCodigo() + " Precio: "
						+ elementoCelda.getProducto().getPrecio());
			}else {
				System.out.println("Celda: " + elementoCelda.getCodigo() + " Stock: " + elementoCelda.getStock()
				+ " Sin producto asignado");
			}
		}
		System.out.println("Saldo "+saldo);
	}
	
	public Producto buscarProductoEnCelda(String codigo) {
		for(int i=0;i<celdas.size();i++) {
			if(codigo.equals(celdas.get(i).getCodigo())) {
				return celdas.get(i).getProducto();
			}
		}
		return null;
	}
	
	public double consultarPrecio(String codigo) {
		for(int i=0;i<celdas.size();i++) {
			if(codigo.equals(celdas.get(i).getCodigo())) {
				return celdas.get(i).getProducto().getPrecio();
			}
		}
		return 0.0;
	}
	
	public Celda buscarCeldaProducto(String codigo) {
		for(int i=0;i<celdas.size();i++) {
			if(celdas.get(i).getProducto()!=null) {
				if(codigo.equals(celdas.get(i).getProducto().getCodigo())) {
					return celdas.get(i);
				}
			}
		}
		return null;
	}
	
	public void incrementarProductos(String codigo, int items) {
		Celda celdaEncontrada = buscarCeldaProducto(codigo);
		celdaEncontrada.setStock(items+celdaEncontrada.getStock());
	}
	
	public void vender(String codigo) {
		for(int i=0;i<celdas.size();i++) {
			if(codigo.equals(celdas.get(i).getCodigo())) {
				celdas.get(i).setStock(celdas.get(i).getStock()-1);
				saldo+=celdas.get(i).getProducto().getPrecio();
			}
		}
	}
	
	public double venderConCambio(String codigo, double valor) {
		double cambio=0.0;
		for(int i=0;i<celdas.size();i++) {
			if(codigo.equals(celdas.get(i).getCodigo())) {
				celdas.get(i).setStock(celdas.get(i).getStock()-1);
				saldo+=celdas.get(i).getProducto().getPrecio();
				if(valor>celdas.get(i).getProducto().getPrecio()) {
					cambio=valor-celdas.get(i).getProducto().getPrecio();
					return cambio;
				}
			}
		}
		return cambio;
	}
	
	public ArrayList<Producto> buscarMenores(double limite){
		ArrayList<Producto> mayore = new ArrayList<Producto>();
		Producto elemento;
		for (int i=0;i<celdas.size();i++) {
			elemento = celdas.get(i).getProducto();
			if(elemento.getPrecio()<limite) {
				mayore.add(elemento);
			}
		}
		
		return mayore;
	}
}
