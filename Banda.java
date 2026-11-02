import java.util.ArrayList;

public class Banda{
    private String nombre;
    private ArrayList<Observer> seguidores;

    public Banda(String nombre){
        this.nombre = nombre;
        this.seguidores = new ArrayList<>();
    }

    public String getNombre() { return nombre;}

    public void suscribir(Observer seguidor){
        seguidores.add(seguidor);
        System.out.println(getNombre() + " ha ganado un suscriptor!");
    }

    public void desuscribir(Observer seguidor){
        seguidores.remove(seguidor);
        System.out.println(getNombre() + " ha perdido un suscriptor");
    }

    public void anunciarRecital(String ciudad, String fecha){
        System.out.println("----- ANUNCIO OFICIAL DE " + getNombre() + " ---------");
        String mensaje = "Atencion fans! Nuevo recital en " + ciudad + " el dia " + fecha + ". Avisaremos por este medio como conseguir entradas!";
        notificarSuscriptores(mensaje);
    }

    public void notificarSuscriptores(String mensaje){
        for (Observer seguidor : seguidores){
            seguidor.actualizar(mensaje);
        }
    }

}
