package model.superheroe.superheroes;

import static model.jugador.Organizaciones.MERCS_FOR_MONEY;
import static model.superheroe.AliasSuperheroe.DEADPOOL;
import model.superheroe.humano.HumanosMejorados;

/**
 *
 * @author Isabel Ruano <i.ruano1@usp.ceu.es>
 */
public class Deadpool extends HumanosMejorados {

    public Deadpool() {
        super(DEADPOOL, "Wade Wilson", MERCS_FOR_MONEY);
        getParrilla().setInteligencia(3);
        getParrilla().setFuerza(4);
        getParrilla().setVelocidad(2);
        getParrilla().setResistencia(4);
        getParrilla().setProyeccionEnergia(1);
        getParrilla().setHabilidadesLucha(5);
    }

}
