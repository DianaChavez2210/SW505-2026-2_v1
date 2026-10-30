public class Alumno {
    private String cod_alum;
    private String nombres;
    private int ciclo_relat;
    private int estado;

    public Alumno(String cod_alum, String nombres, int ciclo_relat, int estado) {
        this.cod_alum = cod_alum;
        this.nombres = nombres;
        this.ciclo_relat = ciclo_relat;
        this.estado = estado;
    }

    public String getCod_alum() {
        return cod_alum;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public int getCiclo_relat() {
        return ciclo_relat;
    }

    public void setCiclo_relat(int ciclo_relat) {
        this.ciclo_relat = ciclo_relat;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Alumno{" + "cod_alum=" + cod_alum + ", nombres=" + nombres + ", ciclo_relat=" + ciclo_relat + ", estado=" + estado + '}';
    }
    
}