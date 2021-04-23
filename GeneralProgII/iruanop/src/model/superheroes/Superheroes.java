package model.superheroes;

/**
 *
 * @author Isabel Ruano <i.ruano1@usp.ceu.es>
 */
public class Superheroes {

    private int identificador;
    private String alias;
    private String identidadSecreta;
    private int conjuntoMovimientos;
    private int parrillaPoderes;
    private int coste;
    private int recompensa;
    private int energiaVital;
    private int energiaLucha;
    private Origen origen;

    public Superheroes(int identificador, String alias, String identidadSecreta, int conjuntoMovimientos, int parrillaPoderes, int coste, int recompensa, int energiaVital, int energiaLucha, Origen origen) {
        this.identificador = identificador;
        this.alias = alias;
        this.identidadSecreta = identidadSecreta;
        this.conjuntoMovimientos = conjuntoMovimientos;
        this.parrillaPoderes = parrillaPoderes;
        this.coste = coste;
        this.recompensa = recompensa;
        this.energiaVital = energiaVital;
        this.energiaLucha = energiaLucha;
        this.origen = origen;
    }

}
