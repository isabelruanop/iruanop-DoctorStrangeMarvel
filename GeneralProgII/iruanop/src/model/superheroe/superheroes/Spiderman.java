package model.superheroe.superheroes;

import static model.jugador.Organizaciones.LEAGUE_OF_REALMS;
import static model.superheroe.AliasSuperheroe.SPIDERMAN;
import model.superheroe.humano.HumanosMutados;

/**
 *
 * @author Isabel Ruano <i.ruano1@usp.ceu.es>
 */
public class Spiderman extends HumanosMutados {

    public Spiderman() {
        super(SPIDERMAN, "Peter Parker", LEAGUE_OF_REALMS);
        getParrilla().setInteligencia(4);
        getParrilla().setFuerza(4);
        getParrilla().setVelocidad(3);
        getParrilla().setResistencia(3);
        getParrilla().setProyeccionEnergia(1);
        getParrilla().setHabilidadesLucha(4);
    }

}
