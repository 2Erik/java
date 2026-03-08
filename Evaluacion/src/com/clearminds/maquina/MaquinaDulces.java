package com.clearminds.maquina;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class MaquinaDulces {
	private Celda celda1 = new Celda("");
	private Celda celda2 = new Celda("");
	private Celda celda3 = new Celda("");
	private Celda celda4 = new Celda("");
	private double saldo;

	public void configurarMaquina(String c1, String c2, String c3, String c4) {
		celda1.setCodigo(c1);
		celda2.setCodigo(c2);
		celda3.setCodigo(c3);
		celda4.setCodigo(c4);
	}
	
	public void mostrarConfiguracion() {
		System.out.println("CELDA 1: "+celda1.getCodigo());
		System.out.println("Celda 2: "+celda2.getCodigo());
		System.out.println("Celda 3: "+celda3.getCodigo());
		System.out.println("Celda 4: "+celda4.getCodigo());
	}
	
	public Celda buscarCelda(String codigoCelda) {
		if(codigoCelda==celda1.getCodigo()) {
			return celda1;
		}else if (codigoCelda==celda2.getCodigo()) {
			return celda2;
		}else if (codigoCelda==celda3.getCodigo()) {
			return celda3;
		}else if (codigoCelda==celda4.getCodigo()) {
			return celda4;
		}else {
			return null;
		}
	}
	
	public void cargarProducto(Producto producto, String codigo, int cantidad) {
		Celda celdaRecuperada = buscarCelda(codigo);
		celdaRecuperada.ingresarProducto(producto, cantidad);
	}
	
	public void mostrarProductos() {

	    System.out.println("**********CELDA " + celda1.getCodigo());
	    System.out.println("Stock:" + celda1.getStock());
	    if(celda1.getProducto()!=null){
	        System.out.println("Nombre Producto:" + celda1.getProducto().getNombre());
	        System.out.println("Precio Producto:" + celda1.getProducto().getPrecio());
	        System.out.println("Código Producto:" + celda1.getProducto().getCodigo());
	    }else{
	        System.out.println("La celda no tiene producto!!!");
	    }

	    System.out.println("**********CELDA " + celda2.getCodigo());
	    System.out.println("Stock:" + celda2.getStock());
	    if(celda2.getProducto()!=null){
	        System.out.println("Nombre Producto:" + celda2.getProducto().getNombre());
	        System.out.println("Precio Producto:" + celda2.getProducto().getPrecio());
	        System.out.println("Código Producto:" + celda2.getProducto().getCodigo());
	    }else{
	        System.out.println("La celda no tiene producto!!!");
	    }

	    System.out.println("**********CELDA " + celda3.getCodigo());
	    System.out.println("Stock:" + celda3.getStock());
	    if(celda3.getProducto()!=null){
	        System.out.println("Nombre Producto:" + celda3.getProducto().getNombre());
	        System.out.println("Precio Producto:" + celda3.getProducto().getPrecio());
	        System.out.println("Código Producto:" + celda3.getProducto().getCodigo());
	    }else{
	        System.out.println("La celda no tiene producto!!!");
	    }

	    System.out.println("**********CELDA " + celda4.getCodigo());
	    System.out.println("Stock:" + celda4.getStock());
	    if(celda4.getProducto()!=null){
	        System.out.println("Nombre Producto:" + celda4.getProducto().getNombre());
	        System.out.println("Precio Producto:" + celda4.getProducto().getPrecio());
	        System.out.println("Código Producto:" + celda4.getProducto().getCodigo());
	    }else{
	        System.out.println("La celda no tiene producto!!!");
	    }

	    System.out.println("Saldo: " + saldo);
	}
	
	public Producto buscarProductoEnCelda(String codigo) {
		if(celda1.getCodigo()==codigo) {
			return celda1.getProducto();
		}
		if(celda2.getCodigo()==codigo) {
			return celda2.getProducto();
		}
		if(celda3.getCodigo()==codigo) {
			return celda3.getProducto();
		}
		if(celda4.getCodigo()==codigo) {
			return celda4.getProducto();
		}
		return null;
	}
	
	public double consultarPrecio(String codigo) {
		if (celda1.getCodigo()==codigo) {
			return celda1.getProducto().getPrecio();
		}
		if (celda2.getCodigo()==codigo) {
			return celda2.getProducto().getPrecio();
		}
		if (celda3.getCodigo()==codigo) {
			return celda3.getProducto().getPrecio();
		}
		if (celda4.getCodigo()==codigo) {
			return celda4.getProducto().getPrecio();
		}
		return 0.0;
	}
	
	public Celda buscarCeldaProducto(String codigo) {

	    if(celda1.getProducto()!=null && celda1.getProducto().getCodigo().equals(codigo)) {
	        return celda1;
	    } 
	    else if(celda2.getProducto()!=null && celda2.getProducto().getCodigo().equals(codigo)) {
	        return celda2;
	    } 
	    else if(celda3.getProducto()!=null && celda3.getProducto().getCodigo().equals(codigo)) {
	        return celda3;
	    } 
	    else if(celda4.getProducto()!=null && celda4.getProducto().getCodigo().equals(codigo)) {
	        return celda4;
	    }

	    return null;
	}
	
	public void incrementarProductos(String codigo, int cantidad) {
		Celda celdaEncontrada = buscarCeldaProducto(codigo);
		int stockActual = celdaEncontrada.getStock();
		celdaEncontrada.setStock(stockActual + cantidad);
	}
	
	public void vender(String codigo) {
		if(celda1.getCodigo()==codigo) {
			celda1.setStock(celda1.getStock()-1);
			double precio = celda1.getProducto().getPrecio();
			saldo = saldo+precio;
		}else if(celda2.getCodigo()==codigo) {
			celda2.setStock(celda2.getStock()-1);
			double precio = celda2.getProducto().getPrecio();
			saldo = saldo+precio;
		}else if(celda3.getCodigo()==codigo) {
			celda3.setStock(celda3.getStock()-1);
			double precio = celda3.getProducto().getPrecio();
			saldo = saldo+precio;
		}else if(celda4.getCodigo()==codigo) {
			celda4.setStock(celda4.getStock()-1);
			double precio = celda4.getProducto().getPrecio();
			saldo = saldo+precio;
		}
		mostrarProductos();
	}
	
	public double venderConCambio(String codigo, double valor) {
		if(celda1.getCodigo()==codigo) {
			celda1.setStock(celda1.getStock()-1);
			double precio = celda1.getProducto().getPrecio();
			saldo = saldo+precio;
			return valor - precio;
		}else if(celda2.getCodigo()==codigo) {
			celda2.setStock(celda2.getStock()-1);
			double precio = celda2.getProducto().getPrecio();
			saldo = saldo+precio;
			return valor - precio;
		}else if(celda3.getCodigo()==codigo) {
			celda3.setStock(celda3.getStock()-1);
			double precio = celda3.getProducto().getPrecio();
			saldo = saldo+precio;
			return valor - precio;
		}else if(celda4.getCodigo()==codigo) {
			celda4.setStock(celda4.getStock()-1);
			double precio = celda4.getProducto().getPrecio();
			saldo = saldo+precio;
			return valor - precio;
		}else {
			return valor;
		}
	}

	public Celda getCelda1() {
		return celda1;
	}

	public void setCelda1(Celda celda1) {
		this.celda1 = celda1;
	}

	public Celda getCelda2() {
		return celda2;
	}

	public void setCelda2(Celda celda2) {
		this.celda2 = celda2;
	}

	public Celda getCelda3() {
		return celda3;
	}

	public void setCelda3(Celda celda3) {
		this.celda3 = celda3;
	}

	public Celda getCelda4() {
		return celda4;
	}

	public void setCelda4(Celda celda4) {
		this.celda4 = celda4;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}
