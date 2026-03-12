package com.entidades;

import java.util.ArrayList;

public class Naipe {
	ArrayList<Numero> numerosPosibles;
	ArrayList<Carta> cartas;
	
	public Naipe() {
        this.numerosPosibles = new ArrayList<>();

        numerosPosibles.add(new Numero("A", 11));
        numerosPosibles.add(new Numero("2", 2));
        numerosPosibles.add(new Numero("3", 3));
        numerosPosibles.add(new Numero("4", 4));
        numerosPosibles.add(new Numero("5", 5));
        numerosPosibles.add(new Numero("6", 6));
        numerosPosibles.add(new Numero("7", 7));
        numerosPosibles.add(new Numero("8", 8));
        numerosPosibles.add(new Numero("9", 9));
        numerosPosibles.add(new Numero("10", 10));
        numerosPosibles.add(new Numero("J", 10));
        numerosPosibles.add(new Numero("Q", 10));
        numerosPosibles.add(new Numero("K", 10));
        
        
        Palos p = new Palos();
        String[] palosArray = {p.getCorazonRojo(), p.getCorazonNegro(), p.getDiamante(), p.getTrebol()};

        for (String palo : palosArray) {
            for (Numero num : numerosPosibles) {
                cartas.add(new Carta(num, palo));
            }
        }
        
    }
	
	public ArrayList<Carta> barajar() {
        ArrayList<Carta> auxiliar = new ArrayList<>();
        
        for (int i = 0; i < 100; i++) {
            int pos = Random.obtenerPosicion();
            Carta c = cartas.get(pos);
            if (c.getEstado().equals("N")) {
                auxiliar.add(c);
                c.setEstado("C");
            }
        }
        for (Carta c : cartas) {
            if (c.getEstado().equals("N")) {
                auxiliar.add(c);
                c.setEstado("C");
            }
        }
        return auxiliar;
    }
        
	
	public ArrayList<Carta> getCartas() {
		return cartas;
	}
}
