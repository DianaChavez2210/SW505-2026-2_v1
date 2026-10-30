public class Matricula {
    private int cod_matricula;
    private Alumno alumno;
    private Periodo periodo;
    private ArrayList curxciclo;

    public Matricula(int cod_matricula, Alumno alumno, Periodo periodo) {
        this.cod_matricula = cod_matricula;
        this.alumno = alumno;
        this.periodo = periodo;
        this.curxciclo = new ArrayList();
    }
    
    public void agregarCurso(CursosxCiclo cc) {
        curxciclo.add(cc);
    }
    
}