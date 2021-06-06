package model.superheroe.superheroes;

import static model.jugador.Organizaciones.MERCS_FOR_MONEY;
import static model.superheroe.AliasSuperheroe.DOMINO;
import model.superheroe.homoSuperior.HomoSuperior;

/**
 *
 * @author Isabel Ruano <i.ruano1@usp.ceu.es>
 */
public class Domino extends HomoSuperior {

    public Domino() {
        super(DOMINO, "Neena Thurman", MERCS_FOR_MONEY);
        getParrilla().setInteligencia(2);
        getParrilla().setFuerza(2);
        getParrilla().setVelocidad(2);
        getParrilla().setResistencia(2);
        getParrilla().setProyeccionEnergia(4);
        getParrilla().setHabilidadesLucha(6);

    }
}
