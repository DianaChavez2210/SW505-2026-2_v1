public class Periodo {
    private int periodo;
    private String descripcion;

    public Periodo(int periodo, String descripcion) {
        this.periodo = periodo;
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Periodo{" + "periodo=" + periodo + ", descripcion=" + descripcion + '}';
    }
    
}