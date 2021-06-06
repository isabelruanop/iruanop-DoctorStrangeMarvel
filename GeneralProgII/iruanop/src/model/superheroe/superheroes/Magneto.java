package model.superheroe.superheroes;

import static model.jugador.Organizaciones.X_MEN;
import static model.superheroe.AliasSuperheroe.MAGNETO;
import model.superheroe.homoSuperior.HomoSuperior;

/**
 *
 * @author Isabel Ruano <i.ruano1@usp.ceu.es>
 */
public class Magneto extends HomoSuperior {

    public Magneto() {
        super(MAGNETO, "Eric Lensher", X_MEN);
        getParrilla().setInteligencia(5);
        getParrilla().setFuerza(2);
        getParrilla().setVelocidad(5);
        getParrilla().setResistencia(2);
        getParrilla().setProyeccionEnergia(6);
        getParrilla().setHabilidadesLucha(4);
    }

}
