public class SeguidorInstagram implements Observer{
    private String nombre;

    public SeguidorInstagram(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){ return nombre;}

    @Override
    public void actualizar(String mensaje){
        System.out.println("@" + getNombre() + " (Instagram): Subiendo historia: " + mensaje);
    }
}
