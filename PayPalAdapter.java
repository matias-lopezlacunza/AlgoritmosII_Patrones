public class PayPalAdapter implements MetodoPago {
    // Composición: El adaptador "envuelve" la instancia de PayPal
    private PayPal payPal;

    public PayPalAdapter(PayPal payPal) {
        this.payPal = payPal;
    }

    @Override
    public void procesarPago(double monto) {
        // El adaptador traduce la llamada 'procesarPago' a 'realizarTransaccion'
        payPal.realizarTransaccion(monto);
    }
}
