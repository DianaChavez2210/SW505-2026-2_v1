package vista;

import dominio.Curso;
import java.util.List;
import java.util.Objects;

public class VistaCurso {

    private final VistaConsola consola;

    public VistaCurso(VistaConsola consola) {
        this.consola = Objects.requireNonNull(consola);
    }

    public Curso pedirCurso() {
        consola.mostrarMensaje("\n--- REGISTRAR CURSO ---");

        String codigo = consola.leerTexto("Código: ");
        String nombre = consola.leerTexto("Nombre: ");
        int creditos = consola.leerEntero("Créditos: ");
        boolean estado = consola.leerBooleano(
                "¿Curso activo? (true/false): ");

        return new Curso(codigo, nombre, creditos, estado);
    }

    public void mostrarCursos(List<Curso> cursos) {
        consola.mostrarLista(
                "LISTA DE CURSOS",
                cursos,
                "No hay cursos registrados.",
                c -> c.codigo() + " - "
                        + c.nombre() + " - "
                        + c.creditos() + " créditos");
    }

    public void mostrarRegistroExitoso() {
        consola.mostrarMensaje("Curso registrado correctamente.");
    }
}