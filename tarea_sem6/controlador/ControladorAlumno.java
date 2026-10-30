package controlador;

import dominio.Alumno;
import java.util.Objects;
import servicio.SistemaAcademico;
import vista.VistaAlumno;

public class ControladorAlumno {

    private final VistaAlumno vista;
    private final SistemaAcademico sistema;

    public ControladorAlumno(
            VistaAlumno vista, SistemaAcademico sistema) {

        this.vista = Objects.requireNonNull(vista);
        this.sistema = Objects.requireNonNull(sistema);
    }

    public void registrarAlumno() {
        Alumno alumno = vista.pedirAlumno();
        sistema.registrarAlumno(alumno);
        vista.mostrarRegistroExitoso();
    }

    public void listarAlumnos() {
        vista.mostrarAlumnos(sistema.listarAlumnos());
    }
}