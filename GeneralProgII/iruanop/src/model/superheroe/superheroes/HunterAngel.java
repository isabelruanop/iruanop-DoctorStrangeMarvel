package model.superheroe.superheroes;

import static model.jugador.Organizaciones.LEAGUE_OF_REALMS;
import static model.superheroe.AliasSuperheroe.HUNTER_ANGEL;
import model.superheroe.noHumano.NoHumano;

/**
 *
 * @author Isabel Ruano <i.ruano1@usp.ceu.es>
 */
public class HunterAngel extends NoHumano {

    public HunterAngel() {
        super(HUNTER_ANGEL, "Aldrif Odinsdottir", LEAGUE_OF_REALMS);
        getParrilla().setInteligencia(2);
        getParrilla().setFuerza(7);
        getParrilla().setVelocidad(3);
        getParrilla().setResistencia(3);
        getParrilla().setProyeccionEnergia(1);
        getParrilla().setHabilidadesLucha(6);

    }

}
