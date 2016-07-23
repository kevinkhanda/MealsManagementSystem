package entity;

/**
 * Created by Kevin Khanda on 7/23/2016.
 * Represents Terminal entity from Database.
 */
public class Terminal implements DomainObject {

    private int id;
    private String name;
    private String sysIdentity;
    private String email;

    public Terminal(int id, String sysIdentity, String name, String email) {
        this.id = id;
        this.sysIdentity = sysIdentity;
        this.name = name;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSysIdentity() {
        return sysIdentity;
    }

    public void setSysIdentity(String sysIdentity) {
        this.sysIdentity = sysIdentity;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
