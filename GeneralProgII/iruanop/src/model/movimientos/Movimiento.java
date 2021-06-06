package model.movimientos;

import id.Id;
import model.jugador.Jugador;
import model.superheroe.Superheroe;

/**
 *
 * @author Isabel Ruano <i.ruano1@usp.ceu.es>
 */
public class Movimiento extends Id {

    private final String nombre;
    private final TipoMovimiento tipo;
    private int energia;
    private Jugador j;

    private Superheroe atacante;
    private Superheroe oponente;

    public Movimiento(String nombre, TipoMovimiento tipo, int energia) {

        this.nombre = nombre;
        this.tipo = tipo;
        this.energia = energia;

        this.atacante = null;
        this.oponente = null;

    }

    public TipoMovimiento getTipoMovimiento() {

        return this.tipo;

    }

    public String getNombre() {

        return this.nombre;

    }

    public int getEnergia() {

        return this.energia;

    }

    public Jugador getJugador() {

        return this.j;

    }

    public Superheroe getAtacante() {

        return atacante;

    }

    public Superheroe getOponente() {

        return oponente;

    }

    public void setAtacante(Superheroe atacante) {

        this.atacante = atacante;

    }

    public void setOponente(Superheroe oponente) {

        this.oponente = oponente;

    }

    public void setEnergiaReal(int energia) {

        this.energia = energia;

    }

    public int calcularEnergiaReal(Movimiento mv) {

        return 0;

    }

    @Override

    public String toString() {

        return "\nNombre: " + this.nombre + "\n " + "Tipo: " + this.tipo + "\n"
                + "Potencia: " + this.energia + "\n";

    }
}
