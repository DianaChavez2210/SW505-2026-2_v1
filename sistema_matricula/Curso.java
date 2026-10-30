public class Curso {
    private int cod_curso;
    private String nom_curso;
    private int nro_creditos;

    public Curso(int cod_curso, String nom_curso, int nro_creditos) {
        this.cod_curso = cod_curso;
        this.nom_curso = nom_curso;
        this.nro_creditos = nro_creditos;
    }

    public int getCod_curso() {
        return cod_curso;
    }

    public void setCod_curso(int cod_curso) {
        this.cod_curso = cod_curso;
    }

    public String getNom_curso() {
        return nom_curso;
    }

    public void setNom_curso(String nom_curso) {
        this.nom_curso = nom_curso;
    }

    public int getNro_creditos() {
        return nro_creditos;
    }

    public void setNro_creditos(int nro_creditos) {
        this.nro_creditos = nro_creditos;
    }

    @Override
    public String toString() {
        return "Curso{" + "cod_curso=" + cod_curso + ", nom_curso=" + nom_curso + ", nro_creditos=" + nro_creditos + '}';
    }
    
    
}