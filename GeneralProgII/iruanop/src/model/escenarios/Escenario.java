package model.escenarios;

/**
 *
 * @author Isabel Ruano <i.ruano1@usp.ceu.es>
 */
public class Escenario {

    //definicion de escenario (atributos)
    private int monedasIniciales;
    private int numeroMiembros;
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
