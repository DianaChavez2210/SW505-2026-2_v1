public class Main {
    public static void main(String[] args){
        MetodoPago pago1 = new PagoYape();
        MetodoPago pago2 = new PagoTarjeta();

        pago1.procesar(1500);
        pago2.procesar(12);
    }
}
