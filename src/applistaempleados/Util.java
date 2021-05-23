package applistaempleados;

import java.time.LocalDate;
import java.util.Scanner;

public class Util {
    // Metyodo que limpia la pantalla de consola...

    public static void limpiarPantalla() {
        // Control de excepciones:
        // Excepcion: situacion anomala y no esperada en el funcionamiento
        // de nuestro programa. Ej: se eperaba un numero y el usuario ingreso texto.

        try {
            // bloque susceptible a excepciones:
            // codigo que es puesto a prueba.
            // now ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            // Si ocurre una excepcion, este bloque
            // permite Capturarla y controlarla.
            System.out.println("Ocurrio el error: " + e.getMessage());
        }
    }

    public static char getChar(String s) {
        Scanner in = new Scanner(System.in);
        System.out.print(s);
        char c = in.next().charAt(0);
        in.close();
        return c;
    }

    public static int calcularEdad(LocalDate fecha) {
        /*
         * metodo que toma una fecha (mediante LocalDate.of(anio,mes,dia) y calcula un
         * periodo(anio) con la fecha actual(LocalDate.now()).
         */
        LocalDate fechaActual = LocalDate.now();
        int edad = 0;
        int anioN = fecha.getYear(), mesN = fecha.getMonthValue(), diaN = fecha.getDayOfMonth();
        int anioA = fechaActual.getYear(), mesA = fechaActual.getMonthValue(), diaA = fecha.getDayOfMonth();
        // mesA >= mesN es igual a: mesA > mesN || mesA == mesN
        if (mesA < mesN || (diaA < diaN && mesA == mesN)) {
            edad = anioA - anioN - 1;
        } else {
            edad = anioA - anioN;
        }

        return edad;
    }
}