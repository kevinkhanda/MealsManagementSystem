package entity;

import java.math.BigInteger;

/**
 * Created by Kevin Khanda on 7/23/2016.
 * Represent Event entity from database.
 */
public class Event implements DomainObject {

    private BigInteger id;
    private String name;

    public Event(BigInteger id, String name) {

        this.id = id;
        this.name = name;
    }

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
