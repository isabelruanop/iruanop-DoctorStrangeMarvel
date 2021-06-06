package exceptions;

/**
 *
 * @author Isabel Ruano <i.ruano1@usp.ceu.es>
 */
public class DatoIncorrectoException extends Exception {

    private String error;

    public DatoIncorrectoException(String error) {

        this.error = error;

    }

    @Override

    public String toString() {

        return this.error;
    }
}
