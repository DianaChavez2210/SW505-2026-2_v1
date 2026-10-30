package vista;

import dominio.Periodo;
import java.util.Objects;

public class VistaPeriodo {

    private final VistaConsola consola;

    public VistaPeriodo(VistaConsola consola) {
        this.consola = Objects.requireNonNull(consola);
    }

    public Periodo pedirPeriodo() {
        consola.mostrarMensaje("\n--- REGISTRAR PERÍODO ---");

        String codigo = consola.leerTexto("Código: ");
        String descripcion = consola.leerTexto("Descripción: ");

        return new Periodo(codigo, descripcion);
    }

    public void mostrarRegistroExitoso() {
        consola.mostrarMensaje("Período registrado correctamente.");
    }
}