public class MiniComponente implements Reproductor {
    @Override
    public void reproducir() {
        System.out.println("Reproduciendo música desde el MiniComponente (MP3).");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando el MiniComponente.");
    }
}
