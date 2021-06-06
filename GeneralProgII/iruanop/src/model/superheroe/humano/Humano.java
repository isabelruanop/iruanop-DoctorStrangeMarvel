package model.superheroe.humano;

import model.jugador.Organizaciones;
import model.superheroe.AliasSuperheroe;
import model.superheroe.ParrillaPoderes;
import model.superheroe.Superheroe;

/**
 *
 * @author Isabel Ruano <i.ruano1@usp.ceu.es>
 */
public class Humano extends Superheroe {

    public Humano(AliasSuperheroe nombre, String identidadSecreta, Organizaciones organizacion) {
        super(nombre, identidadSecreta, new ParrillaPoderes(3, 7, 1, 6, 2, 5, 2, 5, 1, 6, 1, 7), organizacion);
    }
}
