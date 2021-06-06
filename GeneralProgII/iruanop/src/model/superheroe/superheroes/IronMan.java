package model.superheroe.superheroes;

import static model.jugador.Organizaciones.AVENGERS;
import static model.superheroe.AliasSuperheroe.IRON_MAN;
import model.superheroe.humano.HumanosMejorados;

/**
 *
 * @author Isabel Ruano <i.ruano1@usp.ceu.es>
 */
public class IronMan extends HumanosMejorados {

    public IronMan() {
        super(IRON_MAN, "Anthony Stark", AVENGERS);
        getParrilla().setInteligencia(6);
        getParrilla().setFuerza(6);
        getParrilla().setVelocidad(5);
        getParrilla().setResistencia(5);
        getParrilla().setProyeccionEnergia(6);
        getParrilla().setHabilidadesLucha(5);

    }
}
