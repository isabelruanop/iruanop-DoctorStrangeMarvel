package model.superheroe.noHumano;

import model.jugador.Organizaciones;
import model.superheroe.AliasSuperheroe;

/**
 *
 * @author Isabel Ruano <i.ruano1@usp.ceu.es>
 */
public class Krees extends NoHumano {

    public Krees(AliasSuperheroe nombre, String identidadSecreta,
            Organizaciones organizacion) {
        super(nombre, identidadSecreta, organizacion);
        getParrilla().setInteligenciaMax(4);
        getParrilla().setInteligenciaMin(4);
        getParrilla().setFuerzaMax(5);
        getParrilla().setFuerzaMin(5);
    }

}
