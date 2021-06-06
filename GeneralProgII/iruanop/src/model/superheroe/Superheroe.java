package model.superheroe;

import exceptions.MovimientoException;
import id.Id;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import model.jugador.Jugador;
import model.jugador.Organizaciones;
import model.movimientos.Movimiento;

/**
 *
 * @author Isabel Ruano <i.ruano1@usp.ceu.es>
 */
public class Superheroe extends Id implements Comparable<Superheroe> {

    public AliasSuperheroe nombre;
    private final String identidadSecreta;
    private int coste;
    private int recompensa;
    private ParrillaPoderes poderes; //
    private int enerVital;
    private int enerLucha;
    private final List<Movimiento> movimientos;
    private final Organizaciones organizacion;
    private Jugador j;

    public Superheroe(AliasSuperheroe nombre, String identidadSecreta, ParrillaPoderes poderes, Organizaciones organizacion) {

        this.nombre = nombre;
        this.identidadSecreta = identidadSecreta;
        this.coste = 0;
        this.recompensa = 0;
        this.poderes = poderes;
        this.enerVital = 0;
        this.enerLucha = 0;

        this.movimientos = new ArrayList();
        this.organizacion = organizacion;
        this.j = null;

    }

    /*
    Getters / Setters :
     */
    public AliasSuperheroe getNombreSuperheroe() {

        return this.nombre;
    }

    public int getCoste() {

        return this.coste;

    }

    public int getRecompensa() {

        return this.recompensa;

    }

    public ParrillaPoderes getParrillaPoderes() {

        return this.poderes;

    }

    public int getEnergiaVital() {

        return this.enerVital;

    }

    public int getEnergiaLucha() {

        return this.enerLucha;

    }

    public Organizaciones getOrganizacion() {

        return this.organizacion;

    }

    public Jugador getJugador() {

        return j;

    }

    public List<Movimiento> getMovimientos() {

        return movimientos;

    }

    public void setNombre(AliasSuperheroe nombre) {

        this.nombre = nombre;

    }

    public void setCoste(int coste) {

        this.coste = coste;

    }

    public void setRecompensa(int recompensa) {

        this.recompensa = recompensa;

    }

    public ParrillaPoderes getParrilla() {
        return this.poderes;
    }

    public void setJugador(Jugador j) {

        this.j = j;

    }

    public void añadirMovimiento(Movimiento movimiento) {

        this.movimientos.add(movimiento);

    }

    public String listarMovimientos(Superheroe sh) throws MovimientoException {

        String s = "";
        int q = 0;

        if (sh.movimientos.isEmpty() == true) {

            throw new MovimientoException(" Lista vacia ");

        } else {

            for (Movimiento m : this.movimientos) {

                s = s + "movimiento" + q + " " + m.getNombre();
                q++;

            }

        }

        return s;

    }

    public Movimiento ejecutarMovimiento(Movimiento mv, Superheroe oponente) throws MovimientoException {

        if (movimientos.contains(mv) && mv.getOponente().equals(this)) {

            int enerReal = mv.calcularEnergiaReal(mv);

            mv.setOponente(oponente);

            switch (mv.getTipoMovimiento()) {

                case ATAQUE:

                    if (this.enerLucha == 0) {

                        throw new MovimientoException(" Energia de ataque nula");

                    }

                    if (this.enerLucha >= enerReal) {

                        this.enerLucha = this.enerLucha - enerReal;
                        mv.setEnergiaReal(enerReal);

                    } else {

                        mv.setEnergiaReal(this.enerLucha);
                        this.enerLucha = 0;

                    }

                    break;

            }

            this.movimientos.remove(mv);

        } else {

            throw new MovimientoException("No disponible");

        }

        return mv;

    }

    public int decrementoEnergiaVital(int u) {

        if (this.enerVital > u) {

            this.enerVital = this.enerVital - u;
            return 0;

        } else {

            this.enerVital = 0;
            return this.recompensa;

        }

    }

    /**
     * Sobreescritura de metodos
     */
    @Override

    public String toString() {

        return "\n Nombre : " + this.nombre + "\n Coste : " + this.coste
                + "\n Recompensa al derrotarlo : " + this.recompensa
                + " \n Energia  vital : " + this.enerVital
                + "\n Energia de lucha : " + this.enerLucha;

    }

    @Override
    public boolean equals(Object o) {

        if (o == null) {

            return false;

        }

        if (!(o instanceof Jugador)) {

            return false;

        }

        if (((Superheroe) o).nombre == this.nombre) {

            return true;

        } else {

            return false;
        }

    }

    @Override

    public int hashCode() {

        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.nombre);
        return hash;

    }

    @Override
    public int compareTo(Superheroe shg) {

        if (this.enerVital < shg.enerVital) {

            return -1;

        } else {

            if (this.enerVital > shg.enerVital) {

                return 1;

            } else {

                return 0;
            }

        }

    }

}
