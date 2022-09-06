package ejercicioClase;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class Puerto {
    private String nombrePuerto;
    private ArrayList<Contenedor> contenedores;

    public Puerto(String nombrePuerto) {
        this.nombrePuerto= nombrePuerto;
        this.contenedores = new ArrayList<>();

    }
    public void agregarContenedor(Contenedor contenedor){
        System.out.println("---------------------------------------------------------------------------");
        contenedores.add(contenedor);
        System.out.println("Se ha agregado el contenedor : "+contenedor+" a la lista de contenedores");

    }
    public void mostrarContenedoresOrdenados(){
        Collections.sort(contenedores);
        for (Contenedor contenedor:contenedores
             ) {
            System.out.println(contenedor);
            System.out.println("-----------------------------------------------------");
        }
    }
    public int cantPeligrososDesconocidos(){
        int resultado = 0;
        for (Contenedor contenedor:contenedores
             ) {
            if (contenedor.isPeligroso() && contenedor.getPais().equals("Desconocida")){
                resultado ++;
            }

        }
        return resultado;
    }
}
