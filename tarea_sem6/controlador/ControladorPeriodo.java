package controlador;

import dominio.Periodo;
import java.util.Objects;
import servicio.SistemaAcademico;
import vista.VistaPeriodo;

public class ControladorPeriodo {

    private final VistaPeriodo vista;
    private final SistemaAcademico sistema;

    public ControladorPeriodo(
            VistaPeriodo vista, SistemaAcademico sistema) {

        this.vista = Objects.requireNonNull(vista);
        this.sistema = Objects.requireNonNull(sistema);
    }

    public void registrarPeriodo() {
        Periodo periodo = vista.pedirPeriodo();
        sistema.registrarPeriodo(periodo);
        vista.mostrarRegistroExitoso();
    }
}