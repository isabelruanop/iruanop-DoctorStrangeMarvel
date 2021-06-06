package id;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Isabel Ruano <i.ruano1@usp.ceu.es>
 */
public class Id implements Serializable {

    private long id;

    public Id() {

        this.id = new Date().getTime();

    }

    public long getId() {

        return id;

    }

    @Override

    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + (int) (this.id ^ (this.id >>> 32));
        return hash;

    }

    @Override

    public boolean equals(Object obj) {

        if (obj != null && obj instanceof Id) {

            return (this.id == ((Id) obj).id);

        }

        return false;

    }

}
