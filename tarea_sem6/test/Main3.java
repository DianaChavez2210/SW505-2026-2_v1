package test;

import controlador.ControladorAcademico;
import controlador.ControladorAlumno;
import controlador.ControladorCurso;
import controlador.ControladorDocente;
import controlador.ControladorMatricula;
import controlador.ControladorPeriodo;
import servicio.SistemaAcademico;
import vista.VistaAlumno;
import vista.VistaConsola;
import vista.VistaCurso;
import vista.VistaDocente;
import vista.VistaMatricula;
import vista.VistaMenu;
import vista.VistaPeriodo;

public class Main3 {

    public static void main(String[] args) {
        // Todos los modulos comparten la misma consola y el mismo sistema.
        VistaConsola consola = new VistaConsola();
        SistemaAcademico sistema = new SistemaAcademico();

        ControladorAlumno alumnos = new ControladorAlumno(
                new VistaAlumno(consola), sistema);

        ControladorDocente docentes = new ControladorDocente(
                new VistaDocente(consola), sistema);

        ControladorCurso cursos = new ControladorCurso(
                new VistaCurso(consola), sistema);

        ControladorPeriodo periodos = new ControladorPeriodo(
                new VistaPeriodo(consola), sistema);

        ControladorMatricula matriculas = new ControladorMatricula(
                new VistaMatricula(consola), sistema);

        ControladorAcademico controlador = new ControladorAcademico(
                new VistaMenu(consola),
                alumnos,
                docentes,
                cursos,
                periodos,
                matriculas);

        controlador.iniciar();
    }
}