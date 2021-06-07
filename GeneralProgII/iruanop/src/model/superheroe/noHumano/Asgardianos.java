package model.superheroe.noHumano;

import model.jugador.Organizaciones;
import model.superheroe.AliasSuperheroe;

/**
 *
 * @author Isabel Ruano <i.ruano1@usp.ceu.es>
 */
public class Asgardianos extends NoHumano {

    public Asgardianos(AliasSuperheroe nombre, String identidadSecreta,
            Organizaciones organizacion) {
        super(nombre, identidadSecreta, organizacion);
        getParrilla().setFuerza(7);
        getParrilla().setInteligenciaMax(2);
        getParrilla().setInteligenciaMin(2);
    }

}
