package descuento;

public interface EstrategiaDescuento {
    double aplicar(double subtototal);
    String descripcion();
}
