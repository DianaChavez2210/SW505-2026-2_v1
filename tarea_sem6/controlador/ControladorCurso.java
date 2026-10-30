package controlador;

import dominio.Curso;
import java.util.Objects;
import servicio.SistemaAcademico;
import vista.VistaCurso;

public class ControladorCurso {

    private final VistaCurso vista;
    private final SistemaAcademico sistema;

    public ControladorCurso(
            VistaCurso vista, SistemaAcademico sistema) {

        this.vista = Objects.requireNonNull(vista);
        this.sistema = Objects.requireNonNull(sistema);
    }

    public void registrarCurso() {
        Curso curso = vista.pedirCurso();
        sistema.registrarCurso(curso);
        vista.mostrarRegistroExitoso();
    }

    public void listarCursos() {
        vista.mostrarCursos(sistema.listarCursos());
    }
}
