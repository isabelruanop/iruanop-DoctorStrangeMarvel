package model.superheroe.superheroes;

import static model.jugador.Organizaciones.A_FORCE;
import static model.superheroe.AliasSuperheroe.CAPTAIN_MARVEL;
import model.superheroe.humano.HumanosMejorados;

/**
 *
 * @author Isabel Ruano <i.ruano1@usp.ceu.es>
 */
public class CaptainMarvel extends HumanosMejorados {

    public CaptainMarvel() {
        super(CAPTAIN_MARVEL, "Carol Danvers", A_FORCE);
        getParrilla().setInteligencia(4);
        getParrilla().setFuerza(5);
        getParrilla().setVelocidad(5);
        getParrilla().setResistencia(6);
        getParrilla().setProyeccionEnergia(5);
        getParrilla().setHabilidadesLucha(4);
    }

}
