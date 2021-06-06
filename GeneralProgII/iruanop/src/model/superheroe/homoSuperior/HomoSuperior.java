package model.superheroe.homoSuperior;

import model.jugador.Organizaciones;
import model.superheroe.*;

/**
 *
 * @author Isabel Ruano <i.ruano1@usp.ceu.es>
 */
public class HomoSuperior extends Superheroe {

    public HomoSuperior(AliasSuperheroe nombre, String identidadSecreta, Organizaciones organizacion) {
        super(nombre, identidadSecreta, new ParrillaPoderes(2, 5, 1, 7, 1, 7, 1, 7, 1, 7, 4, 4), organizacion);
    }

}
