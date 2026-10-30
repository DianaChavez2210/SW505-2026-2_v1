package pago;

public interface MetodoPago{
    void procesar(double monto);
    String nombre(); 
}
