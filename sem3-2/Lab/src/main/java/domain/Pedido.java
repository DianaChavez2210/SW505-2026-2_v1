package domain;

import descuento.EstrategiaDescuento;
import pago.MetodoPago;
import notificacion.Notificador;

public class Pedido {
    private final EstrategiaDescuento estrategia;
    private final MetodoPago metodoPago;
    private final Notificador notificador;
    // DI por constructor: los colaboradores llegan desde fuera
    public Pedido(EstrategiaDescuento estrategia, MetodoPago metodoPago, Notificador notificador) {
        this.estrategia = estrategia;
        this.metodoPago = metodoPago;
        this.notificador = notificador; 
    }
    public double procesar(double subtotal) {
        double total = estrategia.aplicar(subtotal);
        metodoPago.procesar(total);
        return total;
    }
    public void enviar(String destinatario, String mensaje){
        notificador.enviar(destinatario, mensaje);
    }
}
