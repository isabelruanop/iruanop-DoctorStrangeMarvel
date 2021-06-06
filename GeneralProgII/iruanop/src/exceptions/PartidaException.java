package exceptions;

/**
 *
 * @author Isabel Ruano <i.ruano1@usp.ceu.es>
 */
public class PartidaException extends Exception {

    private String error;

    public PartidaException(String error) {

        this.error = error;

    }

    @Override

    public String toString() {

        return this.error;
    }
}
