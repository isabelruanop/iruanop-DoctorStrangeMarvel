package model.superheroe.superheroes;

import static model.jugador.Organizaciones.STRANGE_ACADEMY;
import static model.superheroe.AliasSuperheroe.SCARLET_WITCH;
import model.superheroe.humano.HumanosMagicos;

/**
 *
 * @author Isabel Ruano <i.ruano1@usp.ceu.es>
 */
public class ScarletWitch extends HumanosMagicos {

    public ScarletWitch() {
        super(SCARLET_WITCH, "Wanda Maximoff", STRANGE_ACADEMY);
        getParrilla().setInteligencia(3);
        getParrilla().setFuerza(2);
        getParrilla().setVelocidad(2);
        getParrilla().setResistencia(2);
        getParrilla().setProyeccionEnergia(6);
        getParrilla().setHabilidadesLucha(3);

    }

}
