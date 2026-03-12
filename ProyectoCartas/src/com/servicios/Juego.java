package com.servicios;

import java.util.ArrayList;

import com.entidades.Carta;
import com.entidades.Naipe;

public class Juego {
    private Naipe naipe;
    private ArrayList<Carta> naipeBarajado;
    private ArrayList<ArrayList<Carta>> cartasJugadores;

    public Juego(ArrayList<String> idsJugadores) {
        this.naipe = new Naipe();
        this.naipeBarajado = naipe.barajar();
        this.cartasJugadores = new ArrayList<>();
        for (int i = 0; i < idsJugadores.size(); i++) {
            cartasJugadores.add(new ArrayList<Carta>());
        }
    }

    public void entregarCartas(int cartasPorJugador) {
        int indiceCarta = 0;
        for (int i = 0; i < cartasPorJugador; i++) {
            for (int j = 0; j < cartasJugadores.size(); j++) {
                if (indiceCarta < naipeBarajado.size()) {
                    cartasJugadores.get(j).add(naipeBarajado.get(indiceCarta));
                    indiceCarta++;
                }
            }
        }
    }

    public int devolverTotal(int idJugador) {
        int suma = 0;
        ArrayList<Carta> mano = cartasJugadores.get(idJugador);
        for (Carta c : mano) {
            suma += c.getNumero().getValor();
        }
        return suma;
    }

    public String determinarGanador(ArrayList<String> nombres) {
        String idGanador = nombres.get(0);
        int sumaGanador = devolverTotal(0);

        for (int i = 1; i < nombres.size(); i++) {
            int sumaActual = devolverTotal(i);
            if (sumaActual >= sumaGanador) {
                sumaGanador = sumaActual;
                idGanador = nombres.get(i);
            }
        }
        return idGanador;
    }

    public ArrayList<ArrayList<Carta>> getCartasJugadores() { return cartasJugadores; }
}
