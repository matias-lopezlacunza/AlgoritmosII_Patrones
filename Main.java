public class Main{
    public static void main(String[] args){
        Banda Resto = new Banda("CUADRADITOS DE PARMESANO");

        SeguidorTwitter     usuario1 = new SeguidorTwitter("InfiernoAzul");
        SeguidorInstagram   usuario2 = new SeguidorInstagram("EstaLocura");
        SeguidorFanatico    usuario3 = new SeguidorFanatico("Juan sin rumbo");

        System.out.println("-------- PATRON DE DISEÑO OBSERVER -----------");
        System.out.println("");

        Resto.suscribir(usuario1);
        Resto.suscribir(usuario2);
        Resto.suscribir(usuario3);
        System.out.println("");

        Resto.anunciarRecital("General Juan Madariaga", "15 de diciembre de 2026");

        Resto.desuscribir(usuario3);

        System.out.println("");
        System.out.println("");
        System.out.println("-------- PATRON DE DISEÑO ADAPTER -----------");
        System.out.println("");

        // Sistema que espera una lista de reproductores
        Reproductor[] dispositivos = new Reproductor[2];

        // 1. Usamos el MiniComponente directamente
        dispositivos[0] = new MiniComponente();

        // 2. Usamos el Vinilo a través del Adaptador
        Vinilo viniloReal = new Vinilo();
        dispositivos[1] = new ViniloAdapter(viniloReal);

        // Ejecutamos ambos de la misma manera
        for (Reproductor r : dispositivos) {
            r.reproducir();
            r.pausar();
            System.out.println("-----------------------------");
        }
    }
}
