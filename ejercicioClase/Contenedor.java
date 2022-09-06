package ejercicioClase;

import java.util.Collection;

public class Contenedor implements Comparable<Contenedor>{
    private int id;
    private String pais;
    private boolean peligroso;

    public Contenedor(int id, String pais, boolean soyPeligroso) {
        this.id = id;
        this.pais = pais;
        this.peligroso = soyPeligroso;
    }

    @Override
    public String toString() {
        return "Contenedor" + '\n' +
                "ID : " + id + '\n' +
                "Pais de origen : " + pais + '\n' +
                "Peligrosidad: " + (peligroso? "Alta":"Baja" );

    }

    public String getPais() {
        return pais;
    }

    public boolean isPeligroso() {
        return peligroso;
    }

    @Override
    public int compareTo(Contenedor o) {
        return Integer.compare(id,o.id);
    }
}
