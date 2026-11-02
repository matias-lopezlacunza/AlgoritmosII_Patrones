import java.util.ArrayList;

public class Perro {
    private String nombre;
    private Boolean dormido;
    private ArrayList<Observer> seguidores;

    public Perro(String nombre){
        this.nombre = nombre;
        this.dormido = true;
        this.seguidores = new ArrayList<>();
    }

    public void despertar(){
        if (dormido) { this.dormido = false;}
        System.out.println(nombre + " se desperto!");
        avisar(dormido);
    }

    public void dormir(){
        if (!dormido) {dormido = true;}
    }

    public void suscribir(Gato gato){
        seguidores.add(gato);
        System.out.println(gato.getNombre() + " esta mirando el perro.");
    }

    public void desuscribir(Gato gato){
        seguidores.remove(gato);
        System.out.println(gato.getNombre() + " dejo de mirar.");
    }

    public void avisar(Boolean dormido){
        for (Observer Gato : seguidores){
            Gato.actualizar("Se desperto!");
        }
    }
}
