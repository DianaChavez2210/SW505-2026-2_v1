package vista;

import dominio.Alumno;
import java.util.List;
import java.util.Objects;

public class VistaAlumno {

    private final VistaConsola consola;

    public VistaAlumno(VistaConsola consola) {
        this.consola = Objects.requireNonNull(consola);
    }

    public Alumno pedirAlumno() {
        consola.mostrarMensaje("\n--- REGISTRAR ALUMNO ---");

        String codigo = consola.leerTexto("Código: ");
        String nombres = consola.leerTexto("Nombres: ");
        String apellidos = consola.leerTexto("Apellidos: ");
        int edad = consola.leerEntero("Edad: ");
        String carrera = consola.leerTexto("Carrera: ");

        return new Alumno(codigo, nombres, apellidos, edad, carrera);
    }

    public void mostrarAlumnos(List<Alumno> alumnos) {
        consola.mostrarLista(
                "LISTA DE ALUMNOS",
                alumnos,
                "No hay alumnos registrados.",
                a -> a.codigo() + " - "
                        + a.nombreCompleto() + " - "
                        + a.carrera());
    }

    public void mostrarRegistroExitoso() {
        consola.mostrarMensaje("Alumno registrado correctamente.");
    }
}