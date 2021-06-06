package model.superheroe.superheroes;

import static model.jugador.Organizaciones.AVENGERS;
import static model.superheroe.AliasSuperheroe.CAPTAIN_AMERICA;
import model.superheroe.humano.HumanosMejorados;

/**
 *
 * @author Isabel Ruano <i.ruano1@usp.ceu.es>
 */
public class CaptainAmerica extends HumanosMejorados {

    public CaptainAmerica() {
        super(CAPTAIN_AMERICA, "Steve Rogers", AVENGERS);
        getParrilla().setInteligencia(3);
        getParrilla().setFuerza(3);
        getParrilla().setVelocidad(2);
        getParrilla().setResistencia(3);
        getParrilla().setProyeccionEnergia(1);
        getParrilla().setHabilidadesLucha(5);
    }

}
