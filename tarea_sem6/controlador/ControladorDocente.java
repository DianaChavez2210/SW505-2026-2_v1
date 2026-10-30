package controlador;

import dominio.Docente;
import java.util.Objects;
import servicio.SistemaAcademico;
import vista.VistaDocente;

public class ControladorDocente {

    private final VistaDocente vista;
    private final SistemaAcademico sistema;

    public ControladorDocente(
            VistaDocente vista, SistemaAcademico sistema) {

        this.vista = Objects.requireNonNull(vista);
        this.sistema = Objects.requireNonNull(sistema);
    }

    public void registrarDocente() {
        Docente docente = vista.pedirDocente();
        sistema.registrarDocente(docente);
        vista.mostrarRegistroExitoso();
    }

    public void listarDocentes() {
        vista.mostrarDocentes(sistema.listarDocentes());
    }
}