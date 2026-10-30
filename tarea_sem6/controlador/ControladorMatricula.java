package controlador;

import java.util.Objects;
import servicio.SistemaAcademico;
import vista.VistaMatricula;

public class ControladorMatricula {

    private final VistaMatricula vista;
    private final SistemaAcademico sistema;

    public ControladorMatricula(
            VistaMatricula vista, SistemaAcademico sistema) {

        this.vista = Objects.requireNonNull(vista);
        this.sistema = Objects.requireNonNull(sistema);
    }

    public void matricularAlumno() {
        String codigoAlumno = vista.pedirCodigoAlumno();
        String codigoCurso = vista.pedirCodigoCurso();
        String codigoDocente = vista.pedirCodigoDocente();
        String codigoPeriodo = vista.pedirCodigoPeriodo();

        sistema.matricularAlumno(
                codigoAlumno,
                codigoCurso,
                codigoDocente,
                codigoPeriodo);

        vista.mostrarMatriculaRegistrada();
    }

    public void registrarNota() {
        int idMatricula = vista.pedirIdMatricula();
        double calificacion = vista.pedirCalificacion();

        sistema.registrarNota(idMatricula, calificacion);

        vista.mostrarNotaRegistrada();
    }

    public void listarMatriculasPorPeriodo() {
        String codigoPeriodo = vista.pedirCodigoPeriodo();

        vista.mostrarMatriculas(
                sistema.listarMatriculasPorPeriodo(codigoPeriodo));
    }

    public void verHistorialAlumno() {
        String codigoAlumno = vista.pedirCodigoAlumno();

        vista.mostrarHistorialAlumno(
                sistema.historialAlumno(codigoAlumno));
    }

    public void verPromedioMatricula() {
        int idMatricula = vista.pedirIdMatricula();

        double promedio =
                sistema.obtenerPromedioMatricula(idMatricula);

        vista.mostrarPromedio(promedio);
    }
}