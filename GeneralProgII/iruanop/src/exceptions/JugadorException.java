package exceptions;

/**
 *
 * @author Isabel Ruano <i.ruano1@usp.ceu.es>
 */
public class JugadorException extends Exception {

    private String error;

    public JugadorException(String error) {

        this.error = error;

    }

    @Override

    public String toString() {

        return this.error;
    }

}
