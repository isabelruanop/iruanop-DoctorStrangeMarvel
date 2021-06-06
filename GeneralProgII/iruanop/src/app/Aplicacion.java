package app;

import data.DataStore;
import exceptions.JugadorException;
import gui.Menu;
import static io.Storing.cargarPartida;

/**
 *
 * @author Isabel Ruano <i.ruano1@usp.ceu.es>
 */
public class Aplicacion {

    public static void main(String[] args) throws JugadorException {
        DataStore dts = cargarPartida();

        Menu.main(args);
        io.Storing.guardarPartida(dts);

    }
}
