package com.servicios;

import java.util.ArrayList;

public class Jugadores {
    private ArrayList<String> listaJugadores = new ArrayList<>();

    public void jugar() {
        listaJugadores.add("Jugador 1");
        listaJugadores.add("Jugador 2");
        listaJugadores.add("Jugador 3");

        Juego partida = new Juego(listaJugadores);
        partida.entregarCartas(5);

        for (int i = 0; i < listaJugadores.size(); i++) {
            int total = partida.devolverTotal(i);
            System.out.println("Jugador: " + listaJugadores.get(i) + " - Total: " + total);
        }

        String ganador = partida.determinarGanador(listaJugadores);
        System.out.println("El ganador es: " + ganador);
    }

    public static void main(String[] args) {
        new Jugadores().jugar();
    }

	public ArrayList<String> getListaJugadores() {
		return listaJugadores;
	}

	public void setListaJugadores(ArrayList<String> listaJugadores) {
		this.listaJugadores = listaJugadores;
	}
    
    
}