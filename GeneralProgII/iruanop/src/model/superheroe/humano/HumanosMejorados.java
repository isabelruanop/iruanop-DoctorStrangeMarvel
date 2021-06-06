package model.superheroe.humano;

import model.jugador.Organizaciones;
import model.superheroe.AliasSuperheroe;

/**
 *
 * @author Isabel Ruano <i.ruano1@usp.ceu.es>
 */
public class HumanosMejorados extends Humano {

    public HumanosMejorados(AliasSuperheroe nombre, String identidadSecreta, Organizaciones organizacion) {
        super(nombre, identidadSecreta, organizacion);
        getParrilla().setHabilidadesLuchaMax(5);
        getParrilla().setHabilidadesLuchaMin(5);

    }

}
