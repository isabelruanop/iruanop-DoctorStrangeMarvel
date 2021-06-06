package model.superheroe.superheroes;

import static model.jugador.Organizaciones.LEAGUE_OF_REALMS;
import static model.superheroe.AliasSuperheroe.THOR;
import model.superheroe.noHumano.NoHumano;

/**
 *
 * @author Isabel Ruano <i.ruano1@usp.ceu.es>
 */
public class Thor extends NoHumano {

    public Thor() {
        super(THOR, "Thor Odinson", LEAGUE_OF_REALMS);
        getParrilla().setInteligencia(2);
        getParrilla().setFuerza(7);
        getParrilla().setVelocidad(7);
        getParrilla().setResistencia(6);
        getParrilla().setProyeccionEnergia(6);
        getParrilla().setHabilidadesLucha(4);

    }

}
