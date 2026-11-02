public class ViniloAdapter implements Reproductor {
    // Composición: El adaptador envuelve el objeto Vinilo
    private Vinilo vinilo;

    public ViniloAdapter(Vinilo vinilo) {
        this.vinilo = vinilo;
    }

    @Override
    public void reproducir() {
        // El adaptador traduce la llamada de la interfaz a los métodos del objeto real
        vinilo.subirAguja();
        vinilo.girarDisco();
        System.out.println("El vinilo ahora está sonando.");
    }

    @Override
    public void pausar() {
        System.out.println("Deteniendo el movimiento del vinilo.");
    }
}