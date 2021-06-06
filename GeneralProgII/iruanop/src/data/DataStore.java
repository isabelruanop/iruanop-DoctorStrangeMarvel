package data;

import java.util.ArrayList;
import model.partida.Partida;

/**
 *
 * @author Isabel Ruano <i.ruano1@usp.ceu.es>
 */
public class DataStore {

    private ArrayList<Partida> partidas;

    public DataStore() {

        this.partidas = new ArrayList();

    }

    public void guardarPartida(Partida partida) {

        partidas.add(partida);

    }

    public ArrayList<Partida> getPartidas() {

        return partidas;

    }
}
