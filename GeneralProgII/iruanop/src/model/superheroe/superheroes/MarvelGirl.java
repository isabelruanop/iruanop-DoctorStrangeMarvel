package model.superheroe.superheroes;

import static model.jugador.Organizaciones.X_MEN;
import static model.superheroe.AliasSuperheroe.MARVEL_GIRL;
import model.superheroe.homoSuperior.HomoSuperior;

/**
 *
 * @author Isabel Ruano <i.ruano1@usp.ceu.es>
 */
public class MarvelGirl extends HomoSuperior {

    public MarvelGirl() {
        super(MARVEL_GIRL, "Jean Grey", X_MEN);
        getParrilla().setInteligencia(3);
        getParrilla().setFuerza(2);
        getParrilla().setVelocidad(3);
        getParrilla().setResistencia(2);
        getParrilla().setProyeccionEnergia(6);
        getParrilla().setHabilidadesLucha(4);

    }

}
