import java.util.ArrayList;
import java.util.List;

public class ListaReproduccion {

    private String nombre;
    private List<String> canciones;
    private int indiceActual;

    public ListaReproduccion(String nombre) {
        this.nombre = nombre;
        this.canciones = new ArrayList<>();
        this.indiceActual = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarCancion(String cancion) {

        if (cancion == null || cancion.trim().isEmpty()) {
            System.out.println("Canción rechazada: el nombre no puede estar vacío.");
            return;
        }

        canciones.add(cancion);
    }

    public boolean siguiente() {

        if (canciones.isEmpty()) {
            System.out.println("La lista está vacía.");
            return false;
        }

        if (indiceActual >= canciones.size() - 1) {
            System.out.println("Ya estás en la última pista, no hay siguiente.");
            return false;
        }

        indiceActual++;
        System.out.println("Siguiente pista.");
        return true;
    }

    public boolean anterior() {

        if (canciones.isEmpty()) {
            System.out.println("La lista está vacía.");
            return false;
        }

        if (indiceActual <= 0) {
            System.out.println("Ya estás en la primera pista, no hay anterior.");
            return false;
        }

        indiceActual--;
        System.out.println("Pista anterior.");
        return true;
    }

    public String obtenerPistaActual() {

        if (canciones.isEmpty()) {
            return null;
        }

        return canciones.get(indiceActual);
    }
}