public class SeguidorTwitter implements Observer{
    private String nombre;

    public SeguidorTwitter(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){ return nombre;}

    @Override
    public void actualizar(String mensaje){
        System.out.println("@" + getNombre() + " (Twitter): Retweeteando: " + mensaje);
    }
}
