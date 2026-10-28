//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    ListaReproduccion lista = new ListaReproduccion("Favoritas");

    lista.agregarCancion("Canción A");
    lista.agregarCancion("Canción B");
    lista.agregarCancion("Canción C");

    System.out.println("Reproduciendo: " + lista.obtenerPistaActual());

    System.out.println("\n--- Hacia adelante (superando el límite) ---");
    lista.siguiente();
    System.out.println("Reproduciendo: " + lista.obtenerPistaActual());
    lista.siguiente();
    System.out.println("Reproduciendo: " + lista.obtenerPistaActual());
    lista.siguiente();
    System.out.println("Reproduciendo: " + lista.obtenerPistaActual());

    System.out.println("\n--- Hacia atrás (superando el límite) ---");
    lista.anterior();
    lista.anterior();
    System.out.println("Reproduciendo: " + lista.obtenerPistaActual());
    lista.anterior();
    System.out.println("Reproduciendo: " + lista.obtenerPistaActual());

}
