package com.ctd.b3.java.semana6.clase16;

public class Jugador implements Comparable<Jugador>{
    private String nombre;
    private int numeroCamiseta;
    private boolean lesionado;
    private boolean titular;

    public Jugador(String nombre, int numeroCamiseta, boolean lesionado, boolean titular) {
        this.nombre = nombre;
        this.numeroCamiseta = numeroCamiseta;
        this.lesionado = lesionado;
        this.titular = titular;
    }


    @Override
    public int compareTo(Jugador o) {
        /*
        int resultado = 0;
        if(numeroCamiseta>o.numeroCamiseta)
            resultado = 1;
        else if (numeroCamiseta<o.numeroCamiseta)
            resultado = -1;

        return resultado;

         */

        return Integer.compare(numeroCamiseta, o.numeroCamiseta);
    }

    public boolean isLesionado() {
        return lesionado;
    }

    public boolean isTitular() {
        return titular;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumeroCamiseta() {
        return numeroCamiseta;
    }

    @Override
    public String toString() {
        return "Jugador " +
                "nombre='" + nombre + '\n' +
                ", numeroCamiseta=" + numeroCamiseta + '\n' +
                ", lesionado=" + lesionado + '\n' +
                ", titular=" + (titular ? "Titular": "Suplente") ;
    }
}
