package controlador;

import excepciones.ValidacionException;
import java.util.NoSuchElementException;
import java.util.Objects;
import vista.VistaMenu;

public class ControladorAcademico {

    private final VistaMenu menu;
    private final ControladorAlumno alumnos;
    private final ControladorDocente docentes;
    private final ControladorCurso cursos;
    private final ControladorPeriodo periodos;
    private final ControladorMatricula matriculas;

    public ControladorAcademico(
            VistaMenu menu,
            ControladorAlumno alumnos,
            ControladorDocente docentes,
            ControladorCurso cursos,
            ControladorPeriodo periodos,
            ControladorMatricula matriculas) {

        this.menu = Objects.requireNonNull(menu);
        this.alumnos = Objects.requireNonNull(alumnos);
        this.docentes = Objects.requireNonNull(docentes);
        this.cursos = Objects.requireNonNull(cursos);
        this.periodos = Objects.requireNonNull(periodos);
        this.matriculas = Objects.requireNonNull(matriculas);
    }

    public void iniciar() {
        while (true) {
            try {
                menu.mostrarMenu();
                int opcion = menu.leerOpcion();

                if (opcion == 0) {
                    menu.mostrarMensaje("Saliendo del sistema...");
                    return;
                }

                ejecutarOpcion(opcion);

            } catch (NumberFormatException e) {
                menu.mostrarMensaje(
                        "Error: debes ingresar un número válido.");

            } catch (ValidacionException e) {
                menu.mostrarMensaje("Error: " + e.getMessage());

            } catch (NoSuchElementException e) {
                menu.mostrarMensaje(
                        "Entrada finalizada. Saliendo del sistema...");
                return;
            }
        }
    }

    private void ejecutarOpcion(int opcion) {
        switch (opcion) {
            case 1 -> alumnos.registrarAlumno();
            case 2 -> docentes.registrarDocente();
            case 3 -> cursos.registrarCurso();
            case 4 -> periodos.registrarPeriodo();
            case 5 -> matriculas.matricularAlumno();
            case 6 -> matriculas.registrarNota();
            case 7 -> alumnos.listarAlumnos();
            case 8 -> docentes.listarDocentes();
            case 9 -> cursos.listarCursos();
            case 10 -> matriculas.listarMatriculasPorPeriodo();
            case 11 -> matriculas.verHistorialAlumno();
            case 12 -> matriculas.verPromedioMatricula();
            default -> menu.mostrarMensaje("Opción inválida.");
        }
    }
}