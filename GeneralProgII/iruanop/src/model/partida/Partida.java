package model.partida;

import model.escenarios.Escenario;
import model.jugador.Jugador;

/**
 *
 * @author Isabel Ruano <i.ruano1@usp.ceu.es>
 */
public class Partida {

    private int identificador;
    private int movimientos;
    private Jugador jugador1;
    private Jugador jugador2;
    private Escenario escenario;

    /*boolean comprobacion ( escenario e ){

}
     */
    public Partida(Jugador jugador1, Jugador jugador2, Escenario escenario) {
        this.identificador = identificador;
        this.movimientos = movimientos;
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
        this.escenario = escenario;
    }

    public int getIdentificador() {
        return identificador;
    }

    public int getMovimientos() {
        return movimientos;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public void setMovimientos(int movimientos) {
        this.movimientos = movimientos;
    }

    public void setJugador1(Jugador jugador1) {
        this.jugador1 = jugador1;
    }

    public void setJugador2(Jugador jugador2) {
        this.jugador2 = jugador2;
    }

    public void setEscenario(Escenario escenario) {
        this.escenario = escenario;
    }

    public Jugador getJugador1() {
        return jugador1;
    }

    public Jugador getJugador2() {
        return jugador2;
    }

    public Escenario getEscenario() {
        return escenario;
    }

}
