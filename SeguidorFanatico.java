public class SeguidorFanatico implements Observer{
    private String nombre;

    public SeguidorFanatico(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){ return nombre;}

    @Override
    public void actualizar(String mensaje){
        System.out.println(getNombre() + " (Fanatico): Gritando de alegria!: " + mensaje);
    }
}
