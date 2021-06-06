package exceptions;

/**
 *
 * @author Isabel Ruano <i.ruano1@usp.ceu.es>
 */
public class SuperheroeException extends Exception {

    private String error;

    public SuperheroeException(String error) {

        this.error = error;

    }

    @Override

    public String toString() {

        return this.error;
    }
}
