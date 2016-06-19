package entity;

import java.util.UUID;

/**
 * Created by Kevin Khanda on 6/19/2016.
 * Entity that we will extract from DataBase.
 * Won't use annotations JPA and Hibernate here, because they will slow down performance.
 * Maybe we will use ORM later. Depends on DataBase.
 */

public class Data implements DomainObject {
    private UUID id;
    private String description;

    public Data (UUID id, String description) {
        this.id = id;
        this.description = description;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
