package model.superheroe.humano;

import model.jugador.Organizaciones;
import model.superheroe.AliasSuperheroe;

/**
 *
 * @author Isabel Ruano <i.ruano1@usp.ceu.es>
 */
public class HumanosMagicos extends Humano {

    public HumanosMagicos(AliasSuperheroe nombre,
            String identidadSecreta, Organizaciones organizacion) {
        super(nombre, identidadSecreta, organizacion);
        getParrilla().setProyeccionEnergiaMin(6);
        getParrilla().setProyeccionEnergiaMax(6);

    }

}
