public class EjercicioPracticaObserver {
    public static void main(String[] args){
        Perro bobby = new Perro("Bobby");
        Gato mancha = new Gato("Mancha");
        Gato roberto = new Gato("Roberto");

        bobby.suscribir(mancha);
        bobby.suscribir(roberto);

        bobby.despertar();

        bobby.dormir();
    }
}
