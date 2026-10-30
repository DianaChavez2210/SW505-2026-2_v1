package domain;
import descuento.DescuentoVip;
import notificacion.NotificadorEmail;
import pago.PagoYape;

public class Main {
    public static void main(String[] args) {
        Pedido pedido = new Pedido(new DescuentoVip(), new PagoYape(), new NotificadorEmail());
        pedido.procesar(200.0); // VIP 15% + Yape
        pedido.enviar("Jorge","su pedido fue procesado" );

    }
}
