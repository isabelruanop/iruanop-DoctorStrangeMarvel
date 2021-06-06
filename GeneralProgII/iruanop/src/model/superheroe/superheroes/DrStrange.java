package model.superheroe.superheroes;

import static model.jugador.Organizaciones.STRANGE_ACADEMY;
import static model.superheroe.AliasSuperheroe.DR_STRANGE;
import model.superheroe.humano.HumanosMagicos;

/**
 *
 * @author Isabel Ruano <i.ruano1@usp.ceu.es>
 */
public class DrStrange extends HumanosMagicos {

    public DrStrange() {
        super(DR_STRANGE, "Stephen Strange", STRANGE_ACADEMY);
        getParrilla().setInteligencia(4);
        getParrilla().setFuerza(2);
        getParrilla().setVelocidad(2);
        getParrilla().setResistencia(2);
        getParrilla().setProyeccionEnergia(6);
        getParrilla().setHabilidadesLucha(6);

    }
}
