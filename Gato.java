public class Gato implements Observer {
    private String nombre;

    public Gato(String nombre){
        this.nombre = nombre;
    }

    @Override
    public void actualizar(String mensaje) {
        System.out.println(getNombre() + " corre!");
    }

    public String getNombre(){ return nombre;}
}
