package vista;

import java.io.PrintStream;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.function.Function;

public class VistaConsola {

    private final Scanner scanner;
    private final PrintStream salida;

    public VistaConsola() {
        this(new Scanner(System.in), System.out);
    }

    public VistaConsola(Scanner scanner, PrintStream salida) {
        this.scanner = Objects.requireNonNull(scanner);
        this.salida = Objects.requireNonNull(salida);
    }

    public String leerTexto(String mensaje) {
        salida.print(mensaje);
        salida.flush();
        return scanner.nextLine();
    }

    public int leerEntero(String mensaje) {
        return Integer.parseInt(leerTexto(mensaje));
    }

    public double leerDecimal(String mensaje) {
        return Double.parseDouble(leerTexto(mensaje));
    }

    public boolean leerBooleano(String mensaje) {
        return Boolean.parseBoolean(leerTexto(mensaje));
    }

    public void mostrarMensaje(String mensaje) {
        salida.println(mensaje);
    }

    public void mostrarTitulo(String titulo) {
        mostrarMensaje("\n==============================");
        mostrarMensaje(titulo);
        mostrarMensaje("==============================");
    }

    public <T> void mostrarLista(
            String titulo, List<T> elementos,
            String mensajeVacio, Function<T, String> formato) {

        mostrarMensaje("\n--- " + titulo + " ---");

        if (elementos.isEmpty()) {
            mostrarMensaje(mensajeVacio);
            return;
        }

        for (T elemento : elementos) {
            mostrarMensaje(formato.apply(elemento));
        }
    }
}