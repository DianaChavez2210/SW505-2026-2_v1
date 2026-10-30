package vista;

import dominio.Docente;
import java.util.List;
import java.util.Objects;

public class VistaDocente {

    private final VistaConsola consola;

    public VistaDocente(VistaConsola consola) {
        this.consola = Objects.requireNonNull(consola);
    }

    public Docente pedirDocente() {
        consola.mostrarMensaje("\n--- REGISTRAR DOCENTE ---");

        String codigo = consola.leerTexto("Código: ");
        String nombres = consola.leerTexto("Nombres: ");
        String apellidos = consola.leerTexto("Apellidos: ");
        String especialidad = consola.leerTexto("Especialidad: ");

        return new Docente(codigo, nombres, apellidos, especialidad);
    }

    public void mostrarDocentes(List<Docente> docentes) {
        consola.mostrarLista(
                "LISTA DE DOCENTES",
                docentes,
                "No hay docentes registrados.",
                d -> d.codigo() + " - "
                        + d.nombreCompleto() + " - "
                        + d.especialidad());
    }

    public void mostrarRegistroExitoso() {
        consola.mostrarMensaje("Docente registrado correctamente.");
    }
}