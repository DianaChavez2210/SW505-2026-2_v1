public class Docente {
    private int cod_docente;
    private String nombres;
    
    public Docente(int cod, String name) {
        this.cod_docente = cod;
        this.nombres = name;
    }

    public int getCod_docente() {
        return cod_docente;
    }

    public void setCod_docente(int cod_docente) {
        this.cod_docente = cod_docente;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    @Override
    public String toString() {
        return "Docente{" + "cod_docente=" + cod_docente + ", nombres=" + nombres + '}';
    }
    
}