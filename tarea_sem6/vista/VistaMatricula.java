package vista;

import dominio.Matricula;
import java.util.List;
import java.util.Objects;

public class VistaMatricula {

    private final VistaConsola consola;

    public VistaMatricula(VistaConsola consola) {
        this.consola = Objects.requireNonNull(consola);
    }

    public String pedirCodigoAlumno() {
        return consola.leerTexto("Código del alumno: ");
    }

    public String pedirCodigoCurso() {
        return consola.leerTexto("Código del curso: ");
    }

    public String pedirCodigoDocente() {
        return consola.leerTexto("Código del docente: ");
    }

    public String pedirCodigoPeriodo() {
        return consola.leerTexto("Código del período: ");
    }

    public int pedirIdMatricula() {
        return consola.leerEntero("ID de matrícula: ");
    }

    public double pedirCalificacion() {
        return consola.leerDecimal("Calificación: ");
    }

    public void mostrarMatriculas(List<Matricula> matriculas) {
        consola.mostrarLista(
                "MATRÍCULAS DEL PERÍODO",
                matriculas,
                "No hay matrículas registradas para ese período.",
                m -> "ID: " + m.idMatricula()
                        + " - Alumno: " + m.nombreCompletoAlumno()
                        + " - Curso: " + m.codigoCurso()
                        + " - Estado: " + m.estadoMatricula());
    }

    public void mostrarHistorialAlumno(List<Matricula> matriculas) {
        consola.mostrarLista(
                "HISTORIAL DEL ALUMNO",
                matriculas,
                "El alumno no tiene matrículas registradas.",
                m -> "ID: " + m.idMatricula()
                        + " - Período: " + m.codigoPeriodo()
                        + " - Curso: " + m.codigoCurso()
                        + " - Estado: " + m.estadoMatricula());
    }

    public void mostrarPromedio(double promedio) {
        consola.mostrarMensaje(
                "Promedio de la matrícula: " + promedio);
    }

    public void mostrarMatriculaRegistrada() {
        consola.mostrarMensaje("Matrícula registrada correctamente.");
    }

    public void mostrarNotaRegistrada() {
        consola.mostrarMensaje("Nota registrada correctamente.");
    }
}