package utils;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Isabel Ruano <i.ruano1@usp.ceu.es>
 */
public class Utils {

    public static int leerEntero() {

        InputStreamReader isr = null;
        BufferedReader consola = null;
        System.out.println("Introduce un numero :");
        int resultado = 0;
        boolean error = true;
        while (error) {
            try {

                isr = new InputStreamReader(System.in);
                consola = new BufferedReader(isr);
                String comando = consola.readLine();
                resultado = Integer.parseInt(comando);
                error = false;
            } catch (Exception e) {
                System.out.println("Error. debe introducir un numero.");

            }
        }

        return resultado;
    }

    public static String leerCadena(String mensaje) {

        InputStreamReader isr = null;
        BufferedReader consola = null;
        System.out.println(mensaje);
        String resultado = "";
        boolean error = true;
        while (error) {
            try {

                isr = new InputStreamReader(System.in);
                consola = new BufferedReader(isr);
                resultado = consola.readLine();
                error = false;
            } catch (Exception e) {
                System.out.println("Error al leer.");

            }
        }

        return resultado;
    }
}
