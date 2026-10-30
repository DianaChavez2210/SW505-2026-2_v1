package vista;

import java.util.Objects;

public class VistaMenu {

    private final VistaConsola consola;

    public VistaMenu(VistaConsola consola) {
        this.consola = Objects.requireNonNull(consola);
    }

    public void mostrarMenu() {
        consola.mostrarTitulo("SISTEMA ACADÉMICO");
        consola.mostrarMensaje("1.  Registrar alumno");
        consola.mostrarMensaje("2.  Registrar docente");
        consola.mostrarMensaje("3.  Registrar curso");
        consola.mostrarMensaje("4.  Registrar período");
        consola.mostrarMensaje("5.  Matricular alumno");
        consola.mostrarMensaje("6.  Registrar nota");
        consola.mostrarMensaje("7.  Listar alumnos");
        consola.mostrarMensaje("8.  Listar docentes");
        consola.mostrarMensaje("9.  Listar cursos");
        consola.mostrarMensaje("10. Listar matrículas por período");
        consola.mostrarMensaje("11. Ver historial de un alumno");
        consola.mostrarMensaje("12. Ver promedio de una matrícula");
        consola.mostrarMensaje("0.  Salir");
    }

    public int leerOpcion() {
        return consola.leerEntero("\nSeleccione una opción: ");
    }

    public void mostrarMensaje(String mensaje) {
        consola.mostrarMensaje(mensaje);
    }
}