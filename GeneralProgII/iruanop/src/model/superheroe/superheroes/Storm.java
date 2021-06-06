package model.superheroe.superheroes;

import static model.jugador.Organizaciones.X_MEN;
import static model.superheroe.AliasSuperheroe.STORM;
import model.superheroe.homoSuperior.HomoSuperior;

/**
 *
 * @author Isabel Ruano <i.ruano1@usp.ceu.es>
 */
public class Storm extends HomoSuperior {

    public Storm() {
        super(STORM, "Ororo Munroe", X_MEN);
        getParrilla().setInteligencia(3);
        getParrilla().setFuerza(2);
        getParrilla().setVelocidad(3);
        getParrilla().setResistencia(2);
        getParrilla().setProyeccionEnergia(5);
        getParrilla().setHabilidadesLucha(4);

    }

}
