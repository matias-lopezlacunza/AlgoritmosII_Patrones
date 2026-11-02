public class TiendaOnline {
    public static void main(String[] args) {
        // Nuestra lista de métodos de pago permitidos por el sistema
        MetodoPago[] metodosDisponibles = new MetodoPago[2];

        // 1. Agregar Tarjeta de Crédito (Ya es compatible)
        metodosDisponibles[0] = new TarjetaCredito();

        // 2. Agregar PayPal (Usando el Adaptador para hacerlo compatible)
        PayPal payPalExterno = new PayPal();
        metodosDisponibles[1] = new PayPalAdapter(payPalExterno);

        // El sistema procesa ambos sin saber que uno es un adaptador
        System.out.println("--- Finalizando Compras ---");
        for (MetodoPago metodo : metodosDisponibles) {
            metodo.procesarPago(150.00);
        }
    }
}
