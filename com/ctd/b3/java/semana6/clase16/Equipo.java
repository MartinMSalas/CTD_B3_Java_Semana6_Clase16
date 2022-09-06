package com.ctd.b3.java.semana6.clase16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Equipo {
    private String nombre;
    private List<Jugador> jugadores; // = new ArrayList<>();

    public Equipo(String nombre) {
        this.nombre = nombre;
        this.jugadores = new ArrayList<>();
    }

    public  void agregarJugador(Jugador jugador){
        jugadores.add(jugador);
        System.out.println("El jugador "+jugador.getNombre()+" ha sido incorporado al equipo");
    }

    public void mostrarJugadoresTitulares(){
        Collections.sort(jugadores);
        for (Jugador j:jugadores
             ) {
            if (j.isLesionado() && j.isTitular()){
                System.out.println(j);
            }

        }
    }

    public int cantidadJugadoresTitularesLesionados(){
        int cantidad = 0;
        for (Jugador J:jugadores
             ) {
            cantidad ++;

        }
        return cantidad;
    }
}
