package model.superheroe.superheroes;

import static model.jugador.Organizaciones.AVENGERS;
import static model.superheroe.AliasSuperheroe.BLACK_WIDOW;
import model.superheroe.humano.HumanosMejorados;

/**
 *
 * @author Isabel Ruano <i.ruano1@usp.ceu.es>
 */
public class BlackWidow extends HumanosMejorados {

    public BlackWidow() {
        super(BLACK_WIDOW, "Natalia Romanova", AVENGERS);
        getParrilla().setInteligencia(3);
        getParrilla().setFuerza(3);
        getParrilla().setVelocidad(2);
        getParrilla().setResistencia(3);
        getParrilla().setProyeccionEnergia(3);
        getParrilla().setHabilidadesLucha(5);
    }

}
