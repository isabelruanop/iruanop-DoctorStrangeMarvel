package model.superheroe.superheroes;

import static model.jugador.Organizaciones.A_FORCE;
import static model.superheroe.AliasSuperheroe.SHE_HULK;
import model.superheroe.humano.HumanosMutados;

/**
 *
 * @author Isabel Ruano <i.ruano1@usp.ceu.es>
 */
public class SheHulk extends HumanosMutados {

    public SheHulk() {
        super(SHE_HULK, "Jennifer Walters", A_FORCE);
        getParrilla().setInteligencia(3);
        getParrilla().setFuerza(7);
        getParrilla().setVelocidad(3);
        getParrilla().setResistencia(5);
        getParrilla().setProyeccionEnergia(1);
        getParrilla().setHabilidadesLucha(4);
    }

}
