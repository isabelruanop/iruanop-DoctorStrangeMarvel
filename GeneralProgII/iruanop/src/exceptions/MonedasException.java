package exceptions;

/**
 *
 * @author Isabel Ruano <i.ruano1@usp.ceu.es>
 */
public class MonedasException extends Exception {

    private String error;

    public MonedasException(String error) {

        this.error = error;

    }

    @Override

    public String toString() {

        return this.error;
    }
}
