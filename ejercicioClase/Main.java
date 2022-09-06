package ejercicioClase;

public class Main {
    public static void main(String[] args) {
        Contenedor c1 = new Contenedor(1,"Argentina",true);
        Contenedor c2 = new Contenedor(4,"Argentina",false);
        Contenedor c3 = new Contenedor(2,"Desconocida",true);
        Contenedor c4 = new Contenedor(5,"Desconocida",false);
        Contenedor c5 = new Contenedor(3,"Desconocida",true);

        Puerto puerto1 = new Puerto("Libertad");
        puerto1.agregarContenedor(c1);
        puerto1.agregarContenedor(c2);
        puerto1.agregarContenedor(c3);
        puerto1.agregarContenedor(c4);
        puerto1.agregarContenedor(c5);

        puerto1.mostrarContenedoresOrdenados();
        System.out.println("Cantidad de contenedores Peligrosos de origen desconocida: "+puerto1.cantPeligrososDesconocidos());
    }
}
