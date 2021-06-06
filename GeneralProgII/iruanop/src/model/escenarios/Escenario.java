package model.escenarios;

/**
 *
 * @author Isabel Ruano <i.ruano1@usp.ceu.es>
 */
public class Escenario {

    //definicion de escenario (atributos)
    private int monedasIniciales;
    private int numeroMiembros;
    private int monedas;

    public void setMonedas(int monedas) {
        this.monedas = monedas;
    }

    public int getMonedas() {
        return monedas;
    }

    public int getMonedasIniciales() {
        return monedasIniciales;
    }

    public int getNumeroMiembros() {
        return numeroMiembros;
    }

    public int getNumeroMovimientos() {
        return numeroMovimientos;
    }

    public int getEnergiaVital() {
        return energiaVital;
    }

    public void setMonedasIniciales(int monedasIniciales) {
        this.monedasIniciales = monedasIniciales;
    }

    public void setNumeroMiembros(int numeroMiembros) {
        this.numeroMiembros = numeroMiembros;
    }

    public void setNumeroMovimientos(int numeroMovimientos) {
        this.numeroMovimientos = numeroMovimientos;
    }

    public void setEnergiaVital(int energiaVital) {
        this.energiaVital = energiaVital;
    }
    private int numeroMovimientos;
    private int energiaVital;

    //inicializo creando los constructores
    public Escenario(int monedasIniciales, int numeroMiembros, int numeroMovimientos, int energiaVital) {
        //paso por parametros los atributos previamente definidos
        this.monedasIniciales = monedasIniciales;
        this.numeroMiembros = numeroMiembros;
        this.numeroMovimientos = numeroMovimientos;
        this.energiaVital = energiaVital;

    }

}
