package model.superheroe;

/**
 *
 * @author Isabel Ruano <i.ruano1@usp.ceu.es>
 */
public class ParrillaPoderes {

    private int inteligencia;
    private int inteligenciaMax;
    private int inteligenciaMin;
    private int fuerza;
    private int fuerzaMax;
    private int fuerzaMin;
    private int velocidad;
    private int velocidadMax;
    private int velocidadMin;
    private int resistencia;
    private int resistenciaMax;
    private int resistenciaMin;
    private int proyeccionEnergia;
    private int proyeccionEnergiaMax;
    private int proyeccionEnergiaMin;
    private int habilidadesLucha;
    private int habilidadesLuchaMax;
    private int habilidadesLuchaMin;

    public ParrillaPoderes(int inteligenciaMax, int inteligenciaMin, int fuerzaMax, int fuerzaMin,
            int velocidadMax, int velocidadMin, int resistenciaMax, int resistenciaMin,
            int proyeccionEnergiaMax, int proyeccionEnergiaMin,
            int habilidadesLuchaMax, int habilidadesLuchaMin) {

        this.inteligenciaMax = inteligenciaMax;
        this.inteligenciaMin = inteligenciaMin;
        this.fuerzaMax = fuerzaMax;
        this.fuerzaMin = fuerzaMin;
        this.velocidadMax = velocidadMax;
        this.velocidadMin = velocidadMin;
        this.resistenciaMax = resistenciaMax;
        this.resistenciaMin = resistenciaMin;
        this.proyeccionEnergiaMax = proyeccionEnergiaMax;
        this.proyeccionEnergiaMin = proyeccionEnergiaMin;
        this.habilidadesLuchaMax = habilidadesLuchaMax;
        this.habilidadesLuchaMin = habilidadesLuchaMin;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    public void setProyeccionEnergia(int proyeccionEnergia) {
        this.proyeccionEnergia = proyeccionEnergia;
    }

    public void setHabilidadesLucha(int habilidadesLucha) {
        this.habilidadesLucha = habilidadesLucha;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public int getFuerza() {
        return fuerza;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public int getResistencia() {
        return resistencia;
    }

    public int getProyeccionEnergia() {
        return proyeccionEnergia;
    }

    public int getHabilidadesLucha() {
        return habilidadesLucha;
    }

    public void setInteligenciaMax(int inteligenciaMax) {
        this.inteligenciaMax = inteligenciaMax;
    }

    public void setInteligenciaMin(int inteligenciaMin) {
        this.inteligenciaMin = inteligenciaMin;
    }

    public void setFuerzaMax(int fuerzaMax) {
        this.fuerzaMax = fuerzaMax;
    }

    public void setFuerzaMin(int fuerzaMin) {
        this.fuerzaMin = fuerzaMin;
    }

    public void setVelocidadMax(int velocidadMax) {
        this.velocidadMax = velocidadMax;
    }

    public void setVelocidadMin(int velocidadMin) {
        this.velocidadMin = velocidadMin;
    }

    public void setResistenciaMax(int resistenciaMax) {
        this.resistenciaMax = resistenciaMax;
    }

    public void setResistenciaMin(int resistenciaMin) {
        this.resistenciaMin = resistenciaMin;
    }

    public void setProyeccionEnergiaMax(int proyeccionEnergiaMax) {
        this.proyeccionEnergiaMax = proyeccionEnergiaMax;
    }

    public void setProyeccionEnergiaMin(int proyeccionEnergiaMin) {
        this.proyeccionEnergiaMin = proyeccionEnergiaMin;
    }

    public void setHabilidadesLuchaMax(int hablilidadesLuchaMax) {
        this.habilidadesLuchaMax = hablilidadesLuchaMax;
    }

    public void setHabilidadesLuchaMin(int habilidadesLuchaMin) {
        this.habilidadesLuchaMin = habilidadesLuchaMin;
    }

}
