package model.superheroe.superheroes;

import static model.jugador.Organizaciones.AVENGERS;
import static model.superheroe.AliasSuperheroe.HULK;
import model.superheroe.humano.HumanosMutados;

/**
 *
 * @author Isabel Ruano <i.ruano1@usp.ceu.es>
 */
public class Hulk extends HumanosMutados {

    public Hulk() {
        super(HULK, "Bruce Banner", AVENGERS);
        getParrilla().setInteligencia(3);
        getParrilla().setFuerza(7);
        getParrilla().setVelocidad(3);
        getParrilla().setResistencia(5);
        getParrilla().setProyeccionEnergia(1);
        getParrilla().setHabilidadesLucha(4);

    }

}
