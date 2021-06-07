package model.superheroe.noHumano;

import model.jugador.Organizaciones;
import model.superheroe.*;

/**
 *
 * @author Isabel Ruano <i.ruano1@usp.ceu.es>
 */
public class NoHumano extends Superheroe {

    public NoHumano(AliasSuperheroe nombre, String identidadSecreta,
            Organizaciones organizacion) {
        super(nombre, identidadSecreta, new ParrillaPoderes(1, 7, 1, 7, 3,
                7, 3, 7, 1, 7, 3, 6), organizacion);

    }

}
