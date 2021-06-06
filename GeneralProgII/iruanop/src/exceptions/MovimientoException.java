package exceptions;

/**
 *
 * @author Isabel Ruano <i.ruano1@usp.ceu.es>
 */
public class MovimientoException extends Exception {

    private String error;

    public MovimientoException(String error) {

        this.error = error;

    }

    @Override

    public String toString() {

        return this.error;
    }

}
