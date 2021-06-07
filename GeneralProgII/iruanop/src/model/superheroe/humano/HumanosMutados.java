package model.superheroe.humano;

import model.jugador.Organizaciones;
import model.superheroe.AliasSuperheroe;

/**
 *
 * @author Isabel Ruano <i.ruano1@usp.ceu.es>
 */
public class HumanosMutados extends Humano {

    public HumanosMutados(AliasSuperheroe nombre, String identidadSecreta,
            Organizaciones organizacion) {
        super(nombre, identidadSecreta, organizacion);
        getParrilla().setProyeccionEnergiaMin(1);
        getParrilla().setProyeccionEnergiaMax(1);
    }

}
