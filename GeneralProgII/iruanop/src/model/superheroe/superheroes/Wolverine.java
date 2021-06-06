package model.superheroe.superheroes;

import static model.jugador.Organizaciones.A_FORCE;
import static model.superheroe.AliasSuperheroe.WOLVERINE;
import model.superheroe.homoSuperior.HomoSuperior;

/**
 *
 * @author Isabel Ruano <i.ruano1@usp.ceu.es>
 */
public class Wolverine extends HomoSuperior {

    public Wolverine() {
        super(WOLVERINE, "James Logan Howlett", A_FORCE);
        getParrilla().setInteligencia(2);
        getParrilla().setFuerza(4);
        getParrilla().setVelocidad(2);
        getParrilla().setResistencia(3);
        getParrilla().setProyeccionEnergia(2);
        getParrilla().setHabilidadesLucha(4);
    }

}
