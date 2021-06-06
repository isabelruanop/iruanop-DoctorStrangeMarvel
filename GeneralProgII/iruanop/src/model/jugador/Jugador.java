package model.jugador;

import model.partida.Partida;

/**
 *
 * @author Isabel Ruano <i.ruano1@usp.ceu.es>
 */
public class Jugador {

    private int numeroMiembros;
    private String alias;
    private int monedas;
    private CentroMando CentroMando;
    private Organizaciones organizacion;
    private Partida partida;
    private int anadirMonedas;

    public void setMonedas(int monedas) {
        this.monedas = monedas;
    }

    public void setAnadirMonedas(int anadirMonedas) {
        this.anadirMonedas = anadirMonedas;
    }

    public int getMonedas() {
        return monedas;
    }

    public int getAnadirMonedas() {
        return anadirMonedas;
    }

    public Jugador(String alias, Organizaciones organizacion) {
        this.numeroMiembros = numeroMiembros;
        this.alias = alias;
        this.monedas = monedas;
        this.CentroMando = CentroMando;
        this.anadirMonedas = anadirMonedas;
    }

    public int getNumeroMiembros() {
        return numeroMiembros;
    }

    public String getAlias() {
        return alias;
    }

    public int getMoneadas() {
        return monedas;
    }

    public CentroMando getCentroMando() {
        return CentroMando;
    }

    public Organizaciones getOrganizacion() {
        return organizacion;
    }

    public void setNumeroMiembros(int numeroMiembros) {
        this.numeroMiembros = numeroMiembros;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public void setMoneadas(int moneadas) {
        this.monedas = moneadas;
    }

    public void setCentroMando(CentroMando CentroMando) {
        this.CentroMando = CentroMando;
    }

    public void setOrganizacion(Organizaciones organizacion) {
        this.organizacion = organizacion;
    }

    public void anadirMonedas(int monedas) {

    }

}
